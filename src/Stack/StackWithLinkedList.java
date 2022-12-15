package Stack;

import LinkedList.MyLinkedList;

public class StackWithLinkedList<T> extends SuperStack<T> {
    private final MyLinkedList<T> helperList;

    public StackWithLinkedList() {
        helperList = new MyLinkedList<>();
    }

    @Override
    void push(T data) {
        helperList.insertFirst(data);
    }

    @Override
    T pop() {
        if (helperList.isEmpty()) throw new RuntimeException("Stack is empty!");
        T data = helperList.head.data;
        helperList.deleteHead();
        return data;
    }

    @Override
    T peek() {
        if (helperList.isEmpty()) throw new RuntimeException("Stack is empty!");
        return helperList.head.data;
    }

    @Override
    boolean isEmpty() {
        return helperList.isEmpty();
    }

    @Override
    void print() {
        helperList.printList();
    }

    @Override
    int getSize() {
        return helperList.length;
    }
}
