public class FindLargest {
    public static void main(String[] args) {
        int arr[] ={ 76 , 987 , 7, 9};
        int big = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);

    }
}
