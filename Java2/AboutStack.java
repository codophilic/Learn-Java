import java.util.Stack;

public class AboutStack {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // 1. Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack);

        // 2. Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top element (Peek): " + topElement);

        // 3. Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // 4. Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // 5. Get the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);

        // 6. Search for an element
        int position = stack.search("Banana");  // Returns 1-based index
        System.out.println("Position of 'Banana': " + position);

        // 7. Clear the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
