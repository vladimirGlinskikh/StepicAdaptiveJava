package adaptiveJava.deliciousPie;

import java.util.Scanner;

public class Main {
    private static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(nok(a, b));
    }
}
