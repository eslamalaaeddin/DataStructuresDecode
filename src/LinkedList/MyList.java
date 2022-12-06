package LinkedList;

import java.util.LinkedList;

public abstract class MyList<T> {
    protected Node<T> head;
    protected Node<T> tail;
    protected int length;

    protected boolean isEmpty() {
        return head == null;
    }

    protected Iterator<T> initIterator() {
        if (head != null)
            return new Iterator<>(head);
        return null;
    }

    protected abstract void insertLast(T data);

    protected abstract void insertAfter(T data, T newData);

    protected abstract void insertBefore(T data, T newData);

    protected abstract void deleteNode(T data);

    protected abstract void printList();

    protected Node<T> findNode(T data) {
        Iterator<T> iterator = initIterator();
        while (iterator.getCurrentNode() != null) {
            if (iterator.getData() == data)
                return iterator.getCurrentNode();
            iterator = new Iterator<>(iterator.getNextNode());
        }
        return null;
    }

    protected MyList<T> copyLinkedList() {
        MyList<T> newList;
        //Bad Code I think, as if new list is added we will open the code and modify it (this violates Open Closed Principle)
        if (this instanceof MyLinkedList<T>) newList = new MyLinkedList<T>();
        else newList = new MyDoubleyLinkedList<T>();

        Iterator<T> iterator = initIterator();

        while (iterator.getCurrentNode() != null) {
            newList.insertLast(iterator.getData());
            iterator = new Iterator<>(iterator.getNextNode());
        }

        return newList;
    }

}
