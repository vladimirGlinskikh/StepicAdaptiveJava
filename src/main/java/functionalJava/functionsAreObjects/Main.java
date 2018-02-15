package functionalJava.functionsAreObjects;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by Vladimir Glinskikh on 31.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        IntSummaryStatistics statistics = IntStream.rangeClosed(1, 55555).summaryStatistics();

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Min: " + statistics.getMin());
        System.out.println("Avg: " + statistics.getAverage());
    }
}
