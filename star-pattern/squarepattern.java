import java.util.Scanner;

public class squarepattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of squares");
        int n = input.nextInt();
        for(int i = 0; i<n ;i++){
            for(int j = 0 ;i<n;j++){
                System.out.println("* ");
            }
            System.out.print(" ");
        }
    }
}
