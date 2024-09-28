import java.util.LinkedHashSet;

public class AboutLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        // Adding elements
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Grapes");
        lhs.add("Orange");

        System.out.println("LinkedHashSet: " + lhs);  // Preserves insertion order
        
        // Checking if element exists
        System.out.println("Contains Banana? " + lhs.contains("Banana"));

        // Removing an element
        lhs.remove("Grapes");
        System.out.println("After removal: " + lhs);

        // Iterating over LinkedHashSet
        System.out.println("Iterating:");
        for (String fruit : lhs) {
            System.out.println(fruit);
        }
        
        // Getting size
        System.out.println("Size of LinkedHashSet: " + lhs.size());

        // Clearing the LinkedHashSet
        lhs.clear();
        System.out.println("After clearing: " + lhs);
    }
}
