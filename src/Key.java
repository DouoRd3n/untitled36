import java.util.Objects;

public class Key<S> {
   private int hash;
   private S key;

    public Key(S value) {

        this.key = value;
        this.hash = hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key<?> key = (Key<?>) o;
        return hash == key.hash && key.equals(key.key);
    }

    public int getHash() {
        return hash;
    }

    @Override
    public int hashCode() {

        return 31*key.toString().length()*(int)key.toString().charAt(0);
    }
}
