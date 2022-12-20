package L08;

import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        fillStack(st);
        System.out.println(st);
        rev(st);
        System.out.println(st);
        Stack<Character> stChar = new Stack<>();
        fillStackChar(stChar);
        System.out.println(stChar);
        valueK(stChar, 4);
        System.out.println(stChar);
    }

    private static void valueK(Stack<Character> st, int k) {
        if (st == null || k < 0 || k > st.size())
            return;
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < k; i++) {
            temp.push(st.pop());
        }
        temp.pop();
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
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
            st.push(rd.nextInt(50));
        }
    }
    private static void fillStackChar(Stack<Character> st) {
        if (st == null)
            return;
        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(50) + 2; i++) {
            char item =(char)(rd.nextInt(6)+33);
            st.push(item);
        }
    }
}
