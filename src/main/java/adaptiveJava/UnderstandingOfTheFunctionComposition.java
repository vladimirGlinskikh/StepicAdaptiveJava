package adaptiveJava;

import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

public class UnderstandingOfTheFunctionComposition {

    public static void main(String[] args) {
//        IntUnaryOperator mult2 = num -> num * 2;
//        IntUnaryOperator add3 = num -> num + 3;
//
//        IntUnaryOperator combinedOperator = add3.compose(mult2.andThen(add3)).andThen(mult2);
//        int result = combinedOperator.applyAsInt(5);
//        System.out.println(result);

        Consumer<Integer> printer = System.out::println;
        Consumer<Integer> devNull = (val) -> {int v = val * 2;};

        Consumer<Integer> combinedConsumer = devNull.andThen(devNull.andThen(printer));
        combinedConsumer.accept(100);
    }
}
