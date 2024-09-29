import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class AboutTreeMap {

    static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            // Sort strings by length. If lengths are equal, sort by natural order (alphabetical).
            int lenCompare = Integer.compare(str1.length(), str2.length());
            return (lenCompare != 0) ? lenCompare : str1.compareTo(str2);
        }
    }
    
    public static void main(String[] args) {
        // Creating a TreeMap instance
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Cherry");
        treeMap.put(2, "Date");

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing entries
        /**
         * Returns the smallest (first) and largest (last) key in the map
         */
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        
        /**
         * Returns the entry (key-value pair) with the smallest and largest key.
         */
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());

        // Navigating through the TreeMap
        System.out.println("Lower Key (less than 3): " + treeMap.lowerKey(3));
        System.out.println("Higher Key (greater than 3): " + treeMap.higherKey(3));

        // SubMap example
        /**
         * Returns a view of the portion of the map whose keys range from fromKey (inclusive) to toKey (exclusive).
         */
        SortedMap<Integer, String> subMap = treeMap.subMap(2, 4);
        System.out.println("SubMap (from key 2 to 4): " + subMap);

        // HeadMap and TailMap
        /**
         * Returns a view of the portion of the map whose keys are strictly less than (headMap) or greater than or equal to (tailMap) the specified key.
         */
        System.out.println("HeadMap (keys < 3): " + treeMap.headMap(3));
        System.out.println("TailMap (keys >= 3): " + treeMap.tailMap(3));

        // Removing an entry
        treeMap.remove(2);
        System.out.println("After Removing Key 2: " + treeMap);

        // Updating a value
        treeMap.put(3, "Apricot");
        System.out.println("After Updating Key 3: " + treeMap);

        //Inserting Null
        /**
         * Throws java.lang.NullPointerException
         */
        //treeMap.put(null,null);

        // Custom comparator to sort keys in descending order
        TreeMap<Integer, String> treeMap1 = new TreeMap<>(Comparator.reverseOrder());

        treeMap1.put(1, "Banana");
        treeMap1.put(2, "Apple");
        treeMap1.put(3, "Cherry");

        // Display TreeMap
        System.out.println("treeMap1: " + treeMap1);

        // Checking if null keys can be inserted
        try {
            treeMap1.put(null, "Grapes");
        } catch (NullPointerException e) {
            System.out.println("Null keys are not allowed in TreeMap.");
        }

        // Navigating the TreeMap
        System.out.println("First Entry: " + treeMap1.firstEntry());
        System.out.println("Last Entry: " + treeMap1.lastEntry());

        // Create a TreeMap with a custom comparator
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(new LengthComparator());

        // Add elements to TreeMap
        treeMap2.put("Banana", 1);
        treeMap2.put("Apple", 2);
        treeMap2.put("Cherry", 3);
        treeMap2.put("Date", 4);

        // Display TreeMap sorted by the custom comparator (by length of the string)
        System.out.println("TreeMap sorted by custom comparator (length of keys):");
        for (Map.Entry<String, Integer> entry : treeMap2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
