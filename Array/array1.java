import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        String str[] = {"Amit ", "Bador"};
        Boolean b[]= {false,true};
        for (int a : arr){
            System.out.println(a);
        }
        System.out.println( "     ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(str));
        int  [] c = new int[4];
         c[0]= 10;
        c[1]=20;
        System.out.println(c[0]);


    }
}
