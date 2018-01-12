package primitiveTypes;

import java.util.Objects;

/**
 * Created by Vladimir Glinskikh on 28.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class MainThree {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        assert (mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        assert (mustAlsoBeTrue);
    }
}

class Pair<K, E> {

    private K k;
    private E e;

    private Pair(K k, E e) {
        this.k = k;
        this.e = e;
    }

    public K getFirst() {
        return k;
    }

    public E getSecond() {
        return e;
    }

    public static <K, E> Pair<K, E> of(K k, E e) {
        return new Pair<>(k, e);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(k, pair.k) &&
                Objects.equals(e, pair.e);
    }

    @Override
    public int hashCode() {

        return Objects.hash(k, e);
    }
}
