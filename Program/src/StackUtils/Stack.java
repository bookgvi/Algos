package StackUtils;

public class Stack<T> implements Size, Push<T>, Pop<T>, Peek<T> {
    private T[] array;

    public Stack() {
        array = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return array.length;
    }

    public void push(Object val) {
        array = (T[]) new Object[array.length + 1];
        array[array.length - 1] = (T) val;
    }

    public T pop() {
        T res = array[array.length - 1];
        array = (T[]) new Object[array.length - 1];
        return res;
    }

    public T peek() {
        return array[array.length - 1];
    }
}