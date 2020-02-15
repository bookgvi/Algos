package Utils;

import Sort.Execute;

public class FunctionSpeed {
    private Execute func;
    private int[] result;
    private long timeOfExecution;

    public FunctionSpeed(Execute func) {
        this.func = func;
    }

    public int[] evaluateSpeed(int count) {
        if (count > 0) {
            count--;
            long time = System.currentTimeMillis();
            this.result = this.func.exec();
            this.timeOfExecution += System.currentTimeMillis() - time;
            evaluateSpeed(count);
        }
        return result;
    }

    public long getTimeOfExecution(int count) {
        return timeOfExecution / count;
    }
}
