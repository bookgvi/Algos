package QueueUtils;

import Utils.ExecuteInMainAbstract;

public class ExecuteInMainQueue extends ExecuteInMainAbstract {
    private final int FIRST = 11, SECOND = 12, THIRD = 13, FOURTH = 666;

    public void executeCyclic() {
        QueueCyclic<Integer> queueCyclic = new QueueCyclic<>(5);
        queueCyclic.enqueue(FIRST);
        queueCyclic.enqueue(SECOND);
        queueCyclic.enqueue(THIRD);
        queueCyclic.enqueue(FOURTH);
        System.out.printf("Is queue empty? %b\n", queueCyclic.isEmpty());
        System.out.printf("Top %d\n", queueCyclic.top());
        queueCyclic.dequeue();
        queueCyclic.dequeue();
        queueCyclic.dequeue();
        queueCyclic.enqueue(FOURTH);
        queueCyclic.dequeue();
    }

    public void executeSimple() {
        Queue<Integer> queueX = new Queue<>();
        System.out.printf("\nCreating queue... Is it empty - %b\n", queueX.isEmpty());
        System.out.printf("Попытка удалить элемент из пустой очереди: %d\n", queueX.dequeue());
        System.out.printf("Добавим несколько элементов в очередь... %d, %d, %d\n", FIRST, SECOND, THIRD);
        queueX.enqueue(FIRST);
        queueX.enqueue(SECOND);
        queueX.enqueue(THIRD);
        System.out.printf("Удаляю элемент из начала очереди... (%d)\n", queueX.dequeue());
        System.out.printf("Первый элемент в очереди: %d\n", queueX.top());
        System.out.printf("Is queue empty? %b\n\n", queueX.isEmpty());

    }
}
