package adaptiveJava.makeTheFollowingCodeThreadSafe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Vladimir Glinskikh on 31.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ThreadSafe4Quiz {
    public static class TreadSafe4 {
        private List<String> recipe = new ArrayList<>();
        private final Lock lock = new ReentrantLock();

        public void add(final String ingredient) {
            lock.lock();
            try {
                recipe.add(ingredient);
            } finally {
                lock.unlock();
            }
        }
    }
}
