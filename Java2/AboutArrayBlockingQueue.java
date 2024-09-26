import java.util.concurrent.ArrayBlockingQueue;

public class AboutArrayBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        // Create a fixed size ArrayBlockingQueue with capacity of 3
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3,true);
        
        // Add elements to the queue
        System.out.println("Adding elements:");
        queue.add("A");  // Successful add
        queue.offer("B"); // Successful offer
        queue.put("C");   // Successful put (blocks if full)
        
        System.out.println("Queue after adding: " + queue);  // [A, B, C]
        
        // Attempting to add more elements (queue is full)
        System.out.println("Trying to add when queue is full:");
        try {
            queue.add("D");  // Throws IllegalStateException (queue is full)
        } catch (IllegalStateException e) {
            System.out.println("Exception in add(): " + e.getMessage());
        }
        
        boolean offerSuccess = queue.offer("E"); // Returns false (queue is full)
        System.out.println("Offer result: " + offerSuccess);
        
        // Removing elements from the queue
        System.out.println("Removing elements:");
        System.out.println("Removed: " + queue.remove());  // Removes "A"
        System.out.println("Polled: " + queue.poll());      // Removes "B"
        
        // Blocking call - takes an element (will block if empty)
        String takenElement = queue.take();  // Removes "C"
        System.out.println("Taken: " + takenElement);
        
        // Attempting to remove when queue is empty
        System.out.println("\nTrying to remove when queue is empty:");
        System.out.println("Polled: " + queue.poll());  // Returns null (queue is empty)
        
        // Checking size and remaining capacity
        System.out.println("\nSize: " + queue.size());  // 0 (since it's empty)
        System.out.println("Remaining Capacity: " + queue.remainingCapacity());  // 3 (max capacity - current size)
        
        // Peeking at the head (will return null since queue is empty)
        System.out.println("\nPeek: " + queue.peek());  // Returns null
        
        // Add again and see fairness in action (Optional feature)
        queue.put("X");
        queue.put("Y");
        System.out.println("Queue after adding more elements: " + queue);  // [X, Y]
    }
}
