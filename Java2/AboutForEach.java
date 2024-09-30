
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; 

class MyConsumer implements Consumer<String>{

    @Override
    public void accept(String t) {
        System.out.println("City Name - "+t);
    }
    
}

public class AboutForEach {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(); 
        data.add("New Delhi"); 
        data.add("New York"); 
        data.add("Mumbai"); 
        data.add("London");


        MyConsumer con = new MyConsumer();
        data.forEach(con);

        /**
        * Anonymous class
        */
        data.forEach(new Consumer<String>() {
            @Override
            public void accept(String t)
            { 
  
                System.out.println("City Name - "+t);
            }
        } );


        /**
         * Lambda Expression
         */
        data.forEach(i -> System.out.println("City Name - "+i));

         // Using forEach() with a method reference
         System.out.println("\nUsing forEach with method reference:");
         data.forEach(System.out::println);
 
         // Using forEach() with a custom Consumer
         System.out.println("\nUsing forEach with custom Consumer:");
         Consumer<String> consumer = item -> System.out.println("City Name: " + item);
         data.forEach(consumer);

         // First Consumer: Prints the City name
        Consumer<String> printConsumer = (String item) -> System.out.println("City name: " + item);

        // Second Consumer: Prints the length of the City name name
        Consumer<String> lengthConsumer = (String item) -> System.out.println("Length: " + item.length());

        // Chain both Consumers using andThen
        Consumer<String> combinedConsumer = printConsumer.andThen(lengthConsumer);

        // Apply the combined Consumer on each element of the list
        data.forEach(combinedConsumer);
    }
}
