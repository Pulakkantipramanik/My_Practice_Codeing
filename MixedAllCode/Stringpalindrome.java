import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String  str=sc.next();
        String original_str = str;
        String rev ="";
        for (int i = str.length()-1; i >=0  ; i--) {
            rev = rev+ str.charAt(i);
        }
        if (original_str.equals(rev)){
            System.out.println(" It is a Palindrome ");
        }
        else  {
            System.out.println("It is not a palindrome ");
        }

    }
}
