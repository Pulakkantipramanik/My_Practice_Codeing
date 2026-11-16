import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int id = input.nextInt();
        System.out.println(compareFive(id));
    }
        static String compareFive ( int n){
            // code here
            if (n > 5) {
                return "Greater than 5";
            } else if (n < 5) {
                return "Less than 5";
            } else {
                return "Equal to 5";
            }
        }

}

