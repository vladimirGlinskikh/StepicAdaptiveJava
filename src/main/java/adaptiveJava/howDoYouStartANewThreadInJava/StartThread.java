package adaptiveJava.howDoYouStartANewThreadInJava;

public class StartThread {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Started")).start();
    }
}
