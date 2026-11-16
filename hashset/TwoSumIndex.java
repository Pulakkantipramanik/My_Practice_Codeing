package hashset;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumIndex {
    public static void main(String[] args) {
        int[] arr = {2, 11, 5, 4, 7, 15};
//        int target = 9;
//        for (int i = 0; i <arr.length-1 ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[i] + arr[j]==target) {
//                    System.out.println("first pair  "+ arr[i] + " " + arr[j]);
//
//                }
//            }
//    }
//        HashSet<Integer> set = new HashSet<Integer>();
//        for(int num : arr){
//            int complement  = target - num;
//            if(set.contains(complement )){
//                System.out.println(num + " " + complement );
//            }
//     set.add(num);
//        }
//
        HashMap<Integer, Integer> map = new HashMap<>();

        int target = 9;
        for(int i = 0; i < arr.length; i++){
            int tc = target - arr[i];

            if(map.containsKey(tc)){
                System.out.println(map.get(tc) + " " + i); // index print
            }

            map.put(arr[i], i); // ✅ key=সংখ্যা, value=index
        }

    }
}
