package L12;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.print();
            if (i % 2 == 0)
                ll.add(0);
            else
                ll.add(1);

//            Thread.sleep(500);
        }
//        ll.print();
//        Integer ans = ll.remove(5);
//        System.out.println(ans);
//        ll.print();

        ll.print();
        boolean bool = ll.remove((Object) 1);
        System.out.println(bool);
        ll.print();

    }


}
