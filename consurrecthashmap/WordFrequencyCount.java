package consurrecthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class WordFrequencyCount {
    public static void main(String[] args) {
        String str = "java is very easy language , java more secure ";
        String[] words = str.split(" ");
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        for(String fetch : words){
            map.put(fetch,map.getOrDefault(fetch,0)+1);
        }
        System.out.println(map);
    }
}
