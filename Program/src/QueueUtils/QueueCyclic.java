package QueueUtils;

/*
 * TODO: доделать интерфейсы для некоторых других методов!!!
 */
public class QueueCyclic<T> extends Queue<T> implements DequeueCyclic<T>, EnqueueCyclic<T> {
    private T[] queueCyclic;
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int sizeArray;

    public QueueCyclic(int size) {
        super();
        sizeArray = size;
        queueCyclic = (T[]) new Object[size];
    }

    @Override
    public T dequeueCyclic() {
        if (sizeArray <= front) {
            front = 0;
            size = 0;
            rear = -1;
            return null;
        } else if (front == 0 && size == 0) {
            return null;
        }
        T element = queueCyclic[front];
        queueCyclic[front] = null;
        front++;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
        return element;
    }

    public void enqueueCyclic(T val) {
        rear++;
        if (sizeArray <= size && queueCyclic[0] == null) {
            size++;
            rear = 0;
        } else if (sizeArray < size && queueCyclic[rear] == null) {
            size++;
        } else if (sizeArray > size && queueCyclic[rear] == null) {
            size++;
        } else {
            rear--;
            return;
        }
        queueCyclic[rear] = val;
    }
}
