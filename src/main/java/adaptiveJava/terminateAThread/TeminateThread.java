package adaptiveJava.terminateAThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vladimir Glinskikh on 01.02.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class TeminateThread {
    public static void main(String[] args) throws Exception {
        final Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Running");
                    TimeUnit.SECONDS.sleep(1);
                } catch (final InterruptedException ex) {
                    break;
                }
            }
            System.out.println("Terminated");
        });
        thread.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Terminate a thread");
        thread.interrupt();
    }
}
