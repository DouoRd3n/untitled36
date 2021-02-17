import com.sun.source.tree.WhileLoopTree;

import java.util.Map;

public class MapTest<S, V> {
    private Noda<S, V> first;
    private Noda<S, V> last;
    private int size;

    public void put(S s, V v) {
        if (first == null) {
            first = firstNoda(s, v);
            size++;
        } else if (last == null) {
            last = lastNoda(s, v);
            first.setNext(last);
            size++;
        } else {
            setNewNoda(s, v);

        }
    }

    private void setNewNoda(S s, V v) {

        last.setNext(new Noda<S, V>(last, s, v, null));
        last = last.getNext();
        size++;
    }

    public void remove(S s){
        Noda<S,V> noda = getNoda(s);
        Noda<S,V> nodaPrev = noda.getPrev();
        Noda<S,V> nodaNext =noda.getNext();
        nodaPrev.setNext(nodaNext);
        nodaNext.setPrev(nodaPrev);

    }



    public V get(S s) {
        Noda<S,V> start = getNoda(s);

        return start.getValue();
    }

    private Noda<S,V> getNoda(S s) {
        Noda<S, V> start = first;
        Key<S> key = new Key<>(s);
        int codeNext = start.getKey().getHash();
        int codeKey = key.getHash();
        while (true) {
            if (codeNext != codeKey) {
                start = start.getNext();
                codeNext = start.getKey().getHash();
            } else {

                break;
            }


        } return start;
    }

    private Noda<S, V> lastNoda(S s, V v) {
        return new Noda<S, V>(first, s, v, null);
    }

    private Noda<S, V> firstNoda(S s, V v) {
        return new Noda<S, V>(null, s, v, null);
    }
}
