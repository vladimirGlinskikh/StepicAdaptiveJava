package adaptiveJava.threadSafe;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 09.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int year = Integer.parseInt(new Date().toString().split(" ")[5]) - scan.nextInt() + 98;
        System.out.printf("%s, You will be 100 years old in %d year.", name, year);
    }
}
