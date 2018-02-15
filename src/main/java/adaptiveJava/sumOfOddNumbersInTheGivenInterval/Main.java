package adaptiveJava.sumOfOddNumbersInTheGivenInterval;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        sumOfOddNumbersInRange(21, 30);
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
//        long i, sum = 0;
//
//        if (start % 2 == 0) {
//            start++;
//        }
//        for (i = start; i <= end; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);
//        return 0;

        return LongStream
                .range(start, end + 1)
                .filter(item -> item % 2 != 0)
                .sum();
    }
}
