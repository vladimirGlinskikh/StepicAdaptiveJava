package adaptiveJava.exitTheMain2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Vladimir Glinskikh on 01.02.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ExitTheMain2 {
    private static final int POOL_SIZE = 50;

    public static void main(String[] args) throws Exception {
        final ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE, runnable -> {
            final Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        });
        for (int i = 0; i < POOL_SIZE; i++) {
            executor.submit(() -> System.out.printf("Running %s%n", Thread.currentThread().getName()));
        }
    }
}
