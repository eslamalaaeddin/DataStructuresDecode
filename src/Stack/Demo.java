package Stack;

public class Demo {
    public static void main(String[] args) {

    }

    static void testStackBasedArray(){

    }

    static void testStackBasedLinkedList(){
        MyStackWithLinkedList<Integer> myStack = new MyStackWithLinkedList<>();
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(5);

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

        System.out.println("Size: " + myStack.getSize());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.peek());
        myStack.printStack();
        myStack.pop();
        myStack.printStack();

    }
}
