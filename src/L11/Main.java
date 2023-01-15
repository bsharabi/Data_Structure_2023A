package L11;

public class Main {

    static Node<Integer> head;

    public static void main(String[] args) {

        head = new Node<>(5);
        head.setNext(new Node<>(20));
        head.getNext().setNext(new Node<>(9));
        head.getNext().getNext().setNext(new Node<>(6));
        head.getNext().getNext().getNext().setNext(new Node<>(5));
        head.getNext().getNext().getNext().getNext().setNext(new Node<>(8));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new Node<>(2));

//
//        print(head);
//        sum(head);
//        print(head);
//
//        sumEv(head);
//        print(head);
//
//        sumEven(head);
//        print(head);


        print(head);
        differenceListIter(head);
        print(head);

        differenceList(head);
        print(head);

    }

    public static void print(Node<Integer> head) {
        //5-6-7-8-9
        while (head != null) {
            System.out.print(head.getValue() + " -> ");
            head = head.getNext();
        }
        System.out.println("null");
    }

    public static Node<Integer> differenceList(Node<Integer> head) {
        if (head == null || head.getNext() == null)
            return null;
        int sum = Math.abs(head.getValue() - head.getNext().getValue());
        head.setValue(sum);
        head.setNext(differenceList(head.getNext()));
        return head;
    }

    public static void differenceListIter(Node<Integer> head) {
        if (head == null || head.getNext() == null)
            return;

        while (head != null && head.getNext() != null) {

            int sum = Math.abs(head.getNext().getValue() - head.getValue());
            head.setValue(sum);

            if (head.getNext().getNext() == null)
                head.setNext(null);

            head = head.getNext();
        }

    }

    public static void sumEven(Node<Integer> head) {
        // 1->2->3->8
        // 1 -> (-2) -> 4 -> (-10)
        int sumEven = 0;
        int sumOdd = 0;
        int index = 0;
        while (head != null) {
            if (index % 2 == 0) {
                sumEven += head.getValue();
                head.setValue(sumEven);
            } else {
                sumOdd -= head.getValue();
                head.setValue(sumOdd);
            }
            head = head.getNext();
            index++;
        }

    }

    public static void sum(Node<Integer> head) {
        //5-6-7-8-9
        if (head == null)
            return;
        int sum = 0;
        while (head != null) {
            sum += head.getValue();
            head.setValue(sum);
            head = head.getNext();
        }
    }

    public static void sumEv(Node<Integer> head) {
        //1-> 1-> 2-> 1-> 3-> 1-> null
        int sum = 0;
        int cnt = 0;
        while (head != null) {
            if (cnt % 2 == 0) {
                sum += head.getValue();
                head.setValue(sum);
            }
            head = head.getNext();
            cnt++;
        }
    }

    public static boolean add(int e) {
        if (head == null)
            head = new Node<>(e);
        else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(e));
        }
        return true;
    }

}

class Node<E> {
    private E value;
    private Node<E> next = null;

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

}

