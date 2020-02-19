package Recursion.Execute;

public class ExecuteInMainRecursion {
    private Execute exec;
    public ExecuteInMainRecursion(Execute exec) {
        this.exec = exec;
    }
    public Object run(Object val) {
        return exec.exec(val);
    }
}
