import java.util.Arrays;

public class MoveZeroAtLast {
    public static void main(String[] args) {
        int  arr[] = { 1, 0 , 3,0 ,8, 9};
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
