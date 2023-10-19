package stack.UseLinklist;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // Stack OverFlow

        stack.show();

        stack.pop(); // 1
        stack.pop(); // 2
        stack.pop(); // 3
        stack.pop(); // 4
        stack.pop(); // 5 Stack underFlow

        stack.show();
        stack.peek();
    }
}
