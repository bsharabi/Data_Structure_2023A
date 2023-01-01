package L09;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        fillQueue(q);
        System.out.println(q);
        System.out.println(q.peek());
        rev(q);
        System.out.println(q);
        boolean ans = search(q, 8);
        System.out.println(ans);
    }

    //O(n)
    private static void fillQueue(Queue<Integer> q) {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            int item = rd.nextInt(100);
            System.out.print(item + " ");
            q.add(item);
        }
        System.out.println();
    }

    //O(n)
    private static boolean search(Queue<Integer> q, int item) {
        if (q == null)
            return false;

        boolean flag = false;
        for (int i = 0; i < q.size(); i++) {
            int value = q.poll();
            if (value == item)
                flag = true;
            q.add(value);
        }



        return flag;
    }

    //O(n)
    private static void rev(Queue<Integer> queue) {
        if (queue == null)
            return;
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()) {
            st.push(queue.poll());
        }
        while (!st.isEmpty()) {
            queue.add(st.pop());
        }
    }




}
