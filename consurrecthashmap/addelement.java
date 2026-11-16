package consurrecthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class addelement {
    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("Sourav", 10);
        map.put("Viren", 20);
        map.put(2, 30);
        map.put("king","queen");
        System.out.println(map);
        System.out.println("=========================================");
        ConcurrentHashMap<Integer , String> map2 = new ConcurrentHashMap();
        map2.put(1, "Ram");
        map2.put(2, "Shyam");
        System.out.println(map2);
    }
}
