import java.util.ArrayList;
import java.util.Collections;

public class SumofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr.remove(2);
        int sum=0;
        for (int i = 0; i <arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println(sum);
      Collections.sort(arr);

        System.out.println("largest elements are : "+arr.get(arr.size()-1));
        int count =0;
        for (int i = 0; i < arr.size(); i++) if(arr.get(i)%2==0){
            count++;
        }
        System.out.println(count);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list);

    }
}
