package QueueUtils;

public interface Dequeue<T> {
    /**
     * удаляет элемент из начала очереди
     */
    T dequeue();
}
