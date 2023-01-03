package L09;

import java.util.*;

public class practice {

    public static final String ANSI_BLACK = "\u001B[30m";

    static String[] colors = {"\u001B[0m", "\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"};

    public static void main(String[] args) throws Exception {


        System.out.println("------------------sortWithArray-------------------");
        int[] arr = {-2, 6, 0, -1, 9, -3, 7};
        Queue<Integer> queue = new LinkedList<>();
        for (int next : arr)
            queue.add(next);
        System.out.println(queue);
        sortWithArray(queue);
        System.out.println(queue);


        System.out.println("------------------sortWithArray-------------------");
        Queue<Integer> queue2 = new LinkedList<>();
        for (int next : arr)
            queue2.add(next);

        System.out.println(queue2);
        sortWithQueue(queue2);
        System.out.println(queue2);

        buildSimulator();

        Queue<Integer> queue3 = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            queue3.add(i);


        System.out.println(queue3);
        lott(queue3);

    }

    private static int lott(Queue<Integer> queue3) {
        Random rd = new Random();
        int lastItem = 0;
        //(n)
        while (!queue3.isEmpty()) {
            int k = rd.nextInt(8) + 2;
            //O(10)
            for (int i = 1; i < k; i++) {
                int remove = queue3.poll();
                queue3.add(remove);
            }
            lastItem = queue3.poll();
        }
        return lastItem;
        //O(10n)-> O(n)
    }

    private static void buildSimulator() throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("\n\n\n\n");
        MyQueue_<Integer> q = new MyQueue_<>();
        int i = 0;
        String ch;
        System.out.println("-----------------add----------------");
        while (true) {
            ch = sc.nextLine();
            if (ch.equals("-1"))
                break;
            System.out.println(q);
            if (q.add(rd.nextInt(10))) {
                i = (i + 1) % q.capacity();
                move("f", i);
            } else {
                move("f", i);
            }

        }
        System.out.println("-----------------poll----------------");
        i = 0;
        while (true) {
            ch = sc.nextLine();
            if (ch.equals("-1"))
                break;
            try {
                q.poll();
                System.out.println(q);
                move("l", i + 1);
                i = (i + 1) % q.capacity();
            } catch (Exception e) {
                move("l", i + 1);
            }
        }
    }

    private static void move(String symbol, int index) {
        Random rd = new Random();
        System.out.print(colors[rd.nextInt(colors.length)]);
        for (int i = 0; i <= index * 3; i++)
            System.out.print(" ");
        System.out.println("^");
        for (int i = 0; i <= index * 3; i++)
            System.out.print(" ");
        System.out.println("|");
        for (int i = 0; i <= index * 3; i++)
            System.out.print(" ");
        System.out.println("|");
        for (int i = 0; i <= index * 3; i++)
            System.out.print(" ");
        System.out.println(symbol);
        for (int i = 0; i <= index * 3; i++)
            System.out.print(" ");
        System.out.println(ANSI_BLACK);
    }

    //O(n)
    private static void sortWithArray(Queue<Integer> queue) {
        //O(1)
        if (queue == null)
            return;
        //O(1)
        ArrayList<Integer> pos = new ArrayList<>();
        //O(1)
        ArrayList<Integer> neg = new ArrayList<>();
        //O(1)
        int countZero = 0;

        //O(n)
        while (!queue.isEmpty()) {
            int item = queue.poll();
            if (item > 0)
                pos.add(item);
            else if (item < 0)
                neg.add(item);
            else
                countZero++;
        }

        //O(n)
        for (int i = 0; i < neg.size(); i++)
            queue.add(neg.get(i));

        //O(n)
        for (int i = 0; i < countZero; i++)
            queue.add(0);

        //O(n)
        for (int i = 0; i < pos.size(); i++)
            queue.add(pos.get(i));


    }

    //O(n)
    private static void sortWithQueue(Queue<Integer> queue) {
        //O(1)
        if (queue == null)
            return;
        //O(1)
        Queue<Integer> pos = new LinkedList<>();
        //O(1)
        Queue<Integer> neg = new LinkedList<>();
        //O(1)
        int countZero = 0;

        //O(n)
        while (!queue.isEmpty()) {
            int item = queue.poll();
            if (item > 0)
                pos.add(item);
            else if (item < 0)
                neg.add(item);
            else
                countZero++;
        }

        //O(n)
        while (!neg.isEmpty())
            queue.add(neg.poll());

        //O(n)
        for (int i = 0; i < countZero; i++)
            queue.add(0);

        //O(n)
        while (!pos.isEmpty())
            queue.add(pos.poll());

    }
}