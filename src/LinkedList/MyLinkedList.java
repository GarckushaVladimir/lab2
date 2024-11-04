package LinkedList;

import java.util.List;

public class MyLinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList(Node<T> head, Node<T> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean add(T t) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public T get(int index) {
        return null;
    }

    public void add(int index, T element) {

    }
}
