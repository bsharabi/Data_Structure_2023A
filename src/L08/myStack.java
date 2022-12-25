package L08;

import java.util.Arrays;

public class myStack<E> {

    public static final int DEFAULT_CAPACITY = 10;
    private Object[] arr;
    private int index = 0;

    public myStack() {
        this.arr = new Object[DEFAULT_CAPACITY];
    }

    public myStack(int initialCapacity) throws Exception {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        else if (initialCapacity == 0)
            arr = new Object[DEFAULT_CAPACITY];
        else arr = new Object[initialCapacity];
    }

    public E pop() throws Exception {
        if (index == 0)
            throw new Exception();
        E data = (E) arr[--index];
        return data;
    }

    public E peek() throws Exception {
        if (index == 0)
            throw new Exception();
        E data = (E) arr[index - 1];
        return data;
    }

    public boolean empty() {
        return index == 0;
    }

    public E push(E item) throws Exception {
        if (index == arr.length)
            throw new Exception();
        arr[index++] = item;
        return item;
    }

    @Override
    public String toString() {
        Arrays.toString(arr);
        String str = "[";
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                str += arr[i] ;
                break;
            }
            str += arr[i] + ", ";
        }
        str += "]";

        return str;
    }
}
