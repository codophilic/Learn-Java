class Worker implements Runnable {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            // Simulate doing some work
            System.out.println("Working...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Worker stopped.");
    }

    public void stop() {
        running = false;
    }
}



public class AboutVolatile{
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Thread thread = new Thread(worker);
        thread.start();

        // Let the worker thread run for a while
        Thread.sleep(500);

        // Stop the worker thread
        worker.stop();
        System.out.println("Request sent to stop the worker.");

        thread.join();
        System.out.println("Main thread finished.");
    }
}