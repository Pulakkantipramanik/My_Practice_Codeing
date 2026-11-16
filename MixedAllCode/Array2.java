import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int a [] = { 1, 2,3 , 4 ,8,19 ,8,2};
        for (int b: a){
            System.out.println(b);
        }
        System.out.println("reverse array :");
        for (int i = 0; i <a.length-1 ; i++) {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
