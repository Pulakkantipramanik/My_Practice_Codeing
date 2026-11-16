import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int r =n+1;
        int totalsum=r*(r+1)/2;
        int actualsum=0;
        for (int i = 0; i < arr.length; i++) {
            actualsum += arr[i];
        }
        System.out.println("Missing number is : "+ (totalsum-actualsum));

    }
}
