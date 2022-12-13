package L07;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Test");
        MyArrayList myArray = new MyArrayList();
        System.out.println(myArray);
        myArray.add(8);
        System.out.println(myArray);
        myArray.add(10);
        System.out.println(myArray);
        myArray.add(11);
        System.out.println(myArray);
        myArray.add(15);

        for (int i = 0; i < 20; i++) {
            System.out.println("-------------------");
            System.out.println(myArray);
            myArray.add(i + 15);
            System.out.println("-------------------");
        }
        MyArrayListTemp l0 = new MyArrayListTemp(-1, null);
        MyArrayListTemp l1 = new MyArrayListTemp(0, null);
        MyArrayListTemp l2 = new MyArrayListTemp(5, null);
        MyArrayListTemp l3 = new MyArrayListTemp(-1, new int[]{1, 2, 3});
        MyArrayListTemp l4 = new MyArrayListTemp(0, new int[]{1, 2, 3});
        MyArrayListTemp l5 = new MyArrayListTemp(5, new int[]{1, 2, 3, 4, 5});
        MyArrayListTemp l6 = new MyArrayListTemp(5, new int[]{1, 2, 3, 4, 5, 6, 7});
        MyArrayListTemp l7 = new MyArrayListTemp(1, new int[]{1, 2, 3, 4, 5, 6, 7});

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        for (int i = 0; i < 25; i++) {
            list.remove(i);
            System.out.println(list.size());
        }
        LinkedList ll = new LinkedList();

        search(list, 5);
        search(l7, 5);
        search(ll, 5);

        int[] arr = new int[10];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList(10);
//        ArrayList arrayList3 = new ArrayList(new Collections(new int[]{1,2}));

        MyArrayList arrayList4 = new MyArrayList();
        MyArrayList arrayList5 = new MyArrayList(10);
        MyArrayList arrayList6 = new MyArrayList(new int[]{1, 2});

        System.out.println(arrayList);
        float f = 1;
        arrayList.add(1f);
        System.out.println(arrayList);
        arrayList.add("Bob");
        System.out.println(arrayList);
        arrayList.add(1.5f);
        System.out.println(arrayList);
        Object[] objects = new Object[]{1, "Bob", 1.5};
        objects[2] = false;


        arrayList4.add(2);


        MyArrayList<Integer> myArrayList =
                new MyArrayList(2);
        System.out.println("MyArray = " + myArrayList);
        myArrayList.add(3);
        System.out.println("MyArray = " + myArrayList);
        myArrayList.add(4);
        System.out.println("MyArray = " + myArrayList);
        myArrayList.add(5);
        System.out.println("MyArray = " + myArrayList);
        myArrayList.add(6);
        System.out.println("MyArray = " + myArrayList);
        myArrayList.add(6);
        System.out.println("MyArray = " + myArrayList);

        myArrayList.contains(5);

        MyArrayList myArrayList1 =
                new MyArrayList(100);
        System.out.println(myArrayList1);
    }

    private static boolean search(List list, int i) {

        return list.contains(i);
    }


}
