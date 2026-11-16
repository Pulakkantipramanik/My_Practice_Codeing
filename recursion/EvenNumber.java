import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a array: ");
        int n = input.nextInt();

        int arr[] =new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int count = 0;
        System.out.println("Enter the numbers in the array: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("given array even count is "+ count);

    }
}
