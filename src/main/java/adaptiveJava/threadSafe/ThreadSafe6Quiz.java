package adaptiveJava.threadSafe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Vladimir Glinskikh on 10.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ThreadSafe6Quiz {
    public static class ThreadSafe6 {
        private final Map<String, String> data = new ConcurrentHashMap<>();

        public void putIfAbsent(final String key, final String value) {
            data.putIfAbsent(key, value);
        }
    }
}
