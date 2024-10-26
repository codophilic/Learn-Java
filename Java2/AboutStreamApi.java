import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

// Task class that sums a part of the list
class SumTask implements Runnable {
    private List<Integer> numbers;
    private int sum;

    public SumTask(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            sum += number;
        }
    }
}


public class AboutStreamApi{
    public static void main(String[] args) throws InterruptedException {

        List<String> names = Arrays.asList("John", "Jane", "Mike", "Emily", "Chris");

        // Parallel stream
        names.parallelStream().forEach(name -> {
            System.out.println(name + " - processed by " + Thread.currentThread().getName());
        });
    }
}