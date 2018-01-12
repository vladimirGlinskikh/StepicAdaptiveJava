package adaptiveJava.aLeapYearOrNot;

import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 09.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        a = input.nextDouble();
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}

