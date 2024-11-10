import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;

@FunctionalInterface
interface MethodReferenceDemo{

    void display();
}

class DisplayMethodImpl{
    public static void implDisplay(){
        System.out.println("Display");
    }
}


public class AboutMethodReference{
    public static void main(String[] args) {
     
        List<String> ArrayOfNumbers=Arrays.asList("Hi","Hello","World");

        //Using Anonymous class
        ArrayOfNumbers.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        //Lambda Expression
        ArrayOfNumbers.forEach(i->System.out.println(i));

        //Method Reference
        ArrayOfNumbers.forEach(System.out::println);

        // Lambda expression to find the maximum of two numbers using Math.max()
        BiFunction<Integer, Integer, Integer> maxFunction = (a, b) -> Math.max(a, b);
        int result = maxFunction.apply(10, 20);
        System.out.println(result);  // Output: 20

        // Method reference to Math.max() static method
        BiFunction<Integer, Integer, Integer> maxFunction1 = Math::max;
        int result1 = maxFunction1.apply(10, 20);
        System.out.println(result1);  // Output: 20

        Function<String, Integer> lengthFunction = String::length;
        System.out.println(lengthFunction.apply("hello"));  // Output: 5
        System.out.println(lengthFunction.apply("world"));  // Output: 5

        MethodReferenceDemo mrd = DisplayMethodImpl::implDisplay;
        mrd.display();

    }
}