package Stack;

public abstract class SuperStack<T> {
    abstract void push(T data);

    abstract T pop();

    abstract T peek();

    abstract boolean isEmpty();
    abstract boolean isNotEmpty();

    abstract void print();

    abstract int getSize();
}
