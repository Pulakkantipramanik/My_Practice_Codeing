public class ArrayBigNumber {
    public static void main(String[] args) {
        int a [] = { 78,34,5674,2345667};
         int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max){
                max= a[i] ;
            }
        }
        System.out.println(max);
    }
}
