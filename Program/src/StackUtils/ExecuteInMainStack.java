package StackUtils;

public class ExecuteInMainStack {
    public void executeString() {
        Stack<String> stackS = new Stack<String>();
        System.out.printf("\nStack size = %d\n", stackS.size());
        System.out.printf("Stack pop(): value = %S\n", stackS.pop());
        System.out.printf("Stack peek(): value = %S\n", stackS.peek());
    }

    public void executeNumber() {
        Stack<Integer> stackX = new Stack<Integer>();
        System.out.printf("\nCreating... Stack size = %d\n", stackX.size());
        System.out.print("Stack push(1)\n");
        System.out.print("Stack push(100)\n");
        System.out.print("Stack push(222)\n");
        stackX.push(1);
        stackX.push(100);
        stackX.push(222);
        System.out.printf("Stack size = %d\n", stackX.size());
        System.out.printf("Stack pop(): value = %d\n", stackX.pop());
        System.out.printf("Stack pop(): value = %d\n", stackX.pop());
        System.out.printf("Stack size = %d\n", stackX.size());
        System.out.printf("Stack peek(): value = %d\n", stackX.peek());

    }
}
