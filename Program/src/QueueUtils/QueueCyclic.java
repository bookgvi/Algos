package QueueUtils;

public class QueueCyclic<T> extends Queue<T> {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int sizeArray;

    public QueueCyclic(int size) {
        super();
        sizeArray = size;
        this.queue = (T[]) new Object[size];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        if (sizeArray <= front) {
            front = 0;
            size = 0;
            rear = -1;
            return null;
        } else if (front == 0 && size == 0) {
            return null;
        }
        T element = queue[front];
        queue[front] = null;
        front++;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
        return element;
    }

    public void enqueue(T val) {
        if (isEmpty()) {
            return;
        }
        rear++;
        if (sizeArray <= size && queue[0] == null) {
            size++;
            rear = 0;
        } else if (sizeArray < size && queue[rear] == null) {
            size++;
        } else if (sizeArray > size && queue[rear] == null) {
            size++;
        } else {
            rear--;
            return;
        }
        queue[rear] = val;
    }
}
