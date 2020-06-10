package adaptiveJava.digitalWatches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        String h = ((time / 60 / 60) % 24) + "";
        String min = ((time / 60) % 60) + "";
        String sec = time % 60 + "";
        if (min.length() < 2) {
            min = "0" + min;
        }
        if (sec.length() < 2) {
            sec = "0" + sec;
        }
        System.out.println(h + ":" + min + ":" + sec);
    }
}
