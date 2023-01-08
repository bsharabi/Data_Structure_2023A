package L10;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {
        Data2<Stack<Integer>> dI = new Data2<>(new Stack<>());
        dI.next= new Data2(6);
        dI.next.next=new Data2(7);
        dI.next.next.next=new Data2(8);
        Data2<Float> dF = new Data2<>(5.6f);
        Data2<Double> dD = new Data2<>(58.98);

        ArrayList<Integer> l = new ArrayList<Integer>();
        int i = 5;
        float f = 5.6f;
        double d = 58.98;


        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.print();
        ll.add(5);
        ll.print();
        ll.add(6);
        ll.print();
        ll.add(7);
        ll.add(8);
        ll.print();


    }
}

class Data2<E> {

     E value;
     Data2<E> next=null;

    public Data2(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "value=" + value +
                '}';
    }
}
