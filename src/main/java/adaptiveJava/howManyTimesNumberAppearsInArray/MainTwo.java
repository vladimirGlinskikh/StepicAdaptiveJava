package adaptiveJava.howManyTimesNumberAppearsInArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Vladimir Glinskikh on 13.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class MainTwo {
    public static void main(String[] args) {
        int count, i;
        int[] inputArray = new int[500];
        Map<Integer, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);

//        System.out.println("введите число: ");
        count = in.nextInt();
//        System.out.println("введите массив чисел: ");
        for (i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
        for (Integer val : inputArray) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
//        System.out.println("дубликаты: ");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}
