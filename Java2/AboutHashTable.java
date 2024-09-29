import java.util.Hashtable;

public class AboutHashTable {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Grapes", 3);

        // Displaying the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Accessing a value
        int value = hashtable.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Removing a key-value pair
        hashtable.remove("Grapes");
        System.out.println("Hashtable after removing 'Grapes': " + hashtable);

        // Checking if a key exists
        boolean hasKey = hashtable.containsKey("Apple");
        System.out.println("Does 'Apple' exist? " + hasKey);

        // Displaying the size of the Hashtable
        int size = hashtable.size();
        System.out.println("Size of Hashtable: " + size);
    }
}
