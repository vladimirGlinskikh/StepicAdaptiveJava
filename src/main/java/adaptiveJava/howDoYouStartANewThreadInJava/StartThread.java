package adaptiveJava.howDoYouStartANewThreadInJava;

/**
 * Created by Vladimir Glinskikh on 11.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class StartThread {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Started")).start();
    }
}
