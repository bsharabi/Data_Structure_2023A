package L07;

import java.util.*;

public class practice {
    public static void main(String[] args) throws Exception {

        Object[] objects = {"bob", "alice"};
        System.out.println(objects);
        Object[] temp = new Object[3];
        for (int i = 0; i < objects.length; i++) {
            temp[i] = objects[i];
        }
        temp[2] = "I";
        System.out.println(temp);
        objects = temp;
        System.out.println(objects);
        temp = null;

        myArrayList myArrayList = new myArrayList(1);
        System.out.println(myArrayList);
        myArrayList myArrayList1 = null;
        try {
            myArrayList1 = new myArrayList(-9);
            System.out.println(myArrayList1);
        } catch (IllegalArgumentException e) {
            System.out.println("Hello catch");
        }
        System.out.println(myArrayList1);

        Random rd = new Random();
        myArrayList myArrayListMax = new myArrayList(20);
        for (int i = 0; i < 30; i++) {
            myArrayListMax.add(rd.nextInt(250));
        }

        System.out.println(myArrayListMax);
//        Thread.sleep(5000);
        System.out.println(Thread.currentThread());
        System.out.println(myArrayListMax.max());

        myArrayList myArrayListMax2 = new myArrayList(new int[]{300,400,500});
//        for (int i = 0; i < 3; i++) {
//            myArrayListMax2.add(rd.nextInt(250));
//        }
        System.out.println(myArrayListMax2);
//        Thread.sleep(5000);
        System.out.println(myArrayListMax2.max());

//        ArrayList arrayList = new ArrayList();
//        LinkedList linkedList = new LinkedList();

        List linkedList = new LinkedList();
        List arrayList = new ArrayList();
        f(myArrayList);


    }

    public static void f(List l){


    }
}

class myArrayList implements List {

    private Object[] myArray;
    private int index = 0;
    private int max = Integer.MIN_VALUE;
    private int sum=0;
    private double avg=0;


    public myArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException();
        else if (capacity == 0)
            myArray = new Object[10];
        else
            myArray = new Object[capacity];

    }

    public myArrayList() {
        myArray = new Object[10];
    }

    public myArrayList(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException();
        else if (arr.length == 0)
            myArray = new Object[10];
        else {
            myArray = new Object[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if(max<arr[i])
                    max=arr[i];
                sum+=arr[i];
                myArray[i] = arr[i];
            }
            index = arr.length;
        }
    }



    private void init() {
        Object[] temp = new Object[index * 2];
        for (int i = 0; i < myArray.length; i++) {
            temp[i] = myArray[i];
        }
        myArray = temp;

    }

    public Object max() {
        return max;
    }

    public Object avg(){
        if(index==0)
            return 0;
        return (double)sum /index ;
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object item) {
        if ((int) item > max)
            max = (int) item;

        sum+=(int)item;
        if (index == myArray.length)
            init();
        myArray[index] = item;
        index++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}