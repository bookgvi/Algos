package QueueUtils;

public interface Enqueue<T> {
    /**
     * вставляет элемент в конец очереди
     */
    void enqueue(T val);
}
