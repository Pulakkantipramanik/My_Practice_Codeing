import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("e");
        list.add("a");

        System.out.println("before removing duplicate elements"+list);
//        HashSet<String> set = new HashSet<String>(list);
//        System.out.println("after removing duplicate elements"+set);
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1 ; j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);

                }
            }

        }
        System.out.println("after removing duplicate elements"+list);

    }
}
