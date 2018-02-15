package adaptiveJava.findTheSumOfAllElementsOfTheSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;
        int x = 1;
        while (x != 0) {
            x = Integer.parseInt(reader.readLine());
            sum = sum + x;
        }
        System.out.println(sum - 1);


    /*
    On the input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
    The sequence ends with an integer 0, when reading which the program should end its work and output the length
    of the sequence (not counting the final 0).
    */
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int sum = 1;
//        int x = 1;
//        while (x != 0) {
//            x = Integer.parseInt(reader.readLine());
//            sum++;
//        }
//        System.out.println(sum - 2);
    }
}

