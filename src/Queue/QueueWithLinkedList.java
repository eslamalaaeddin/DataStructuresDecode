package Queue;

import LinkedList.MyLinkedList;

public class QueueWithLinkedList<T> {
    private final MyLinkedList<T> helperList;

    public QueueWithLinkedList() {
        helperList = new MyLinkedList<>();
    }

    
    void enqueue(T data) {
        //Eng Metwally made it insertLast, but it is ok in both cases as my dequeue behavior is different from him
        helperList.insertFirst(data);
    }

    
    T dequeue() {
        if (helperList.isEmpty()) throw new RuntimeException("Queue is empty!");
        T data = helperList.tail.data;
        helperList.deleteTail();
        return data;
    }

    
    T peek() {
        if (helperList.isEmpty()) throw new RuntimeException("Queue is empty!");
        return helperList.tail.data;
    }

    
    boolean isEmpty() {
        return helperList.isEmpty();
    }

    boolean isNotEmpty() {
        return !helperList.isEmpty();
    }

    
    void print() {
        helperList.printList();
    }

    
    int getSize() {
        return helperList.length;
    }

}
