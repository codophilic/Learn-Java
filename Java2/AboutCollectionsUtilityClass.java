import java.util.*;
import java.util.Arrays;

public class AboutCollectionsUtilityClass{
    public static void main(String[] args) {
        
        //Without Collections class Sorting
        List<Integer> ArraysOfIntegers = new ArrayList<>(Arrays.asList(1000,34,55,77,88, 23,11));
        for(int i=0;i<ArraysOfIntegers.size();i++){
            for(int j=i+1;j<ArraysOfIntegers.size();j++){
                if(ArraysOfIntegers.get(i)>ArraysOfIntegers.get(j)){
                    int temp =ArraysOfIntegers.get(i);
                    ArraysOfIntegers.set(i, ArraysOfIntegers.get(j));
                    ArraysOfIntegers.set(j,temp);
                }
            }
        } 
        System.out.println("Sorted List Using Manual Logic: "+ArraysOfIntegers);


        //With Collections
        Collections.sort(ArraysOfIntegers);
        System.out.println("Sorted List Using Collections.sort: "+ArraysOfIntegers);

        //Reversing
        Collections.reverse(ArraysOfIntegers);
        System.out.println("Reversed Array - "+ArraysOfIntegers);

        //Randomly Shuffles the elements
        Collections.shuffle(ArraysOfIntegers);
        System.out.println("Shuffling: " + ArraysOfIntegers);

        //Find Minium Element
        int min = Collections.min(ArraysOfIntegers);
        System.out.println("Minimum: " + min);


        //Find Maximum Element
        int max = Collections.max(ArraysOfIntegers);
        System.out.println("Maximum: " + max);

        //Binary Search Algorithm (Searches the list for the specified object using the binary search algorithm. The list must be sorted.)
        Collections.sort(ArraysOfIntegers);
        System.out.println("Current Integer List: "+ArraysOfIntegers);
        int index = Collections.binarySearch(ArraysOfIntegers, 23); //Return index value if found else -1
        System.out.println("Index of 23: " + index);
        System.out.println("Index of Element if not found: "+Collections.binarySearch(ArraysOfIntegers, 1));
        
        //Rotation of Elements
        /**
         * Rotates the elements in the specified list by a certain distance. For example, if the distance is positive, 
         * elements are shifted to the right; if negative, they shift to the left.
         */
        System.out.println("Before rotation: " + ArraysOfIntegers);
        Collections.rotate(ArraysOfIntegers, 2);
        System.out.println("After rotating by 2: " + ArraysOfIntegers);
        Collections.rotate(ArraysOfIntegers, -1);
        System.out.println("After rotating by -1: " + ArraysOfIntegers);

        //Swapping two elements by giving index value
        System.out.println("Before swap: " + ArraysOfIntegers);
        Collections.swap(ArraysOfIntegers, 0,6);
        System.out.println("After swap: " + ArraysOfIntegers);

        //Replaces all occurrences of one value with another in the specified list.
        ArraysOfIntegers.add(1000);
        System.out.println("Current Element - "+ArraysOfIntegers);
        Collections.replaceAll(ArraysOfIntegers,1000, 2000);
        System.out.println("Post Replacing elements - "+ArraysOfIntegers);

        //Replaces all elements of the list with the specified value.
        Collections.fill(ArraysOfIntegers, 9);
        System.out.println("Fill: " + ArraysOfIntegers);

        //Count Frequency of a particular Element
        System.out.println("Frequency of Element 9: "+Collections.frequency(ArraysOfIntegers,9));

        //nCopies
        //Returns an immutable list consisting of n copies of the specified object.
        List<String> repeated = Collections.nCopies(5, "Hello"); //Immutable list
        System.out.println("Repeated elements: " + repeated);
        // Uncommenting below will throw UnsupportedOperationException:
        // repeated.add("Hello");

        //Copying Elements
        /**
         * To Copy Elements first we need to create the dummy value of elements in the list.
         * The number of dummy value of elements will be equal to the size of the array list 
         * for which we are performing copying operation.
         * 
         * new ArrayList<>(10) //Will not create dummy value of elements, instead it creates a 
         * space size of 10 inside memory.
         */
        List<String> dest = new ArrayList<>(Collections.nCopies(repeated.size(), "0"));
        System.out.println("Current String List: "+dest);
        Collections.copy(dest, repeated);
        System.out.println("Destination after copy: " + dest);

        //unmodifiableList
        /** Returns an unmodifiable view of the specified list. Any attempt to modify this view will result in an UnsupportedOperationException. */
        List<String> repeatedUnmodifiableList = Collections.unmodifiableList(repeated);
        System.out.println("Unmodifiable List: "+repeatedUnmodifiableList);
        // Attempting to modify will throw an exception:
        //repeatedUnmodifiableList.add("Hello"); // Throws UnsupportedOperationException


        //CheckList
        /**
         * The checkedList() method in Java Collections is used to create a dynamically type-safe view of a list. This means that if you try to add an element of the wrong type to the checked list, it will first give compile time error and even if the code is executed it will throw a ClassCastException at runtime
         */
        List<String> safeList = Collections.checkedList(new ArrayList<>(), String.class);
        safeList.add("Hello");
        // Uncommenting the line below would cause a compile-time error:
        //safeList.add(123);  // Error: incompatible types
        System.out.println("Checked list: " + safeList);

        //SingletonList
        // It creates an immutable list containing only one specified element.
        String element = "Hello";

        // Create a singleton list
        List<String> singletonList = Collections.singletonList(element);

        // Print the list
        System.out.println("Singleton List: "+singletonList);

        // Try to modify the list (will throw a java.lang.UnsupportedOperationException)
        //singletonList.add("World"); 

        //SingletonMap (similarly like SingletonList)
        /** The map returned by singletonMap() is immutable, meaning you cannot add, remove, or modify its entries.
         * It can only hold one key-value pair. */
        // Create a singleton map
        Map<String, Integer> map = Collections.singletonMap("key", 10);

        // Access the value
        System.out.println(map.get("key")); // Output: 10

        // Try to modify the map (will throw an exception)
        // map.put("newKey", 20); // UnsupportedOperationException
    }
}