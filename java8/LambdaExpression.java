import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        Function<Integer, Integer> add = (x) -> x + 1;
        System.out.println(add.apply(18));
        Predicate<Integer> isodd = (x) -> x % 2 != 0;
        System.out.println(isodd.test(13));
    }
}
