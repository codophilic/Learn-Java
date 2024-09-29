import java.util.HashMap;
import java.util.Map;

public class AboutHashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. put() - Adding key-value pairs (fruits-price)
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // 2. get() - Retrieving value by key
        System.out.println("Apple Count: " + map.get("Apple")); // Output: 10

        // 3. containsKey() - Check if a key exists, returns true or false
        if (map.containsKey("Banana")) {
            System.out.println("Banana exists in the map.");
        }

        // 4. containsValue() - Check if a value exists, returns true or false
        if (map.containsValue(30)) {
            System.out.println("A value of 30 exists in the map.");
        }

        // 5. remove() - Remove an entry by key
        map.remove("Banana");
        System.out.println("After removing Banana: " + map);

        // 6. size() - Get the number of entries in the map
        System.out.println("Map Size: " + map.size()); // Output: 2

        // 7. isEmpty() - Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map is not empty.");
        }

        // 8. keySet() - Get all the keys
        System.out.println("Keys: " + map.keySet());

        // 9. values() - Get all the values
        System.out.println("Values: " + map.values());

        // 10. entrySet() - Iterate over key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 11. putIfAbsent() - Adds the key-value pair if the key does not already exist
        map.putIfAbsent("Orange", 40); // Won't add since "Orange" already exists
        map.putIfAbsent("Grapes", 50); // Adds because "Grapes" doesn't exist
        System.out.println("After putIfAbsent: " + map);

        // 12. replace() - Replace a value for a specific key
        map.replace("Apple", 100);
        System.out.println("After replacing Apple: " + map);

        // 13. clear() - Remove all entries
        map.clear();
        System.out.println("Map after clearing: " + map);

        //14. Adding Null key
        map.put(null, -1);
        System.out.println("Added null key: "+map);
    }
}
