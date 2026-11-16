package hashmap;

import java.util.HashMap;

public class firstcode {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(1,"Pulak");
        map.put(2,"Sourav");
        map.put(3,"Tripathi");
        map.put(4,"Viren");
        map.put("queen","king");
        System.out.println(map.get(2));
        System.out.println(map);
        System.out.println("========================================");
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Sourav"));
        map.remove("Viren");
        System.out.println("after remove " +map);
    }
}
