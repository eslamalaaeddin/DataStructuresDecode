package LinkedList;

public class MyDoubleyLinkedList<T> extends MyList<T> {
    @Override
    protected void insertFirst(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) head = node;
        else {
            head.previous = node;
            node.next = head;
        }
        head = node;
        length++;
    }

    @Override
    public void insertLast(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) head = node;
        else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        length++;
    }

    @Override
    public void insertAfter(T data, T newData) {
        Node<T> newNode = new Node<>(newData);
        Node<T> afterNode = findNode(data);
        if (afterNode == null) return;

        newNode.previous = afterNode;
        newNode.next = afterNode.next;
        afterNode.next = newNode;

        if (newNode.next != null)  newNode.next.previous = newNode;
        else tail = newNode;
        length++;
    }

    @Override
    public void insertBefore(T data, T newData) {
        Node<T> newNode = new Node<>(newData);
        Node<T> beforeNode = findNode(data);

        if (beforeNode == null) return;

        if (beforeNode == head){
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        else {
            newNode.next = beforeNode;
            newNode.previous = beforeNode.previous;
            beforeNode.previous.next = newNode;
            beforeNode.previous = newNode;
        }
        length++;
    }

    @Override
    public void deleteNode(T data) {
        Node<T> deletedNode = findNode(data);
        if (deletedNode == null) return;
        if (deletedNode == head && deletedNode == tail){
            head = null;
            tail = null;
        }
        else{
            if (deletedNode == head){
                deletedNode.next.previous = null;
                head = deletedNode.next;
            }

            else if (deletedNode == tail){
                deletedNode.previous.next = null;
                tail = deletedNode.previous;
            }

            else {
                deletedNode.previous.next = deletedNode.next;
                deletedNode.next.previous = deletedNode.previous;
            }

        }
        deletedNode = null;
        length--;
    }


    @Override
    public void printList() {
        System.out.println("Head: " + head);
        System.out.println("Tail: " + tail);
        System.out.println("Length: " + length);
        Iterator<T> iterator = initIterator();
        if (iterator == null) {
            System.out.println("NULL");
            return;
        }
        while (iterator.getCurrentNode() != null) {
            System.out.print(iterator.getData() + " <-> ");
            iterator = new Iterator<>(iterator.getNextNode());
        }
        System.out.println("NULL");
        System.out.println("---------------------------");
    }
}
