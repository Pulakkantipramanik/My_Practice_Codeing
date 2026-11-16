package hashset;

import java.util.HashSet;

public class removeduplicate {
    public static void main(String[] args) {
        int arr [] = { 1, 2 , 4 , 5 ,5, 2 ,6};
        HashSet<Integer> list = new HashSet<Integer>();
        for(int fetch : arr){
            list.add(fetch);

        }
        System.out.println(list);
    }
}
