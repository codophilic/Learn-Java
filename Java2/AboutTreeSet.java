import java.util.Comparator;
import java.util.TreeSet;

public class AboutTreeSet {

    // Custom Comparator to sort integers based on sum of digits
    static class SumOfDigitsComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int sum1 = getDigitSum(num1);
            int sum2 = getDigitSum(num2);
            
            if (sum1 != sum2) {
                return sum1 - sum2; // Compare by digit sum
            } else {
                return num1 - num2; // If digit sums are equal, compare naturally
            }
        }
        
        // Helper method to calculate the sum of digits
        private int getDigitSum(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        // Natural sorting (default)
        TreeSet<Integer> naturalSortSet = new TreeSet<>();
        naturalSortSet.add(10);
        naturalSortSet.add(5);
        naturalSortSet.add(20);
        naturalSortSet.add(15);
        System.out.println("Natural Sorting: " + naturalSortSet);

        // Custom sorting (descending order)
        TreeSet<Integer> customSortSet = new TreeSet<>(Comparator.reverseOrder());
        customSortSet.add(10);
        customSortSet.add(5);
        customSortSet.add(20);
        customSortSet.add(15);
        System.out.println("Custom Sorting (Descending): " + customSortSet);

        //Define Custom Sorting method using Comparator
        /**
         * sort integers based on the sum of their digits. 
         * If two integers have the same digit sum, they are ordered in natural order.
         */
        // TreeSet with custom sorting logic (based on sum of digits)
        TreeSet<Integer> customSortedSet = new TreeSet<>(new SumOfDigitsComparator());
        customSortedSet.add(45);
        customSortedSet.add(12);
        customSortedSet.add(102);
        customSortedSet.add(56);
        customSortedSet.add(93);

        // Display the TreeSet with custom sorting logic
        System.out.println("TreeSet with Custom Sorting (Sum of Digits): " + customSortedSet);
        
        // Using TreeSet Methods:
        System.out.println("First Element: " + customSortedSet.first()); // First element in set
        System.out.println("Last Element: " + customSortedSet.last());   // Last element in set
        
        // Using NavigableSet Methods
        System.out.println("Lower than 56: " + customSortedSet.lower(56));   // Element just below 56
        System.out.println("Floor of 57: " + customSortedSet.floor(57));     // Element less than or equal to 57
        System.out.println("Ceiling of 12: " + customSortedSet.ceiling(12)); // Element greater than or equal to 12
        System.out.println("Higher than 56: " + customSortedSet.higher(56)); // Element just above 56

        // Polling Methods (removes first and last elements)
        System.out.println("Poll First Element: " + customSortedSet.pollFirst()); // Removes first element
        System.out.println("Poll Last Element: " + customSortedSet.pollLast());   // Removes last element
        
        // Remaining elements after polling
        System.out.println("TreeSet After Polling: " + customSortedSet);
    }
}
