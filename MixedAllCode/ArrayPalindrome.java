import java.util.Arrays;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int a[] = {1,2,1};
        int b[] = new int[a.length] ;
        for (int i = a.length-1, j =0; i >=0 ; i--, j++) {
             b[j]=a[i];
        }
        System.out.println("originial array "+ Arrays.toString(a));
        System.out.println("reverse array "+ Arrays.toString(b));
        if (Arrays.equals(a,b)){
            System.out.println(" palinedrome");
        }
        else {
            System.out.println(" not a palindrome ");
        }
    }
}
