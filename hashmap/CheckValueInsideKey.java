package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.*;



public class CheckValueInsideKey {

    public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("India","Pulak");
    map.put("UK","KANTI");

    for(Map.Entry<String,String> entry : map.entrySet()){
        if(entry.getValue().equals("Pulak")){
            System.out.println("Pulak value is present "+entry.getKey()+"  map");
        }
    }

    }
}
