package adaptiveJava.howManyTimesNumberAppearsInArray;

import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 14.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class MainFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите массив чисел: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("вставляем массив элементов: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("ввыводим на экран: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        System.out.println(

        );
    }
}
