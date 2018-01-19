package adaptiveJava.howManyTimesNumberAppearsInArray;

import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 13.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        int y = new Scanner(System.in).nextInt();
        int array[] = {10, 1, 9, 9, 13, 7, 0};
        int x = array.length;

        System.out.println(countNumber(array, x, y));
    }

    public static int countNumber(int array[], int x, int y) {
        int result = 0;
        for (int i = 0; i < x; i++) {
            if (y == array[i])
                result++;
        }
        return result;
    }
}
