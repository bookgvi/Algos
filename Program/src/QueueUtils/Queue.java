package QueueUtils;

public class Queue<T> implements Top<T>, IsEmpty, Enqueue<T>, Dequeue<T> {
    protected T[] queue;

    public Queue() {
        queue = (T[]) new Object[0];
    }

    @Override
    public T top() {
        if (this.isEmpty()) {
            return null;
        }
        return queue[0];
    }

    public boolean isEmpty() {
        return this.queue.length < 1;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T[] queueTmp = (T[]) new Object[queue.length - 1];
        T firstElem = queue[0];
        System.arraycopy(queue, 1, queueTmp, 0, queue.length - 1);
        queue = queueTmp;
        return firstElem;
    }

    public void enqueue(T val) {
        T[] queueTmp = (T[]) new Object[queue.length + 1];
        System.arraycopy(queue, 0, queueTmp, 0, queue.length);
        queueTmp[queue.length] = val;
        queue = queueTmp;
    }
}
