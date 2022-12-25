package L08;

import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
//        Stack<Integer> st = new Stack<>();
//        fillStack(st);
//
//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st);
//        System.out.println(st.empty());
//        rev(st);
//        System.out.println(st);
//
//
//        Stack<Character> stChar = new Stack<>();
//        fillStackChar(stChar);
//        System.out.println(stChar);
//        char ch =valueK(stChar, 4);
//        System.out.println(ch);
//        System.out.println(stChar);

        myStack<Integer> myStack = new myStack<>();
        System.out.println(myStack);
        System.out.println(myStack.empty());
        for (int i = 0; i < 10; i++) {

            myStack.push(i);
        }

        System.out.println(myStack);
        int item =myStack.pop();
        System.out.println(item);
        System.out.println(myStack);
        myStack.push(10);
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }


    private static char valueK(Stack<Character> st, int k) throws Exception {
        if (st == null)
            throw new Exception();

        Stack<Character> sTemp = (Stack) st.clone();
        int size = 0;
        while (!sTemp.empty()) {
            size++;
            sTemp.pop();
        }
        if (k < 1 || k > size)
            throw new Exception();

        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < k; i++) {
            temp.push(st.pop());
        }
        char ch = temp.pop();
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        return ch;
    }

    private static void rev(Stack<Integer> st) {
        if (st == null)
            return;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        while (!st.isEmpty()) {
            int item = st.pop();
            st1.push(item);
        }
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
    }

    private static void fillStack(Stack<Integer> st) {
        if (st == null)
            return;
        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(50) + 2; i++) {
            int item = rd.nextInt(50);
            st.push(item);
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void fillStackChar(Stack<Character> st) {
        if (st == null)
            return;
        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(50) + 2; i++) {
            char item = (char) (rd.nextInt(6) + 33);
            st.push(item);
        }
    }
}
