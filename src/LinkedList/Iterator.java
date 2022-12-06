package LinkedList;

public class Iterator<T> {
    private Node<T> currentNode;

    public Iterator(Node<T> currentNode) {
        this.currentNode = currentNode;
    }

    public Node<T> getCurrentNode() {
        return currentNode;
    }

    public T getData() {
        return currentNode.data;
    }

    public Node<T> getNextNode() {
        return currentNode.next;
    }
}
