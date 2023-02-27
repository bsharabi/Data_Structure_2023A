package Test;

import L12.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Aviv_Moed_B_2023 {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.setNext(new Node<>(2));
        head.getNext().setNext(new Node<>(4));
        head.getNext().getNext().setNext(new Node<>(8));
        head.getNext().getNext().getNext().setNext(new Node<>(16));
        head.getNext().getNext().getNext().getNext().setNext(new Node<>(32));

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter q number or to exit -1");
            switch (sc.nextInt()) {
                case 1:

                    System.out.println("1 - O(n^2)");
                    System.out.println("2 - O(n^2)");
                    System.out.println("3 - O(inf)");
                    System.out.println("4 - O(nlogn)");

                    System.out.println("1 - O(1)");
                    System.out.println("2 - O(1)");
                    System.out.println("3 - O(1)");

                    break;
                case 2:
                    Stack<Integer> st = new Stack<>();
                    st.push(2);
                    st.push(6);
                    st.push(5);
                    st.push(3);
                    System.out.println("-----------------Question 3-------------------");
                    System.out.println("Before " + st);
                    System.out.println("is Equal " + q2(st));
                    System.out.println("After " + st);
                    System.out.println("-----------------------------------------------");


                    st.push(1);
                    st.push(1);
                    st.push(2);
                    System.out.println("-----------------Question 3-------------------");
                    System.out.println("Before " + st);
                    System.out.println("is Equal " + q2(st));
                    System.out.println("After " + st);
                    System.out.println("-----------------------------------------------");
                    break;
                case 3:
                    Stack<Integer> st2 = new Stack<>() {{
                        push(1);
                        push(81);
                        push(37);
                        push(16);
                        push(11);
                        push(125);
                    }};
                    System.out.println(st2);
                    System.out.println(q3(st2));
                    break;
                case 4:
                    Stack<Integer> st3 = new Stack<>() {{
                        push(5);
                        push(2);
                        push(6);
                        push(50);
                        push(7);
                        push(12);
                        push(10);
                    }};
                    int dis = distance(st3, 12, 8);
                    System.out.println("distance " + dis);
                    dis = distance(st3, 12, 2);
                    System.out.println("distance " + dis);
                    dis = distance(st3, 5, 10);
                    System.out.println("distance " + dis);
                    dis = distance(st3, 5, 2);
                    System.out.println("distance " + dis);
                    break;
                case 5:
                    String s = "123321";
                    boolean bool = palindrome(s);
                    System.out.println(s + " is " + bool);
                    s = "1223211";
                    bool = palindrome(s);
                    System.out.println(s + " is " + bool);
                    s = "1223221";
                    bool = palindrome(s);
                    System.out.println(s + " is " + bool);
                    break;
                case 6:
                    Stack<Integer> s1, s2;
                    mystery((s1 = new Stack<>() {{
                        push(8);
                        push(3);
                        push(7);
                        push(1);
                    }}), (s2 = new Stack<>() {{
                        push(3);
                        push(5);
                        push(6);
                        push(8);
                    }}));

                    System.out.println("S1 = " + s1);
                    System.out.print("S1 = ");
                    while (!s1.isEmpty())
                        System.out.print(s1.pop());
                    System.out.println();
                    System.out.println("S2 = " + s2);
                    System.out.println("חיבור בין שני המספרים הנתונים לנו בתוך המחסנית, את הסכום נמצא במחסנית הראשונה");
                    break;
                case 7:
                    print(null);
                    boolean bool1 = TwoPow(null);
                    System.out.println(bool1);

                    print(head);
                    bool1 = TwoPow(head);
                    System.out.println(bool1);

                    print(new Node(0));
                    bool1 = TwoPow(new Node(0));
                    System.out.println(bool1);

                    head.getNext().getNext().getNext().getNext().getNext().setNext(new Node<>(40));
                    print(head);
                    bool1 = TwoPow(head);
                    System.out.println(bool1);

                    head.getNext().getNext().getNext().getNext().getNext().setNext(new Node<>(64));
                    print(head);
                    bool1 = TwoPow(head);
                    System.out.println(bool1);
                    head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node<>(128));
                    break;
                case 8:
                    print(head);
                    boolean bool3 = even(head);
                    System.out.println(bool3);

                    head.setValue(0);
                    print(head);
                    bool3 = even(head);
                    System.out.println(bool3);
                    head.setValue(1);
                    break;
                case -1:
                    System.out.println("Good bye");
                    return;
            }
        }
    }

    //O(n)
    public static boolean q2(Stack<Integer> st) {

        if (st == null || st.isEmpty())
            return true;

        Stack<Integer> sTemp = (Stack<Integer>) st.clone();
        int index = 1;
        int Odd_index = 0;
        int Odd_number = 0;

        while (!sTemp.isEmpty()) {
            if (index % 2 != 0)
                Odd_index += sTemp.peek();
            if (sTemp.peek() % 2 != 0)
                Odd_number += sTemp.peek();
            sTemp.pop();
            index++;
        }
        System.out.println("Odd_index sum = " + Odd_index);
        System.out.println("Odd_number sum = " + Odd_number);
        return Odd_index == Odd_number;
    }

    //O(n)
    public static Stack<Integer> q3(Stack<Integer> st) {

        if (st == null || st.isEmpty())
            return null;

        Stack<Integer> sTemp = new Stack<>();

        while (!st.isEmpty()) {
            int item = st.pop();
            int sqrt = (int) Math.sqrt(item);
            if (item == sqrt * sqrt)
                sTemp.push(item);
        }
        return sTemp;
    }

    //O(n)
    public static int distance(Stack<Integer> stack, int x, int y) {

        int counter = 0;
        if (stack == null || stack.isEmpty()) {
            return counter;
        }

        boolean flag = false;
        int varFromStack;

        Stack<Integer> sTemp = (Stack<Integer>) stack.clone();
        while (!sTemp.isEmpty()) {

            varFromStack = sTemp.pop();


            if ((varFromStack == x || varFromStack == y)) {
                flag = !flag;
                continue;
            }

            if (flag)
                counter++;


        }

        return (!flag) ? counter : 0;
    }

    //O(n)
    public static boolean palindrome(String str) {
        if (str == null)
            return false;
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            q.add(str.charAt(i));
            st.push(str.charAt(i));
        }

        while (!q.isEmpty() && !st.empty()) {
            if (q.poll() != st.pop())
                return false;
        }

        return true;

    }

    //O(n)
    public static Boolean TwoPow(Node<Integer> chain) {

        if (chain == null)
            return false;
        int pow = 0;
        while (chain != null) {
            int value = chain.getValue();
            if (value != Math.pow(2, pow))
                return false;
            pow++;
            chain = chain.getNext();
        }
        return true;
    }

    //O(n)
    public static Boolean even(Node<Integer> chain) {
        if (chain == null)
            return false;
        int count = 0;
        while (chain != null) {
            int value = chain.getValue();
            if (value % 2 != 0)
                return false;
            count++;
            chain=chain.getNext();
        }
        return count % 2 == 0;

    }
    public static void print(Node<Integer> chain) {

        while (chain != null) {
            System.out.print(chain.getValue()+" -> ");

            chain=chain.getNext();
        }
        System.out.println("null");

    }
    public static void mystery(Stack<Integer> s1, Stack<Integer> s2) {
        int z = 0;
        Stack<Integer> s3, s4;
        s3 = new Stack<>();
        s4 = new Stack<>();
        while (!s1.isEmpty()) {
            s3.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            s4.push(s2.pop());
        }
        while (!s3.isEmpty() && !s4.isEmpty()) {
            z += s3.pop() + s4.pop();
            s1.push(z % 10);
            z /= 10;
        }
        if (z != 0) {
            s1.push(z);
        }
    }

}
