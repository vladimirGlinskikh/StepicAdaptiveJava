package adaptiveJava.replaceSpacesInTheString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String symbol = replaceSymbol(line);
        System.out.println(symbol);
    }

    static String replaceSymbol(String str) {
        String words = str.replaceAll("\\s+", "_");
        return words;
    }
}
