package Test;

import L12.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Aviv_Moed_A_2023 {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.setNext(new Node<>(2));
        head.getNext().setNext(new Node<>(3));
        head.getNext().getNext().setNext(new Node<>(4));
        head.getNext().getNext().getNext().setNext(new Node<>(5));
        head.getNext().getNext().getNext().getNext().setNext(new Node<>(6));

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter q number or to exit -1");
            switch (sc.nextInt()) {
                case 1:
                    // 1 O(inf)
                    // 2 O(n^2)
                    // 3 O(n^2)
                    // 4 O(inf)

                    // 1 O(1)
                    // 2 O(1)
                    // 3 O(1)
                    break;
                case 2:
                    Stack<Integer> st = new Stack<Integer>() {{
                        add(6);
                        add(12);
                        add(2);
                        add(10);
                        add(7);
                        add(5);
                    }};
                    System.out.println("Before - " + st);
                    q2(st);
                    System.out.println("After - " + st);
                    break;
                case 3:
                    int N = 3;
                    Queue<Integer> q = q3_a(N);
                    System.out.println(q);
                    boolean bool = q3_b(q, N);
                    System.out.println(bool);

                    q.add(3);
                    bool = q3_b(q, N);
                    System.out.println(bool);

                    q.poll();
                    bool = q3_b(q, N);
                    System.out.println(bool);
                    break;
                case 4:
                    Stack<Integer> st1 = new Stack<>() {{
                        push(3);
                        push(5);
                        push(6);
                        push(2);
                    }};
                    System.out.println("Before - " + st1);
                    int deep = recursive_search(st1, 2);
                    System.out.println(deep);
                    System.out.println("After - " + st1);
                    break;
                case 5:
                    q = new LinkedList<>() {{
                        add(10);
                        add(12);
                        add(7);
                        add(6);
                        add(2);
                        add(5);

                    }};
                    System.out.println(q);
                    Stack stackQueue = copy(q);
                    System.out.println(stackQueue);

                    System.out.println("First value (Stack) " + stackQueue.pop());
                    System.out.println("First value (Queue) " + q.poll());

                    System.out.println("Second value (Stack) " + stackQueue.pop());
                    System.out.println("Second value (Queue) " + q.poll());

                    break;
                case 6:
                    int isSort = isSorted(head);
                    System.out.println(isSort);
                    break;
                case 7:
                    int indexOfLast = getLast(head);
                    System.out.println(indexOfLast);
                    break;
                case 8:
                    System.out.println(mystery(2047));
                    // הפונקציה מקבל מספרים שלמים ומחזירה את המספר ההפוך כלומר כאילו קראנו אותו מימין לשמאל
                    break;
                default:
                    return;
            }
        }
    }

    //O(n)
    public static int isSorted(Node<Integer> head) {
        if (head == null)
            return 0;
        while (head.getNext() != null) {
            if (head.getValue() > head.getNext().getValue())
                return 0;
            head = head.getNext();
        }
        return 1;
    }

    //O(n)
    public static int getLast(Node<Integer> head) {
        int index = -1;
        if (head == null) {
            return index;
        }
        while (head != null) {
            index++;
            head = head.getNext();
        }
        return index;
    }

    //O(n) העתקת תור והפיכת מחסנית מסתכמים ב
    private static Stack copy(Queue<Integer> q) {
        if (q == null)
            return null;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        // אני העתקתי את התור המקורי לתור זמני ואז לא אאהרוס את התור המקורי שימו לב שאתם יכולים לעשות את זה ר באמצעות לולאות ואין להשתמש בהעתקה של תור בצורה הזאת
        Queue<Integer> copyQ = new LinkedList<>(q);
        while (!copyQ.isEmpty()) {
            temp.push(copyQ.poll());
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return stack;

    }

    public static int mystery(int num) {
        int x = 0, y = 1;
        Stack<Integer> s = new Stack();
        while (num != 0) {
            s.push(num % 10);
            num /= 10;
        }
        while (!s.isEmpty()) {
            x += y * s.pop();
            y *= 10;
        }
        return x;
    }


    //O(n) מוציאים בכל רקורסיה איבר אחד וכשמסימים מחזירים את כל האיברים.
    public static int recursive_search(Stack<Integer> st, int index) {
        if (index == 0)
            return st.peek();

        int temp = st.pop();
        int ans = recursive_search(st, index - 1);
        st.push(temp);
        return ans;
    }

    private static boolean q3_b(Queue<Integer> q, int n) {

        Queue<Integer> temp = q3_a(n);
        if (temp == null || q == null)
            return false;

        while (!q.isEmpty() && !temp.isEmpty()) {
            if (q.poll() != temp.poll())
                return false;
        }

        return q.isEmpty() && temp.isEmpty();
    }

    private static Queue<Integer> q3_a(int n) {
        if (n <= 0)
            return null;
        Queue<Integer> temp = new LinkedList<>();
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < Math.pow(i, 2); j++) {
                temp.add(i);
            }

        }
        return temp;
    }

    //O(n) מוציאים את האיברים ומחזירים אותם בסדר אחר סהכ
    private static void q2(Stack<Integer> st) {
        if (st == null)
            return;
        Stack<Integer> sTemp = new Stack<>();
        int min = st.peek();
        int max = st.peek();

        while (!st.isEmpty()) {
            int peek = st.peek();
            if (peek > max)
                max = peek;
            if (peek < min)
                min = peek;
            sTemp.add(st.pop());
        }
        st.add(min);

        while (!sTemp.isEmpty()) {
            int poped = sTemp.pop();
            if (min == poped || max == poped)
                continue;
            st.push(poped);
        }
        st.add(max);
    }
}
