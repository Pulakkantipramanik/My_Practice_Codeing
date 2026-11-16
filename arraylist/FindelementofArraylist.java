import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindelementofArraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("size of arraylist:");
        int n=input.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("enter elements of arraylist:");
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        System.out.print("your arraylist is:");
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)==5){
                System.out.println("find element is "+list.get(i));
            }
        }

        Collections.reverse(list);
        System.out.println("your reversed arraylist is:"+list);

    }
}
