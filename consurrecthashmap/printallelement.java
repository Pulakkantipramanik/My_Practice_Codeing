package consurrecthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class printallelement {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.replace("1", "z");
        System.out.println(map);
        for(String s : map.keySet()){
            System.out.print(s +"="+ map.get(s)+" ");
        }
    }
}
