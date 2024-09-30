import java.util.ArrayList;
import java.util.Iterator;

public class AboutIterator {
    public static void main(String[] args) {
        // Create an ArrayList (which implements the Iterable interface)
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Ruby");

        // Obtain an iterator from the list
        Iterator<String> iterator = list.iterator();

        System.out.println("Using hasNext() and next() methods:");
        // Use hasNext() and next() to iterate through the list
        while (iterator.hasNext()) {
            // hasNext() checks if there are more elements
            String element = iterator.next(); // next() retrieves the next element
            System.out.println(element);
        }

        // Obtain another iterator to demonstrate remove()
        iterator = list.iterator();
        System.out.println("\nRemoving elements using remove():");
        
        // Traverse and remove "Python" from the list
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Python")) {
                iterator.remove(); // remove the current element ("Python")
                System.out.println("Removed: " + element);
            }
        }

        // Verify that "Python" was removed from the list
        System.out.println("\nFinal list after removal:");
        for (String language : list) {
            System.out.println(language);
        }

        /**
         * Enhanced for loop
         */
        for(String i: list){
            System.out.println(i);
            list.remove(i);
        }
    }
}
