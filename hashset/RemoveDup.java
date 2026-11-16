package hashset;

import java.util.HashSet;

public class RemoveDup {
    public static void main(String[] args) {
        int arr[] = { 6,1, 2,4, 3, 2, 1,5};
        HashSet<Integer> set = new HashSet<Integer>();
        for (int list : arr){
            set.add(list);
        }
        System.out.println(set);
    }
}
