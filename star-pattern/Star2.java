public class Star2 {
    public static void main(String[] args) {
        int n = 5;
                for (int i = 1; i <=n; i++) {// row
                    int num = i ;
                    System.out.print(num+" ");
            for (int j = 1; j <i; j++) {   // column
                num = num +(n-j);
                System.out.print(num+" ");

            }
            System.out.println();

        }

    }
}
//
//1
//2  6
//3  7  10
//4  8  11  13
//5  9  12  14   15

