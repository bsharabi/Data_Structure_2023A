package Assignment;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex6_M {

    class MyLinkedList<E> implements List<E> {

        private Node<E> head;
        private int size;

        public MyLinkedList() {
            head = null;
            size = 0;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public boolean contains(Object o) {
            if (head == null)
                return false;
            else {
                Node<E> temp = head;
                while (temp.getValue() != o) {
                    temp = temp.getNext();
                }
                return (temp != null) ? true : false;
            }
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(E e) {
            if (head == null)
                head = new Node<E>(e);
            else {
                Node<E> temp = head;
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(new Node(e));
            }
            size++;

            return true;
        }

        public void print() {
            if (head == null)
                System.out.println("head->null");
            else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp + " ->" + ((temp.getNext() == null) ? "null" : ""));
                    temp = temp.getNext();
                }
                System.out.println();
            }

        }

        //IMpl
        @Override
        public boolean remove(Object o) {
            if (head == null)
                return false;
            if(head.getValue()==o)
            {
                head= head.getNext();
            }
            Node<E> prev= head;
            Node<E> current= head.getNext();
            while(current!=null){
                if(current.getValue()==o){
                    prev.setNext(current.getNext());
                    return true;
                }
                prev=current;
                current=current.getNext();
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        //IMpl
        @Override
        public void clear() {
            head=null;
            size=0;
        }

        @Override
        public E get(int index) {
            if (index < 0 || index >= size)
                return null;

            Node<E> temp = head;
            int count = 0;
            while (temp != null && count != index) {
                count++;
                temp = temp.getNext();
            }

            return temp.getValue();
        }


        @Override
        public E set(int index, E element) {
            if(index<0 || index>=size)
                return null;
            Node<E> temp = head;
            for (int i = 0; i <index ; i++) {
                    temp=temp.getNext();
            }
            E value = temp.getValue();
            temp.setValue(element);
            return value;
        }


        @Override
        public void add(int index, E element) {
            if(index<0 || index>=size)
                return ;
            if(index==0){
                Node<E> newNode = new Node<>(element);
                newNode.setNext(head);
                head=newNode;
                size++;

            }else if(index==size-1){
                add(element);
                return;
            }
            Node<E> prev= head;
            Node<E> current= head.getNext();
            for (int i = 0; i <index ; i++) {
                prev=current;
                current=current.getNext();
            }
            size++;
            Node<E> newNode = new Node<>(element);
            prev.setNext(newNode);
            newNode.setNext(current);
            return;
        }

        //IMpl
        @Override
        public E remove(int index) {
            return null;
        }

        //IMpl
        @Override
        public int indexOf(Object o) {
            return 0;
        }

        //IMpl
        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIndex, int toIndex) {
            return null;
        }
    }

    class Node<E> {
        private E value;
        private Node<E> next = null;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

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
}
