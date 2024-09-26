import java.util.PriorityQueue;

public class AboutPriorityQueue {
    public static void main(String[] args) {
        // Creating a PriorityQueue for Integers (natural ordering: smallest value has the highest priority)
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();

        // offer() / add() - Adding elements
        intQueue.offer(10);
        intQueue.add(20);
        intQueue.offer(30);
        intQueue.add(5);  // Highest priority since 5 is the smallest

        // peek() - Checking the front or head (element with highest priority)
        System.out.println("Peek (highest priority): " + intQueue.peek());  // Output: 5

        // poll() - Retrieving and removing the front or head
        System.out.println("Poll (removed): " + intQueue.poll());  // Output: 5 (smallest)
        
        // Check remaining elements in queue
        System.out.println("Peek (after poll): " + intQueue.peek());  // Output: 10

        // remove() - Removing a specific element , returns true of false if element found was removed or not
        intQueue.remove(10);
        System.out.println("After removing 10, Peek: " + intQueue.peek());  // Output: 20

        // contains() - Check if an element is present
        System.out.println("Contains 20? " + intQueue.contains(20));  // Output: true

        // size() - Get the size of the queue
        System.out.println("Size: " + intQueue.size());  // Output: 1

        // isEmpty() - Check if the queue is empty
        System.out.println("Is queue empty? " + intQueue.isEmpty());  // Output: false

        // clear() - Clear the queue
        intQueue.clear();
        System.out.println("Is queue empty after clear? " + intQueue.isEmpty());  // Output: true


        // Creating a PriorityQueue for Strings (natural ordering: lexicographical, alphabetically ordering)
        PriorityQueue<String> stringQueue = new PriorityQueue<>();

        // offer() - Adding elements
        stringQueue.offer("banana");
        stringQueue.offer("apple");  // This will have the highest priority (alphabetically smallest)
        stringQueue.offer("cherry");

        // peek() - Checking the head
        System.out.println("Peek (highest priority): " + stringQueue.peek());  // Output: apple

        // poll() - Retrieving and removing the head
        System.out.println("Poll (removed): " + stringQueue.poll());  // Output: apple

        // Check remaining elements in queue
        System.out.println("Peek (after poll): " + stringQueue.peek());  // Output: banana

        // remove() - Removing a specific element
        stringQueue.remove("banana");
        System.out.println("After removing 'banana', Peek: " + stringQueue.peek());  // Output: cherry

        // contains() - Check if an element is present
        System.out.println("Contains 'cherry'? " + stringQueue.contains("cherry"));  // Output: true

        // size() - Get the size of the queue
        System.out.println("Size: " + stringQueue.size());  // Output: 1

        // isEmpty() - Check if the queue is empty
        System.out.println("Is queue empty? " + stringQueue.isEmpty());  // Output: false

        // clear() - Clear the queue
        stringQueue.clear();
        System.out.println("Is queue empty after clear? " + stringQueue.isEmpty());  // Output: true
    }
}
