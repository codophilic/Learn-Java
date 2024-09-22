import java.util.Vector;

public class AboutVector {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // 1. Adding elements
        vector.add("Apple");           // Add at the end
        vector.add("Banana");          // Add at the end
        vector.add("Cherry");          // Add at the end
        vector.add(1, "Mango");        // Add at specific index
        System.out.println("Initial Vector: " + vector);

        // 2. Accessing elements
        String firstElement = vector.firstElement();  // Get first element
        String lastElement = vector.lastElement();    // Get last element
        String elementAtIndex = vector.get(2);        // Get element at index 2

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Element at index 2: " + elementAtIndex);

        // 3. Checking size and capacity
        int size = vector.size();           // Get the size
        int capacity = vector.capacity();   // Get the capacity

        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);

        // 4. Removing elements
        vector.remove("Mango");            // Remove specific element
        vector.remove(1);                   // Remove element at index 1
        System.out.println("After removals: " + vector);

        // 5. Checking if an element exists
        boolean containsCherry = vector.contains("Cherry");
        System.out.println("Contains 'Cherry'? " + containsCherry);

        // 6. Index of elements
        int index = vector.indexOf("Banana");  // Get index of element
        System.out.println("Index of 'Banana': " + index);

        // 7. Cloning the Vector
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // 8. Iterating through the Vector
        System.out.print("Iterating through Vector: ");
        for (String fruit : vector) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 9. Clearing the Vector
        vector.clear();  // Remove all elements
        System.out.println("After clearing: " + vector);

        // 10. Checking if Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is the Vector empty? " + isEmpty);

        // 11. Adding all elements from another collection
        Vector<String> newFruits = new Vector<>();
        newFruits.add("Orange");
        newFruits.add("Grapes");

        vector.addAll(newFruits);  // Add all elements from newFruits
        System.out.println("After adding new fruits: " + vector);

        // 12. Replacing an element
        vector.set(0, "Kiwi");  // Replace element at index 0
        System.out.println("After replacing first element: " + vector);

        // 13. Trimming the capacity
        vector.trimToSize();  // Reduce capacity to current size
        System.out.println("Capacity after trim: " + vector.capacity());
    }
}
