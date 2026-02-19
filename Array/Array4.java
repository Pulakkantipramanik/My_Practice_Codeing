import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any thing ");
        int a =sc.nextInt();
        int num[]=new int[a];
        for (int i = 0; i <a ; i++) {
             num[i]= sc.nextInt();

        }
        System.out.println("Find this number ");
        int x = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
           if (x==num[i]) {
               System.out.println("index is "+ i + "number of " +x);
           }
        }

    }
}
