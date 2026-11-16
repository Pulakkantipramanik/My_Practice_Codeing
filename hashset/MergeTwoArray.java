package hashset;

import java.util.HashSet;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4,5 ,9 };
        int brr[] = { 7 ,3 ,1 };
        HashSet<Integer> set = new HashSet<Integer>();
        for(int firstarray : arr){
            set.add(firstarray);
        }
        for(int secondarray : brr){
            set.add(secondarray);
        }
        System.out.println(set);
    }
}
