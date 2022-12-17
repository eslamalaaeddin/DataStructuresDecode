package Stack;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        testStackBasedLinkedList();
//        testStackBasedArray();
    }


    static void testStackBasedArray(){
        StackWithArray<Integer> stack = new StackWithArray<>(Integer.class, 5);

        stack.push(1);
        stack.print();

        stack.push(2);
        stack.print();

        stack.push(5);
        stack.print();

        stack.push(10);
        stack.print();

        stack.push(3);
        stack.print();

        System.out.println("Peek: " + stack.peek());
        stack.print();

        System.out.println("Pop: " + stack.pop());
        stack.print();

        stack.push(15);
        stack.print();

        for (int i = 0 ; i < 30 ; i++){
            stack.push(i);
        }

        stack.print();

        stack.clear();
        stack.print();

    }

    static void testStackBasedLinkedList(){
        StackWithLinkedList<Integer> myStack = new StackWithLinkedList<>();
        System.out.println(myStack.isEmpty());

        myStack.push(1);
        myStack.push(2);
        myStack.push(5);
        myStack.print();


        System.out.println("Size: " + myStack.getSize());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.peek());
        myStack.print();
        myStack.pop();
        myStack.print();

        while (myStack.isNotEmpty()){
            System.out.println(myStack.pop());
        }

    }
}
