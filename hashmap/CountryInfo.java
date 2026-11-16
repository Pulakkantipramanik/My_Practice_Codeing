import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryInfo {
    public static void main(String[] args) {
        HashMap<String , Integer> countryinfo = new HashMap<>();
        countryinfo.put("USA", 30);
        countryinfo.put("India", 120);
        countryinfo.put("France", 40);
        System.out.println(countryinfo);
        countryinfo.put("USA", 50);
        System.out.println(countryinfo);
        if (countryinfo.containsKey("USA")) {
            System.out.println("USA is present");
        } else  {
            System.out.println("USA is not present");
        }
        System.out.println(countryinfo.get("USA")); // get the key
        System.out.println(countryinfo.get("Nepal")); // get the key value if exits

        for( Map.Entry<String, Integer> e :  countryinfo.entrySet())
            {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
                System.out.println("=========================================");
                System.out.println(e);
        }
        System.out.println("-----------------------------------------------");

        Set <String> keys =countryinfo.keySet();
        for (String key : keys) {
            System.out.println(countryinfo.get(key)+"  "+key);
        }
        countryinfo.remove("USA");
        System.out.println(countryinfo);
        System.out.println(countryinfo.size());
    }
}
