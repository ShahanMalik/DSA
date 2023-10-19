package stack.UseArray;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pop();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.top);
    }
}
