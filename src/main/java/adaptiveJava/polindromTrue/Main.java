package adaptiveJava.polindromTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Vladimir","level"};
        Map<Boolean, List<String>> palindromeOrNoMap =
                Arrays.stream(words)
                .collect(Collectors.partitioningBy(a -> a.equals(new StringBuilder(a).reverse().toString())));
        System.out.println(palindromeOrNoMap);
    }
}
