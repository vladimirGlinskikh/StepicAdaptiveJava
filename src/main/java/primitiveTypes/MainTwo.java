package primitiveTypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 27.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double db;
        double sum = 0.0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                db = scanner.nextDouble();
                sum += db;
            } else {
                scanner.next();
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6f", sum);
    }
}
