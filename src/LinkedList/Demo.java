package LinkedList;

import java.math.BigInteger;

public class Demo {
    public static void main(String[] args) {
        testDoubleyLinkedList();

    }

    static void testSinglyLinkedList(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.insertLast(1);
        myLinkedList.insertLast(2);
        myLinkedList.insertLast(3);
        myLinkedList.insertLast(4);

        myLinkedList.printList();

        myLinkedList.insertAfter(3, 5);

        myLinkedList.printList();

        myLinkedList.insertBefore(3, 19);

        myLinkedList.printList();

        myLinkedList.deleteNode(1);
        myLinkedList.printList();

        myLinkedList.deleteNode(4);
        myLinkedList.printList();

        myLinkedList.deleteNode(3);
        myLinkedList.printList();

        myLinkedList.deleteNode(2);
        myLinkedList.deleteNode(5);

        myLinkedList.printList();

        myLinkedList.deleteNode(19);

        myLinkedList.printList();
    }

    static void testDoubleyLinkedList(){
        MyDoubleyLinkedList<Integer> myDoubleyLinkedList = new MyDoubleyLinkedList<>();
        myDoubleyLinkedList.insertLast(1);
        myDoubleyLinkedList.insertLast(2);
        myDoubleyLinkedList.insertLast(3);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.insertAfter(2, 24);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.insertAfter(3, 60);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.deleteNode(60);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.deleteNode(1);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.deleteNode(24);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.insertBefore(3, 13);
        myDoubleyLinkedList.printList();

        myDoubleyLinkedList.insertBefore(2, 122);
        myDoubleyLinkedList.printList();

        MyList<Integer> newList = myDoubleyLinkedList.copyLinkedList();
        newList.printList();

        // Comparing Hashes of old list and new list to prove they don't share the same reference (address)
        System.out.println(myDoubleyLinkedList);
        System.out.println(newList);
    }
}
