import java.util.HashSet;
import java.util.Iterator;

public class AboutHashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        
        // Duplicate elements are ignored
        set.add("Apple");

        //Adding null elements.
        set.add(null);

        // Displaying the HashSet
        System.out.println("HashSet: " + set); // Elements may not be in insertion order

        // Checking for an element
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Date");
        System.out.println("After removing 'Date': " + set);

        // Iterating over the elements
        System.out.println("Iterating over HashSet:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Checking size
        System.out.println("Size of HashSet: " + set.size());

        // Checking if empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // Cloning the HashSet
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
