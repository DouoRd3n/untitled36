import java.util.Objects;

public class Noda<S, V> {


    private int hash;
    private Key<S> key;
    private V value;
    private Noda<S, V> next;
    private Noda<S, V> prev;

    public V getValue() {
        return value;
    }

    public Key<S> getKey() {
        return key;
    }

    public Noda<S, V> getNext() {
        return next;
    }

    public int getHash() {
        return hash;
    }

    public Noda(Noda<S, V> prev, S key, V value, Noda<S, V> next) {
        this.key = new Key<>(key);

        this.value = value;
        this.next = next;
        this.prev = prev;
        this.hash = hashCode();
    }

    public void setPrev(Noda<S, V> prev) {
        this.prev = prev;
    }

    public Noda<S, V> getPrev() {
        return prev;
    }

    public void setNext(Noda<S, V> next) {
        this.next = next;
    }
}
