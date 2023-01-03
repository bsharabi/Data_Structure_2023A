package L09;

import java.util.Arrays;

public class MyQueue_<E> {

    public static final int DEFAULT_CAPACITY = 10;
    private Object[] qArray;

    private int size;// count of item in the qArray
    private int capacity;// like qArray.len

    private int indexToInsert = 0;
    private int indexToRemove = 0;

    public MyQueue_() {
        qArray = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public MyQueue_(int initialCapacity) throws Exception {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        else if (initialCapacity == 0) {
            qArray = new Object[DEFAULT_CAPACITY];
            capacity = DEFAULT_CAPACITY;
        } else {
            qArray = new Object[initialCapacity];
            capacity = initialCapacity;
        }
    }

    public boolean add(E o) {
        if (size == capacity)
            return false;
        qArray[indexToInsert] = o;
        indexToInsert = indexToInsert + 1;
        indexToInsert %= capacity;
        size++;
        return true;
    }

    public E poll() throws Exception {
        if (size == 0)
            throw new Exception("");
        E item = (E) qArray[indexToRemove];
        qArray[indexToRemove]=null;
        indexToRemove = (indexToRemove + 1)%capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() throws Exception {
        if (isEmpty())
            return null;
        E item = (E) qArray[indexToRemove];
        return item;
    }

    public int capacity(){
        return capacity;
    }
    @Override
    public String toString() {
        return Arrays.toString(qArray);
    }
}