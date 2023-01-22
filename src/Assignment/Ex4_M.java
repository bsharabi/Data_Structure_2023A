package Assignment;

import java.util.ArrayList;


public class Ex4_M {

    class myStack<E> {

        public static final int DEFAULT_CAPACITY = 10;
        private ArrayList<E> arr;

        public myStack() {
            this.arr = new ArrayList(DEFAULT_CAPACITY);
        }

        public myStack(int initialCapacity) throws Exception {
            this.arr = new ArrayList(initialCapacity);
        }

        public E pop() throws Exception {
            return arr.remove(arr.size() - 1);
        }

        public E peek() throws Exception {
            return arr.get(arr.size() - 1);
        }

        public boolean empty() {
            return arr.isEmpty();
        }

        public E push(E item) {
            arr.add(item);
            return item;
        }


        @Override
        public String toString() {
            return arr.toString();
        }
    }
}