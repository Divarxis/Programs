public class StackApple {
    private int maxSize;        // Maximum size of the stack
    private int[] stackArray;   // Array to store stack elements
    private int top;            // Index of the top element in the stack

    // Constructor to initialize the stack with a given maximum size
    public StackApple(int maxSize) {
        this.maxSize = maxSize;                     // Initialize maximum size
        this.stackArray = new int[maxSize];        // Create array with specified size
        this.top = -1;                              // Initialize top pointer to -1 (empty stack)
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;                  // Increment top and add value to stack
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // or throw an exception
        }
        return stackArray[top--];                   // Return top element and decrement top
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // or throw an exception
        }
        return stackArray[top];                     // Return top element
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);                         // Stack is empty if top is -1
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);                // Stack is full if top is equal to maxSize - 1
    }

    // Main method to test the StackApple class
    public static void main(String[] args) {
        StackApple stack = new StackApple(5);                 // Create a stack with maximum size of 5

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Pop elements from the stack and print them
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Peek at the top element of the stack without removing it
        System.out.println("Peeked element: " + stack.peek());
    }
}
