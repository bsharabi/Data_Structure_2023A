package Assignment;

import java.util.*;

public class Ex3_M {

    class MyArrayList<T> implements List<T> {

        public static final int DEFAULT_CAPACITY = 10;

        private Object[] myArray;
        private int index = 0;

        //O(1)
        public MyArrayList() {
            myArray = new Object[DEFAULT_CAPACITY];
        }

        //O(1)
        public MyArrayList(int initialCapacity) throws Exception {
            if (initialCapacity < 0)
                throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
            else if (initialCapacity == 0)
                myArray = new Object[DEFAULT_CAPACITY];
            else myArray = new Object[initialCapacity];
        }

        //O(n)
        public MyArrayList(int[] arr) {
            if (arr == null)
                throw new NullPointerException("Invalid argument");
            if (arr.length != 0) {
                myArray = new Object[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    myArray[i] = arr[i];
                }

            } else {
                myArray = new Object[DEFAULT_CAPACITY];
            }

        }


        //O(n)
        private void init() {
            Object[] temp = new Object[myArray.length * 2];
            for (int i = 0; i < myArray.length; i++) {
                temp[i] = myArray[i];
            }
            myArray = temp;

        }

        @Override
        public int size() {
            return 0;
        }

        //O(1)
        public boolean isEmpty() {
            return index == 0;
        }

        //O(n)
        public boolean contains(Object item) {

            for (int i = 0; i < index; i++) {
                if (myArray[i] == item)
                    return true;
            }
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
        public boolean add(T o) {
            if (myArray.length == index)
                init();
            myArray[index] = o;
            index++;
            return false;
        }

        private void grow(int index) {

            for (int i = index; i < this.index; i++) {
                myArray[i] = myArray[i + 1];
            }
            this.index--;

        }

        @Override
        public boolean remove(Object o) {
            if (isEmpty())
                return false;
            for (int i = 0; i < index; i++) {
                if (myArray[i] == o) {
                    grow(i);
                    return true;
                }
            }
            return false;
        }

        public boolean remove1(Object o) {
            if (isEmpty())
                return false;
            int index = indexOf(o);
            if (index != -1) {
                grow(index);
                return true;
            }

            return false;
        }

        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }


        @Override
        public int indexOf(Object o) {
            for (int i = 0; i < index; i++) {
                if (myArray[i] == o)
                    return i;
            }
            return -1;
        }

        @Override
        public int lastIndexOf(Object o) {
            for (int i = index - 1; i >= 0; i--) {
                if (myArray[i] == o)
                    return i;
            }
            return -1;
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

        public T get(int index) {

            if (index >= 0 && index < this.index) {
                return (T) myArray[index];
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }

        }

        @Override
        public Object set(int index, Object element) {
            return null;
        }

        @Override
        public void add(int index, Object element) {

        }

        @Override
        public T remove(int index) {
            if (index < 0 || index >= this.index)
                return null;
            T value = (T) myArray[index];
            grow(index);
            return value;
        }

        @Override
        public String toString() {
            return Arrays.toString(myArray) + " " + myArray;

        }
    }

}