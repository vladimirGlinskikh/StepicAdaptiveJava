package functionalJava.parallelAndSequentialStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ParallelStreamExample {
    public static void main(String[] args) {
//        List<String> languages = Arrays.asList("Java", "Scala", "Kotlin", "Clojure", "C#");
//        List<String> jvmLanguages = languages.parallelStream()
//                .filter(lang -> !lang.equals("C#"))
//                .collect(Collectors.toList());
//        System.out.println(jvmLanguages);
        List<Integer> sortedNumbers = Arrays.asList(1, 3, 4, 9, 0, 5, 7, 6, 8, 2);
        sortedNumbers.stream()
                .map(Function.identity())
                .forEachOrdered(n -> System.out.println(n + " "));
    }
}
