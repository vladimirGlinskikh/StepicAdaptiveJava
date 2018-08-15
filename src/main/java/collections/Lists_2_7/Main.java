package collections.Lists_2_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        Object[] strArray = nameList.toArray();

        for (int i = 0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}
