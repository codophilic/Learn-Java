import java.util.LinkedHashMap;
import java.util.Map;

public class AboutLinkedHashMap {
    public static void main(String[] args) {
        // Creating LinkedHashMap with initial capacity 4 and load factor 0.75
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(4, 0.75f);
        
        // Adding elements to LinkedHashMap (Insertion order maintained)
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Grapes", 3);
        map.put("Orange", 4);

        System.out.println(map);

        // Accessing the elements using key (Order remains the same)
        System.out.println("Value for 'Banana': " + map.get("Banana"));

        // Iterating over the LinkedHashMap
        System.out.println("Original Order:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Removing an element
        map.remove("Grapes");
        System.out.println("\nAfter Removing 'Grapes':");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Replacing a value
        map.replace("Apple", 5);
        System.out.println("\nAfter Replacing 'Apple' value:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Check if a key exists
        if (map.containsKey("Orange")) {
            System.out.println("\nLinkedHashMap contains 'Orange'");
        }

        // Check if a value exists
        if (map.containsValue(4)) {
            System.out.println("LinkedHashMap contains value 4");
        }

        // Clearing all elements
        map.clear();
        System.out.println("\nAfter Clearing LinkedHashMap: " + map);
    }
}
