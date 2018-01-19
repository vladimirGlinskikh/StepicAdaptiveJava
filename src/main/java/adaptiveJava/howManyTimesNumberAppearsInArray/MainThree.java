package adaptiveJava.howManyTimesNumberAppearsInArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 13.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class MainThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int numbers[] = new int[a];
        //int[] numbers = { 1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
        Arrays.sort(numbers);

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] == numbers[i - 1]) {
                System.out.println("Duplicate: " + numbers[i]);
            }
        }
    }
}
