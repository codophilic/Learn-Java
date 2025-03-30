public class ThreadLocal {
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            int value = threadLocalValue.get(); // Get the initial value (0)
            threadLocalValue.set(value + 1);    // Modify the thread-local value
            System.out.println(Thread.currentThread().getName() + ": " + threadLocalValue.get());
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
