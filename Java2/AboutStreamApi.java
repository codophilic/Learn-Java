import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
        
        //Without Stream API

        List<Integer> aListWSP = Arrays.asList(6,88,23,14,17,12,32,51,79,94);
        List<Integer> evenNumbersListWSP = new ArrayList<Integer>();
        for(int num:aListWSP){
            if(num %2 == 0)
            evenNumbersListWSP.add(num);
        }
        System.out.println(evenNumbersListWSP);

        //With Stream API
        List<Integer> aListSP = Arrays.asList(6,88,23,14,17,12,32,51,79,94);
        List<Integer> evenNumbersListSP = aListSP.stream().filter(num -> num %2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersListSP);

        // Without Stream API
        List<Integer> numbersWithoutSA = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create two threads to split the work
        SumTask task1 = new SumTask(numbersWithoutSA.subList(0, 5)); // First half
        SumTask task2 = new SumTask(numbersWithoutSA.subList(5, 10)); // Second half

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Sum the results of both threads
        int totalSum = task1.getSum() + task2.getSum();
        System.out.println("Total sum: " + totalSum);  // Output: 55

        List<Integer> numbersWithSA = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Parallel stream to sum the numbers
        int totalSumWithSA = numbersWithSA.parallelStream()
                              .mapToInt(Integer::intValue)
                              .sum();

        System.out.println("Total sum: " + totalSumWithSA);  // Output: 55
    }
}