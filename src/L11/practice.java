package L11;


public class practice {
    static Node<Integer> head;


    public static void main(String[] args) throws Exception {
        head = new Node<>(1);
        head.setNext(new Node<>(1));
        head.getNext().setNext(new Node<>(2));
        head.getNext().getNext().setNext(new Node<>(4));
        head.getNext().getNext().getNext().setNext(new Node<>(8));
        head.getNext().getNext().getNext().getNext().setNext(new Node<>(16));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new Node<>(32));

        print(head);
        boolean ans = isSumList(head);
        System.out.println(ans);
        print(head);

    }

    private static boolean isSumList(Node<Integer> head) {
        if (head == null)
            return false;

        int sum = head.getValue();

        while (head.getNext() != null) {
            if (sum != head.getNext().getValue())
                return false;
            sum += head.getNext().getValue();
            head = head.getNext();
        }
        return true;
    }

    public static void print(Node<Integer> head) {
        //5-6-7-8-9
        while (head != null) {
            System.out.print(head.getValue() + " -> ");
            head = head.getNext();
        }
        System.out.println("null");
    }

}