package stack.UseArray;

public class Stack {
    int top = 0;
    int len = 5;
    int[] stack = new int[len];

    public void push(int value) {
        try {
            if (top >= len) {
                throw new Exception("Stack overflow");
            } else {
                stack[++top] = value;
                // System.out.println(top++);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void peek() {
        System.out.println(stack[top]);
    }

    public void pop() {
        try {
            if (top != 0) {
                stack[top] = 0;
                top--;
            } else {
                throw new Exception("Stack underFlow");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
