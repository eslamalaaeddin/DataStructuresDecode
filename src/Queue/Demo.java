package Queue;

public class Demo {
    public static void main(String[] args) {
        QueueWithLinkedList<Integer> queue = new QueueWithLinkedList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();

        queue.enqueue(8);
        queue.enqueue(12);
        queue.enqueue(20);
        queue.print();

        System.out.println("Peek: " + queue.peek());

        while (queue.isNotEmpty()){
            queue.dequeue();
        }

        System.out.println(queue.getSize());

    }
}
