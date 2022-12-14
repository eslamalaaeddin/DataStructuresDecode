package Stack;

import LinkedList.MyLinkedList;

public class MyStackWithLinkedList<T> {
    private final MyLinkedList<T> helperList;

    public MyStackWithLinkedList() {
        helperList = new MyLinkedList<>();
    }

    void push(T data) {
        helperList.insertFirst(data);
    }

    T pop() {
        if (helperList.isEmpty()) throw new RuntimeException("Stack is empty!");
        T data = helperList.head.data;
        helperList.deleteHead();
        return data;
    }

    T peek() {
        if (helperList.isEmpty()) throw new RuntimeException("Stack is empty!");
        return helperList.head.data;
    }

    boolean isEmpty() {
        return helperList.isEmpty();
    }

    void printStack() {
        helperList.printList();
    }

    int getSize() {
        return helperList.length;
    }
}
