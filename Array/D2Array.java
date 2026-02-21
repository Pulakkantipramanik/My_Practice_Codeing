import java.util.Scanner;

public class D2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  row and column ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("enter a matrix elemment");
        int xy[][] = new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                xy[i][j]=sc.nextInt();
            }
        }
//            output
        System.out.println("find this number  ");
        int x=sc.nextInt();
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (xy[i][j] == x) {


                    System.out.print("x found in " + i + " "+ j);
                }
            }
            System.out.println();
        }
    }
}
