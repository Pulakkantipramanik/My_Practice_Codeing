public class SumofArray {
//    public static void main(String[] args) {
//        int arr[] = {1,2,4,3};
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//
//        }
//        System.out.println(sum);
//    }
    public  int sum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumofArray obj = new SumofArray();
       int ans=  obj.sum(new int[]{1,2,3,4,5});
        System.out.println(ans);

    }
}
