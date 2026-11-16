import java.util.*;

public class SecoundMaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        Optional<Integer> smax = list.stream().distinct()
                .sorted((a,b) -> b -a).skip(1).findFirst();

        if(smax.isPresent()){
            System.out.println("Second max is "+smax.get());
        } else{
            System.out.println("no second max ");
        }

    }
}
