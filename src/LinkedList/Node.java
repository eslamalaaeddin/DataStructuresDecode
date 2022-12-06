package LinkedList;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> previous;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" + data + "}";
    }
}
