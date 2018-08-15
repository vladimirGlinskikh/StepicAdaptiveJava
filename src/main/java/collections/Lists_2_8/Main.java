package collections.Lists_2_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }
        delList.removeAll(delList.subList(0, 10));
        System.out.println(delList);
    }
}
