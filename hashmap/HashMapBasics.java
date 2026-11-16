package hashmap;

import java.util.HashMap;


public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> st = new HashMap<>();
        st.put("name ", 17);
        st.put("age" ,99);
        st.put("age",100);
        st.put("address",200);
        System.out.println(st);
        System.out.println("===================");
        System.out.println(st.get("age"));
        System.out.println("------------------------------------");
        for(String fetch : st.keySet() ){
            System.out.println(fetch+ " "+st.get(fetch));
        }

    }
}
