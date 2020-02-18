package LinksUtils;

public class FunctionSpeed {
    private Execute func;
    private int[] result;
    private long timeOfExecution;

    public FunctionSpeed(Execute func) {
        this.func = func;
    }

    public void evaluateSpeed(int count, int[] arr, LinkListSort linkListSort) {
        if (count > 0) {
            count--;
            long time = System.currentTimeMillis();
            this.func.exec(arr, linkListSort);
            this.timeOfExecution += System.currentTimeMillis() - time;
            evaluateSpeed(count, arr, linkListSort);
        }
    }

    public long getTimeOfExecution(int count) {
        return timeOfExecution / count;
    }
}
