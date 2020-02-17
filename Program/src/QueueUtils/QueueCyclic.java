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
        /*
         * Если массив пустой,
         * голова очереди сдвинулась к концу массива или дальши
         * или размер очереди 0 и начало очереди 0
         */
        if (isEmpty() || (sizeArray <= front) || (front == 0 && size == 0)) {
            front = 0;
            size = 0;
            rear = -1;
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
        } else if (sizeArray != size && queue[rear] == null) {
            size++;
        } else {
            rear--;
            return;
        }
        queue[rear] = val;
    }
}
