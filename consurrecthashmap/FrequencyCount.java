package consurrecthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String[] arr = {"a","a","b","c","d","e","a","b","c","d","e"};

        ConcurrentHashMap<String ,Integer> map = new ConcurrentHashMap<>();
//        for(String fetch : arr){
//            map.merge(fetch,1,Integer::sum);
//        }
//
//        System.out.println(map);
        for(String fetch : arr){
            int count = map.getOrDefault(fetch,0);
            map.put(fetch,count+1);
        }
        System.out.println(map);
    }

}
