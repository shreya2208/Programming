package Arrays;

    import java.util.*;
    public class Palindrome
    {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word:");
            String s = sc.nextLine();

            StringBuffer str = new StringBuffer(s);
            int i, flag = 0;

            for(i=0; i<str.length(); i++)
                if(!(Character.isLetter(str.charAt(i))))
                    flag = 1;

            if(flag == 0)
            {
                String strRev = str.reverse().toString();
                if(s.equalsIgnoreCase(strRev))
                    System.out.println(s+" is a Palindrome");
                else
                    System.out.println(s+" is not a Palindrome");
            }
            else
                System.out.println("Invalid Input");
        }
    }

