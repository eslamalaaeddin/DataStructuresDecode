package Stack;

import java.lang.reflect.Array;
import java.util.Arrays;
@SuppressWarnings("All")

public class StackWithArray<T> extends SuperStack<T> {
    public T[] helperArray;
    private Class<T> mClass; //represents the class of generic data held in the array
    private int size;
    int top = -1;

    public StackWithArray( Class<T> mClass, int size) {
        this.size = size;
        this.mClass = mClass;
        this.helperArray = (T[]) Array.newInstance(mClass, size);
    }

    @Override
    void push(T data) {
//        if (isFull()) throw new RuntimeException("Stack is full!"); //Approach for static size stack!
        //Approach for dynamic size stack!
        if (isFull()) {
            System.out.println("Before resizing: " + Arrays.toString(helperArray));
            //create new array with double size of current array
            //move all elements of current array to new array
            T[] newArray = (T[]) Array.newInstance(mClass, 2 * helperArray.length);
            System.arraycopy(helperArray, 0, newArray, 0, helperArray.length);
            //point to new array with reference of current array
            helperArray = newArray;
            System.out.println("After resizing: " + Arrays.toString(helperArray));
            System.out.println("----------------------------");
        }
        helperArray[++top] = data;
    }

    @Override
    T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty!");
        T data = helperArray[top];
        helperArray[top] = null; //Null means empty
        top--;
        return data;
    }

    @Override
    T peek() {
        return helperArray[top];
    }

    @Override
    boolean isEmpty() {
        return top <= -1;
    }

    @Override
    boolean isNotEmpty() {
        return !isEmpty();
    }

    boolean isFull(){
        return top >= helperArray.length - 1;
    }

    @Override
    void print() {
        if (isEmpty()) {
            System.out.println("Sack is Empty!");
            return;
        }
        int tempTop = top;
        while (tempTop >= 0){
            System.out.println(helperArray[tempTop]);
            tempTop--;
        }
        System.out.println("----------------------------");
    }

    @Override
    int getSize() {
        return helperArray.length;
    }

    void clear(){
        while (isNotEmpty()) pop();
    }
}
