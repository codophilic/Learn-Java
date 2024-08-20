public class Iteration {
    public static void main(String[] args) {
        /**
         * For Loops
         *  - Used when the number of iterations is known beforehand
         */
        for (int j = 0; j < 5; j++) {
            System.out.println(j); // Prints numbers 0 to 4
        }

        /**
         * While Loops
         *  - Used when the number of iterations is not known and depends on a condition
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i); // Prints numbers 0 to 4
            i++;
        }

        /**
         * Do-While Loops
         *  - Similar to the while loop, but guarantees that the code block will be executed at least once because the condition is checked after the loop's body.
         */
        int k = 0;
        do {
            System.out.println(k); // Prints numbers 0 to 4
            k++;
        } while (k < 5);

        
    }
}
