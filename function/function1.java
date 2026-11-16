import java.util.Scanner;

public class function1 {
//    public static String printMyName(String name){
//        System.out.println(name);
//        return name;
//    }
    public  static  int addsum(int a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in );
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println(addsum(a, b));

    }
}
