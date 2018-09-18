package adaptiveJava.curryingFunctions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Operationable operationable = (x, y, z) -> x + y * y + z * z * z;
        int result = operationable.f(a, b, c);
        System.out.println(result);
    }

    interface Operationable{
        int f(int x, int y, int z);
    }
}
