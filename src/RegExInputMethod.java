import java.util.Scanner;

    /**
     *
     * @author Tom Wulf Tom.Wulf@uc.edu
     */
    public class RegExInputMethod
    {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String SSN = "";
            String UCNum = "";
            String PhoneNum = "";

            // Note that the \\ in the patterns is a java thing,  Normally just a single \

            String SSN_RegEx = "^\\d{3}-\\d{2}-\\d{4}$";     // ###-##-####
            String UCNum_RegEx = "^(M|m)\\d{6}$";           // M###### or m######
            String phoneNum_RegEx = "^\\d{3}-\\d{3}-\\d{4}$";      // ###-###-####

            SSN = getRegExString(in, "Enter your SSN", SSN_RegEx);
            UCNum = getRegExString(in, "Enter your UC ID Num", UCNum_RegEx);
            SSN = getRegExString(in, "Enter your phone number", phoneNum_RegEx);
        }
        public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
        {
            String value = "";
            boolean gotAValue = false;

            do
            {
                // show the prompt
                System.out.print(prompt + ": ");
                // input the data
                value = pipe.nextLine();
                // test to see if it is correct
                if(value.matches(regExPattern))
                {
                    // We have a match this String passes!
                    gotAValue = true;
                }
                else
                {
                    System.out.println("\nInvalid input: " + value);
                }

            }while(!gotAValue);

            return value;
        }

    }

