public class arraysum {
    public static void main(String[] args) {
        int a [] = { 1,2,3,4,5,6};
        int b [] ={ 2,3,4};
        int c [] ={ 57,56,67};
        int d [] = { 70 ,71, 80};
        int e [] = { 90 , 91 , 92 };
                int sum = 0;
                int sum1=0;
        for (int i = 0; i < a.length; i++) {
             sum = sum + a[i];
        }
        for (int x : b){
            sum1=sum1 + x;
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
