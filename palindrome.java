import java.util.Scanner;

public class palindrome {

        static boolean checkingPalindrome(String str)
        {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
        public static void main(String[] args)
        {
            System.out.println("Write something to check: ");
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();

            if (checkingPalindrome(str))
                System.out.print("Yes! It's palindrome");
            else
                System.out.print("No , It's not palindrome");
        }
    }


