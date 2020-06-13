package adaptiveJava.listIteratorSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list;
        list = new ArrayList(Arrays.asList(reader.readLine().split(" ")));

        Collections.reverse(list);
        ListIterator<String> listiterator = list.listIterator();

        while (listiterator.hasNext()) {
            String element = listiterator.next();
            if (!element.startsWith("J")) {
                listiterator.remove();
            } else {
                element = element.substring(1);
                System.out.println(element);
            }
        }
    }
}
