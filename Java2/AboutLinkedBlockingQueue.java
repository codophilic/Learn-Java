import java.util.concurrent.LinkedBlockingQueue;

public class AboutLinkedBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        
        // Create a LinkedBlockingQueue with capacity 5
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(5);

        // Adding elements using offer (uses ReentrantLock)
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        
        // Adding elements using put (uses ReentrantLock)
        queue.put("Date");
        queue.put("Elderberry");

        System.out.println(queue);

        // offer
        boolean isAdded = queue.offer("Fig");  // Will fail as queue is full
        System.out.println("Was Fig added? " + isAdded);
        System.out.println(queue);

        // Retrieve elements from the queue
        System.out.println("Head of the queue (using peek): " + queue.peek());  // Non-blocking
        
        // Removing elements using take (blocking if empty)
        System.out.println("Removed element: " + queue.take());  // Removes "Apple"
        
        // Removing elements using poll (non-blocking)
        System.out.println("Removed element: " + queue.poll());  // Removes "Banana"
        
        // poll
        String removedElement = queue.poll();  // Removes "Cherry"
        System.out.println("Removed: " + removedElement);
        
        // Remaining queue size
        System.out.println("Queue size: " + queue.size());

        // Check if queue contains an element
        System.out.println("Does queue contain 'Date'? " + queue.contains("Date"));

        // Add multiple elements at once
        queue.addAll(java.util.Arrays.asList("Grapes", "Honeydew"));

        // Remove specific element
        queue.remove("Honeydew");

        // Drain all elements into another collection
        java.util.List<String> drainedElements = new java.util.ArrayList<>();
        queue.drainTo(drainedElements);
        System.out.println("Drained elements: " + drainedElements);

        // Final queue size after draining
        System.out.println("Queue size after draining: " + queue.size());
    }
}
