public class AboutThreads2 {

    private static final Object lock = new Object();

    // Example of a thread using sleep (Taking a nap)
    static class SleepThread extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("SleepThread: I'm going to take a nap for 2 seconds.");
                Thread.sleep(2000);  // Sleep for 2 seconds
                System.out.println("SleepThread: I'm awake now after sleeping.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Example of a thread using wait (Waiting for a train announcement)
    static class WaitThread extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println("WaitThread: I'm waiting for a notification (train announcement).");
                    lock.wait();  // Release the lock and wait for notification
                    System.out.println("WaitThread: I got the notification, time to proceed!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Example of a thread getting blocked (Waiting for a busy platform)
    static class BlockThread extends Thread {
        @Override
        public void run() {
            System.out.println("BlockThread: I'm trying to get on the platform (acquire the lock).");
            synchronized (lock) {
                System.out.println("BlockThread: I got on the platform (acquired the lock) and now I'm working.");
                try {
                    Thread.sleep(3000);  // Simulate work on the platform
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("BlockThread: I'm done, releasing the platform.");
            }
        }
    }

    public static void main(String[] args) {
        // Start the SleepThread (takes a nap)
        SleepThread sleepThread = new SleepThread();
        sleepThread.start();

        // Start the BlockThread (tries to acquire the lock)
        BlockThread blockThread = new BlockThread();
        blockThread.start();

        // Wait a little to make sure BlockThread acquires the lock first
        try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }

        // Start the WaitThread (waits for notification)
        WaitThread waitThread = new WaitThread();
        waitThread.start();

        // Notify the waiting thread after BlockThread is done
        try {
            blockThread.join();  // Wait for BlockThread to finish
            synchronized (lock) {
                System.out.println("MainThread: Sending the notification (train announcement).");
                lock.notify();  // Notify the WaitThread
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
