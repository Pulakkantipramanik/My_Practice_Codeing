import java.util.Scanner;

public class FindtheSmallest {
    public static void main(String[] args) {

        int[] arr = {74,717,9324,3,45};
        int small= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>small){
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
