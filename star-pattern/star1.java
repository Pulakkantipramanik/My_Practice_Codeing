import java.util.Scanner;

public class star1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of pattern column and row size");
        int m = sc.nextInt(); // row
        int n = sc.nextInt();// column 
//        ****
//        ****
//        ****
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println("  ");
//        }


//                ******
//                *    *
//                *    *
//                *    *
//                *    *
//                ******
//        for (int i = 1; i <=m ; i++) {
//            for (int j = 1; j <=n ; j++) {
//               if (i == 1 || j ==1 || i==m || j==n){
//                   System.out.print("*");
//               }
//               else {
//                   System.out.print(" ");
//               }
//            }
//            System.out.println();
//        }

//*
//**
//***
//****
//*****
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println("  ");
//        }


//*****
//****
//***
//**
//*
//        for (int i = m; i >=0; i--) {  // outer look , bairer kota line print hobe seta contoll kore
//            for (int j = 1; j <=i; j++) {  // inner loop proti ta line a kota * hobe seta print kore
//                System.out.print("*");
//
//            }
//            System.out.println("  ");
//        }

        for (int i = m; i <=m; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }


}
