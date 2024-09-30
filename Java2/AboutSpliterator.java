import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class AboutSpliterator {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Ruby");
        list.add("Go");

        // Getting a Spliterator from the list
        /**
         * A Spliterator is an object that knows how to traverse (iterate over) the elements in the list, 
         * but it can also split the list for parallel processing.
         */
        Spliterator<String> spliterator = list.spliterator();

        // Using tryAdvance() method to process elements one by one
        /**
         * This method processes only the next element in the list (starting from the first element) 
         * and then moves to the next element.
         * If an element exists, it runs the code in the accept() method (in this case, it prints the element).
         * only prints the first element because it's designed to move forward one step at a time.
         */
        System.out.println("Using tryAdvance():");
        spliterator.tryAdvance(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Using forEachRemaining() to process remaining elements
        /**
         * This method processes all remaining elements from where the Spliterator left off. 
         * It keeps moving through the list and applies the code (here, printing) to every remaining element.
         */
        System.out.println("\nUsing forEachRemaining():");
        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Splitting the list into two parts using trySplit()
        Spliterator<String> spliterator2 = list.spliterator();

        /**
         * List Size//2 , the list is split roughly in half
         */
        Spliterator<String> spliteratorPart = spliterator2.trySplit();

        if (spliteratorPart != null) {
            System.out.println("\nFirst half:");
            spliteratorPart.forEachRemaining(System.out::println); // Processing first part
        }

        System.out.println("\nSecond half:");
        spliterator2.forEachRemaining(System.out::println); // Processing second part
    }
}
