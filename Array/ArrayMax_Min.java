public class ArrayMax_Min {

    public static void main(String[] args) {
 /*       int arr [] ={ 34,66,123,39,2,3987};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Maximam Number is "+ max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimam Number is " + min);*/
        int arr [] = { 827,13,292,2,3,98928,89};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximam Number is  "+ max);

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("Minimam Number is "+ min );
    }
}
