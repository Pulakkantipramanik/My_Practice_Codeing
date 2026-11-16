package consurrecthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class Onlyaddwhenkeydoesnotexit {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"Pulak");
        map.put(2,"Shyam");
        map.put(3,"Ram");
        map.computeIfAbsent(4,key ->"Anu");
        map.computeIfPresent(1,(key ,old) -> "Kanti");
        System.out.println(map);
    }
}
