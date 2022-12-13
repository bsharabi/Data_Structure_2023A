package L07;

import java.util.*;

public class MyArrayListTemp implements List {

    private static final int DEFAULT_CAPACITY = 10;

    private int[] arr;
    private int index = 0;

    //O(1)
    public MyArrayListTemp() {
        this.arr = new int[DEFAULT_CAPACITY];
    }

    //O(1)
    public MyArrayListTemp(int capacity) throws Exception {
        if (capacity < 0)
            throw new Exception();
        else if (capacity == 0)
            this.arr = new int[DEFAULT_CAPACITY];
        else
            this.arr = new int[capacity];
    }

    //O(n)
    public MyArrayListTemp(int capacity, int[] initArr) throws Exception {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        else if (capacity == 0)
            this.arr = new int[DEFAULT_CAPACITY];
        else
            this.arr = new int[capacity];
        if (initArr != null)
            for (int i = 0; i < initArr.length; i++)
                this.add(initArr[i]);
    }

    //O(n)
    public MyArrayListTemp(int[] initArr) {
        if (initArr == null)
            this.arr = new int[DEFAULT_CAPACITY];
        else {
            this.arr = new int[initArr.length * 2];
            for (int i = 0; i < initArr.length; i++)
                this.add(initArr[i]);
        }
    }

    //O(1)
    public void add(int item) {
        if (index >= arr.length)
            init();
        arr[index++] = item;
    }

    //O(n)
    private void init() {
        int size = arr.length;
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    //O(1)
    public Object get(int index)  {
        if (index >= 0 && index < this.index)
            return arr[index];
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    //O(index) ~ O(n)
    public boolean contains(int item) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == item)
                return true;
        }
        return false;
    }
    //O(1)
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);

    }
}
