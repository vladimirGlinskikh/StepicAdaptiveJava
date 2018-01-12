package adaptiveJava.division;

import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 12.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x;
        x = input.nextDouble();
        if (x % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
