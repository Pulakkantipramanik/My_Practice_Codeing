public class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 1,2,4,6};
        int higest = Integer.MIN_VALUE;
        int secondhigest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
          if(  arr[i] > higest){
              secondhigest = higest;
              higest=arr[i];
          } else if (arr[i]> secondhigest && arr[i]!=higest) {
              arr[i] = secondhigest;
          }
        }
        System.out.println("The  largest element is "+higest);
        System.out.println("The second largest element is "+secondhigest);
    }
}
