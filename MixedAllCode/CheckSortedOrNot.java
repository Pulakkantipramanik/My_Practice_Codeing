import java.util.Arrays;

public class CheckSortedOrNot {
    public static void main(String[] args) {
        int arr[] = { 1,2,7,8,3};
       int  arrsort[] = arr.clone();
       Arrays.sort(arr);
        if (Arrays.equals(arr,arrsort)) {
            System.out.println("Sorted Array");

        } else {
            System.out.println("Not Sorted Array");
        }
    }
}
