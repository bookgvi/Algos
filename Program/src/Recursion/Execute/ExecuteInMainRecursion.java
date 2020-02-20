package Recursion.Execute;

public class ExecuteInMainRecursion<T> {
    private Execute<T> exec;

    public ExecuteInMainRecursion(Execute<T> exec) {
        this.exec = exec;
    }

    public T run(T val) {
        return exec.exec(val);
    }
}
