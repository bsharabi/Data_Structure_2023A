package L08;

import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        Stack<Integer> st = new Stack<>();
        fillStack(st);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.empty());

        rev(st);
        System.out.println(st);


        Stack<Character> stChar = new Stack<>();
        fillStackChar(stChar);
        System.out.println(stChar);
        char ch = valueK(stChar, 4);
        System.out.println(ch);
        System.out.println(stChar);


        myStack<Integer> myStack = new myStack<>();
        System.out.println(myStack);

        System.out.println(myStack.empty());
        myStack.push(1);
        System.out.println(myStack);

        for (int i = 0; i < 9; i++) {
            myStack.push(i);
        }
        System.out.println(myStack);


        System.out.println(myStack);
        int item = myStack.pop();
        System.out.println(item);
        System.out.println(myStack);
        myStack.push(10);
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);


        Stack<Integer> stTeamp = new Stack<>();


        System.out.println(stTeamp);
        System.out.println(sumStack(stTeamp));
        System.out.println(stTeamp);
        Stack<String> stString = new Stack<>();
        stString.push("Ronaldo");
        stString.push("Messy");
        stString.push("Pele");
        stString.push("Maradona");

        System.out.println(stString);
        System.out.println(stringLenInStack(stString));
        System.out.println(stString);




    }

    private static Stack<Integer> stringLenInStack(Stack<String> st) {
        if (st == null)
            return null;

        Stack<Integer> stInteger = new Stack<>();
        Stack<String> stString = new Stack<>();

        while (!st.empty()) {
            stString.push(st.pop());
        }

        while (!stString.isEmpty()) {
            String str = stString.pop();
            st.push(str);
            stInteger.push(str.length());
        }

        return stInteger;

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
        int size = rd.nextInt(50) + 2;
        for (int i = 0; i < size; i++) {
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

    private static Stack<Integer> sumStack(Stack<Integer> st) {
        if (st == null)
            return null;
        if (st.isEmpty())
            return new Stack<>();

        Stack<Integer> sTemp = new Stack();
        Stack<Integer> sTemp2 = new Stack();

        while (!st.isEmpty()) {
            sTemp.push(st.pop());
        }
        try {
            st.push(sTemp.peek());
            sTemp2.push(sTemp.pop());
        } catch (Exception e) {

        }
        while (!sTemp.isEmpty()) {
            int prevItem = sTemp2.peek();
            int currentItem = sTemp.pop();
            sTemp2.push(prevItem + currentItem);
            st.push(currentItem);
        }

        return sTemp2;
    }
}
