import java.util.concurrent.CompletableFuture;

public class AboutCompletableFuture {

    public static void main(String[] args) {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Asynchronous task running...");
            // Perform a time-consuming task
            try {
                Thread.sleep(5000);
                System.out.println("Asynchronous task Completed, returning result");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result from asynchronous task";
        });

        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        System.out.println("Main thread continuing...");
    }
}