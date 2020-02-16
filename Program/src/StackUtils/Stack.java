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
        T[] arrayTmp = (T[]) new Object[array.length + 1];
        System.arraycopy(array, 0, arrayTmp, 0, array.length);
        arrayTmp[array.length] = (T) val;
        array = arrayTmp;
    }

    public T pop() {
        T res = array[array.length - 1];
        T[] arrayTmp = (T[]) new Object[array.length - 1];
        System.arraycopy(array,0, arrayTmp, 0, array.length - 1);
        array = arrayTmp;
        return res;
    }

    public T peek() {
        return array[array.length - 1];
    }
}
