package L09;

public class MyQueue<E> {

    public static final int DEFAULT_CAPACITY = 10;

    private Object[] arrayOfObjects;
    private int countOfItemInQueue = 0;
    private int sizeOfObjectArray;
    private int indexForNextItem = 0;

    public MyQueue() {
        arrayOfObjects = new Object[DEFAULT_CAPACITY];
        sizeOfObjectArray = DEFAULT_CAPACITY;
    }

    public MyQueue(int initialCapacity) throws Exception {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        else if (initialCapacity == 0) {
            arrayOfObjects = new Object[DEFAULT_CAPACITY];
            sizeOfObjectArray = DEFAULT_CAPACITY;
        } else {
            arrayOfObjects = new Object[initialCapacity];
            sizeOfObjectArray = initialCapacity;
        }
    }

    public boolean add(E o) {
        if (countOfItemInQueue == sizeOfObjectArray)
            return false;

        arrayOfObjects[indexForNextItem] = o;
        indexForNextItem = (indexForNextItem + 1) % sizeOfObjectArray;
        countOfItemInQueue++;
        return true;
    }

    public E poll() throws Exception {
        if (isEmpty())
            throw new Exception();

        int next = (indexForNextItem - countOfItemInQueue + sizeOfObjectArray) % sizeOfObjectArray;
        countOfItemInQueue--;

        return (E) arrayOfObjects[next];
    }

    public boolean isEmpty() {
        return countOfItemInQueue == 0;
    }

    public E peek() throws Exception {
        if (isEmpty())
            throw new Exception();
        int next = (indexForNextItem - countOfItemInQueue + sizeOfObjectArray) % sizeOfObjectArray;
        return (E) arrayOfObjects[next];
    }
}
