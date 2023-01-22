package L12;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
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

    //O(1)
    @Override
    public boolean add(E e) {
        if (head == null) {
            head = tail = new Node<>(e);
        } else {
            Node<E> nodeToInsert = new Node<>(e);
            nodeToInsert.setNext(null);
            nodeToInsert.setPrev(tail);
            tail.setNext(nodeToInsert);
            tail = nodeToInsert;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty())
            return false;
        if (head.getValue() == o) {
            head = head.getNext();
            if (head != null)
                head.setPrev(null);
            else
                tail = null;
            size--;
            return true;
        }else {
            Node<E> temp = head.getNext();
            while (tail != temp) {
                if (temp.getValue() == o) {
                    Node<E> prev = temp.getPrev();
                    Node<E> next = temp.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                    size--;
                    return true;
                }
                temp=temp.getNext();
            }
        }
         if (tail.getValue() == o) {
            tail = tail.getPrev();
            if (tail != null)
                tail.setNext(null);
            else
                head = null;
            size--;
            return true;
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

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;
        Node<E> nodeToDelete;

        if (index == 0) {
            nodeToDelete = head;
            nodeToDelete.setPrev(null);
            head = head.getNext();
            size--;
            return nodeToDelete.getValue();
        } else if (index == size - 1) {
            nodeToDelete = tail;
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
            return nodeToDelete.getValue();
        }
        nodeToDelete = head;
        for (int i = 0; i < index; i++) {
            nodeToDelete = nodeToDelete.getNext();
        }
        Node<E> prev = nodeToDelete.getPrev();
        Node<E> next = nodeToDelete.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return nodeToDelete.getValue();
    }

    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
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
