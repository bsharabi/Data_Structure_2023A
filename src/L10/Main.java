package L10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    protected int value = 6;
    protected Main subMain=null;
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.print();
        for (int i = 0; i <10 ; i++) {
            ll.add(i);
            ll.print();
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
        System.out.println(ll.get(8));









//    Object data = 4;

//    Data data1 = new Data(4);
//
//    Data<Integer> data2 = new Data();
//    data2.setData(4);
//
//    int data3 = data2.getData();
//
//List list = new LinkedList();


    //data=4
    //next = null
//    Data<Integer> data4 = new Data<>(4);
    //data=5
    //next = null
//    Data<Integer> data5 = new Data<>(5);

//    data4.setNext(data5);

//    data4.next=new Data<>(5);
//    data4=data4.next;
//
//    data4=data4.next;
//    data4.next.next=new Data<>(6);
//    data4.next.next.next=new Data<>(7);
//    data4.next.next.next.next=new Data<>(8);
//    data4.next.next.next.next.next=new Data<>(9);

    }

}


class Test{

    public static void main(String[] args) {
        Main m = new Main();
        m.subMain= new Main();
    }

}
class Data<E>{

    E data;
    Data<E> next;

    public Data(E data,Data next) {
        this.data = data;
        this.next=next;
    }
    public Data(E data) {
        this.data = data;
        this.next=null;
    }
    public Data() {
        data=null;
        next=null;
    }

    public Data getNext() {
        return next;
    }

    public void setNext(Data next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
