package LinkedList;

public class MyLinkedList<T> extends MyList<T> {

    @Override
    public void insertFirst(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) head = node;
        else node.next = head;
        head = node;
        length++;
    }

    @Override
    public void insertLast(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) head = node;
        else tail.next = node;
        tail = node;
        length++;
    }

    @Override
    public void insertAfter(T data, T newData) {
        Node<T> node = findNode(data);
        if (node == null) return;

        Node<T> newNode = new Node<>(newData);
        newNode.next = node.next;
        node.next = newNode;

        if (newNode.next == null)
            tail = newNode;
        length++;
    }

    @Override
    public void insertBefore(T data, T newData) {
        Node<T> node = findNode(data);
        if (node == null) return; // TODO: 12/6/2022 May be we can make our new node as head node?

        Node<T> newNode = new Node<>(newData);
        Node<T> parentNode = findParentNode(data);

        if (parentNode == null)
            head = newNode;
        else {
            newNode.next = node;
            parentNode.next = newNode;
        }
        length++;
    }

    @Override
    public void deleteNode(T data) {

        Node<T> deletedNode = findNode(data);
        if (deletedNode == null) return;

        Node<T> parentOfDeletedNode = findParentNode(data);

        if (deletedNode == head && deletedNode == tail) {
            head = null;
            tail = null;
        } else {
            //if it is the tail
            if (deletedNode == tail) {
                parentOfDeletedNode.next = null;
                tail = parentOfDeletedNode;
            }

            //if it is the head
            else if (deletedNode == head) head = deletedNode.next;

            else parentOfDeletedNode.next = deletedNode.next;

        }
        deletedNode = null;
        length--;
    }


    @Override
    public void printList() {
        System.out.println("---------------------------");
        System.out.println("Head: " + head);
        System.out.println("Tail: " + tail);
        Iterator<T> iterator = initIterator();
        if (iterator == null) {
            System.out.println("NULL");
            return;
        }
        while (iterator.getCurrentNode() != null) {
            System.out.print(iterator.getData() + " -> ");
            iterator = new Iterator<>(iterator.getNextNode());
        }
        System.out.println("NULL");
        System.out.println("---------------------------");
    }

    Node<T> findParentNode(T data) {
        Iterator<T> iterator = initIterator();
        while (iterator.getCurrentNode() != null && iterator.getNextNode() != null) {
            if (iterator.getNextNode().data == data)
                return iterator.getCurrentNode();
            iterator = new Iterator<>(iterator.getNextNode());
        }
        return null;
    }

}
