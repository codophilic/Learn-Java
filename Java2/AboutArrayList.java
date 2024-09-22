import java.util.ArrayList;
import java.util.List;

public class AboutArrayList {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        List<String> fruits = new ArrayList<>();

        // 2. Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("Fruits: " + fruits);

        // 3. Get element by index
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // 4. Update (set) an element at a particular index
        fruits.set(1, "Mango");
        System.out.println("Updated Fruits: " + fruits);

        // 5. Remove an element by index
        fruits.remove(2);
        System.out.println("Fruits after removing index 2: " + fruits);

        // 6. Check the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // 7. Iterate over the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Does list contain 'Mango'? " + fruits.contains("Mango"));


        // 8. Clear the ArrayList
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits);
        
        ArrayList a1 = new ArrayList();
        a1.add("123");
        a1.add(123);
        a1.add(1.23);
        //Not Type Safe Array because manual casting is required
        String var=a1.get(0).toString();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.ensureCapacity(100); // Pre-allocate space for 100 elements

        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");

        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();
        System.out.println(clonedList);  // Output: [Apple, Banana]

    }
}
