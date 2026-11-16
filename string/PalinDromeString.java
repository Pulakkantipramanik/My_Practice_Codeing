import java.util.Scanner;

public class PalinDromeString {
    public static void main(String[] args) {
        /*String str = "Pulak";
        String strlow=str.toLowerCase();
        String rev = new StringBuilder(strlow).reverse().toString();
        if (strlow.equals(rev)){
            System.out.println(str +" is a palindrome . Output is a "+rev);
        }
       else {
            System.out.println(str+" not a palindrome. . Output is a  "+rev);
        } */
  boolean result = isPalindrome();
  if(result){
      System.out.println("palindrome");
  }
  else {
      System.out.println("not a plaindrome");
  }
    }
         static boolean isPalindrome(){
             String str = "level";
             int left=0;
             int right =str.length()-1;
             while (left<right){
               if( str.charAt(left) != str.charAt(right)){
                   return false;
               }
               left ++;
               right --;
             }
             return true ;

        }
    }

