package L12;

public class myQueueLL<E> {

    private LinkedList<E> ll;

    public myQueueLL() {
        this.ll = new LinkedList<>();
    }

    public boolean add(E o) {
        return ll.add(o);
    }

    public E poll() throws Exception {
        return ll.remove(0);
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }

    public E peek() throws Exception {
        return ll.get(0);
    }
}
