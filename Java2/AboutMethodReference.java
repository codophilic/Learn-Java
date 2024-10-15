import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class AboutMethodReference{
    public static void main(String[] args) {
     
        //Lambda Expression
        List<Integer> ArrayOfNumbers=Arrays.asList(1,2,3);
        ArrayOfNumbers.forEach(i->System.out.println(i));

        //Method Reference
        ArrayOfNumbers.forEach(System.out::println);
    }
}