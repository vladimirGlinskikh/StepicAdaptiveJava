package adaptiveJava.customIntegerReducer;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class App {
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator =
            (seed, op) ->
                    (left, right) -> {
                        int accumulate = seed;
                        for (int element = left; element <= right; element++) {
                            accumulate = op.applyAsInt(accumulate, element);
                        }
                        return accumulate;
                    };

    public static final IntBinaryOperator sumOperator = reduceIntOperator.apply(0, (a, b) -> a + b);

    public static final IntBinaryOperator productOperator = reduceIntOperator.apply(1, (a, b) -> a * b);


    public static void main(String[] args) {
        System.out.println(sumOperator.applyAsInt(2, 4));
        System.out.println(productOperator.applyAsInt(1, 5));
    }
}
