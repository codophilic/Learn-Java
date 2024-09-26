import java.util.ArrayDeque;
import java.util.Deque;

public class AboutArrayDeque {
    public static void main(String[] args) {
        // Creating an ArrayDeque instance
        Deque<Integer> deque = new ArrayDeque<>();

        // Insertion operations
        deque.addFirst(10);  // [10]
        deque.addLast(20);   // [10, 20]
        deque.offerFirst(5); // [5, 10, 20]
        deque.offerLast(25); // [5, 10, 20, 25]
        // deque.add(null);

        System.out.println("Deque after insertions: " + deque);

        // Access and retrieval operations
        System.out.println("First element (getFirst): " + deque.getFirst());  // Output: 5
        System.out.println("Last element (getLast): " + deque.getLast());     // Output: 25
        System.out.println("First element (peekFirst): " + deque.peekFirst()); // Output: 5
        System.out.println("Last element (peekLast): " + deque.peekLast());    // Output: 25

        // Removal operations
        System.out.println("Removed first element (removeFirst): " + deque.removeFirst()); // Removes 5
        System.out.println("Removed last element (removeLast): " + deque.removeLast());   // Removes 25
        System.out.println("Deque after removals: " + deque);

        // Polling operations
        System.out.println("Polled first element (pollFirst): " + deque.pollFirst()); // Removes 10
        System.out.println("Polled last element (pollLast): " + deque.pollLast());   // Removes 20
        System.out.println("Deque after polling: " + deque);  // Empty deque
    }
}
