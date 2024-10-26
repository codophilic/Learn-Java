import java.util.Optional;


public class AboutOptional {
    public static void main(String[] args) {
        String[] words = new String[10];
        
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
          String word = words[5].toLowerCase();
          System.out.print(word);
        }
        else
            System.out.println("word is null");

        Optional<String> nonEmptyOpt = Optional.of("Hello");          // Contains "Hello"
        Optional<String> nullableOpt = Optional.ofNullable(null);     // Contains no value
        Optional<String> emptyOpt = Optional.empty();                 // Contains no value
        
        if (nonEmptyOpt.isPresent()) {
            System.out.println("Value is present: " + nonEmptyOpt.get()); // Prints "Hello"
        }
        
        if (nullableOpt.isEmpty()) {
            System.out.println("No value present"); // Prints this because nullableOpt is empty
        }

        if(emptyOpt.isEmpty()){
            System.out.println("Value is Empty");
        }

        //Retrieve value
        System.out.println(nonEmptyOpt.get()); // Prints "Hello"

        //Providing Default Value

        /**
         * Returns the value if present, or the specified default value if empty.
         */
        String result = nullableOpt.orElse("Default Value"); // Returns "Default Value" because nullableOpt is empty
        System.out.println(result);

        //result = emptyOpt.orElseThrow(() -> new IllegalStateException("No value")); // Returns "Hello" or throws
        /**
         * Exception in thread "main" java.lang.IllegalStateException: No value
        at AboutOptional.lambda$1(AboutOptional.java:38)
        at java.base/java.util.Optional.orElseThrow(Optional.java:403)
        at AboutOptional.main(AboutOptional.java:38)
         */

        // Perform some actions based on the values
        /**
         * Executes the given action with the value if it’s present.
         */
        nonEmptyOpt.ifPresent(value -> System.out.println("Found: " + value)); // Prints "Found: Hello"

        /**
         * Executes the given action with the value if it’s present; otherwise, runs the empty action.
         */
        nullableOpt.ifPresentOrElse(
            value -> System.out.println("Found: " + value),
            () -> System.out.println("Value is absent") // Prints "Value is absent" because nullableOpt is empty
        );
        String result1 = Optional.ofNullable(null).orElse("Not found").toString(); // This should work without issue

    }
}
