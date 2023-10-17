package stack;

class Stack {
    int top;
    int size;
    int[] stack;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int data) {
        if (!isFull()) {
            this.stack[++top] = data;
        } else {
            System.out.println("Stack is Full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return this.stack[top--];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return this.stack[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }
}
