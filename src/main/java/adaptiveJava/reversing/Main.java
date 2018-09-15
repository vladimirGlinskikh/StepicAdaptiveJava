package adaptiveJava.reversing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, reverse = 0, rem;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number != 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
