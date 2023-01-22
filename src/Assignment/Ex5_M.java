package Assignment;

import java.util.Stack;

public class Ex5_M {

    class myQueue<E> {


        private Stack<E> st;


        public myQueue() {
            st = new Stack();
        }

        public myQueue(int initialCapacity) throws Exception {
            st = new Stack();
        }

        public boolean add(E o) {
            Stack<E> temp = new Stack<>();
            while (!st.isEmpty())
                temp.add(st.pop());
            temp.push(o);
            while (!temp.isEmpty())
                st.add(temp.pop());
            return true;
        }

        public E poll() throws Exception {
            return st.pop();
        }

        public boolean isEmpty() {
            return st.isEmpty();
        }

        public E peek() throws Exception {
            return st.peek();
        }
    }
}