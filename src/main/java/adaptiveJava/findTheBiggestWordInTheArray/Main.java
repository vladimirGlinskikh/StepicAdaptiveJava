package adaptiveJava.findTheBiggestWordInTheArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String maxWord = max(line);
        System.out.println(maxWord);
    }

    static String max(String str) {
        String[] words = str.split(" ");
        String line = "";
        for (String word : words) {
            if (word.length() > line.length())
                line = word;
        }
        return (line);
    }
}
