import java.util.LinkedList;
import java.util.List;

public class AboutLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // 1. Adding elements to the LinkedList
        list.add("Apple");           // Add at the end
        list.addFirst("Banana");      // Add at the beginning
        list.addLast("Cherry");       // Add at the end
        list.add(2, "Date");          // Add at specific index

        System.out.println("Initial LinkedList: " + list);

        // 2. Accessing elements
        String firstElement = list.getFirst();     // Get first element
        String lastElement = list.getLast();       // Get last element
        String elementAtIndex = list.get(2);       // Get element at specific index

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Element at index 2: " + elementAtIndex);

        // 3. Removing elements
        list.removeFirst();            // Remove first element
        list.removeLast();             // Remove last element
        list.remove(1);                // Remove element at index 1
        list.remove("Apple");          // Remove specific element

        System.out.println("After removals: " + list);

        // 4. Checking size of LinkedList
        int size = list.size();
        System.out.println("Size of LinkedList: " + size);

        // 5. Checking if an element exists
        boolean containsCherry = list.contains("Cherry");
        System.out.println("Contains 'Cherry'? " + containsCherry);

        // 6. Adding elements in bulk (using another List)
        List<String> newFruits = new LinkedList<>();
        newFruits.add("Elderberry");
        newFruits.add("Fig");

        list.addAll(newFruits);  // Add all elements from newFruits list
        System.out.println("After adding new fruits: " + list);

        // 7. Cloning the LinkedList
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned LinkedList: " + clonedList);

        // 8. Iterating through LinkedList
        System.out.print("Iterating through LinkedList: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 9. Clearing the LinkedList
        list.clear();  // Remove all elements
        System.out.println("After clearing: " + list);

        // 10. Checking if LinkedList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);
    }
}
