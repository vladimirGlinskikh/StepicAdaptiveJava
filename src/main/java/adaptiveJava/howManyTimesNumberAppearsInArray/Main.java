package adaptiveJava.howManyTimesNumberAppearsInArray;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Vladimir Glinskikh on 13.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

    }

    private static long getCount(String s, int i) {
        return Stream.of(s.split(" ")).map(Integer::valueOf).filter(e -> e == i).count();
    }
}
