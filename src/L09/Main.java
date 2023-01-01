package L09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        fillQueue(queue);
        System.out.println(queue);
        System.out.println(queue.peek());
        rev(queue);
        System.out.println(queue);
        boolean ans = search(queue,8);
        System.out.println(ans);
    }

    private static boolean search(Queue<Integer> queue, int item) {
        if(queue==null)
            return false;

        boolean flag =false;

        for (int i = 0; i < queue.size(); i++) {
            int current = queue.poll();
            if(current==item)
                flag=true;
            queue.add(current);
        }
        return flag;
    }

    private static void rev(Queue<Integer> queue) {
        if(queue==null)
            return;

        Stack<Integer> st = new Stack<>();

        while(!queue.isEmpty())
            st.push(queue.poll());

        while(!st.isEmpty())
            queue.add(st.pop());

    }

    private static void fillQueue(Queue<Integer> queue) {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            queue.add(rd.nextInt(100));
        }
    }
}
