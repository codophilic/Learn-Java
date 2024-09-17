class ThreadLifecycleDemo extends Thread {

    // Constructor - Thread is in the "New" state after creation
    public ThreadLifecycleDemo() {
        System.out.println("Thread created, but not started yet (NEW state).");
    }

    // The run() method defines the behavior of the thread when it's running
    @Override
    public void run() {
        try {
            // Thread is in "Runnable" state but not yet selected for running
            System.out.println("Thread is in Runnable state and may enter Running state soon.");

            // Simulate the thread entering "Running" state
            System.out.println("Thread is now Running.");

            // Simulate thread going to "Waiting/Sleeping/Blocking" state
            Thread.sleep(2000); // Thread will sleep for 2 seconds
            System.out.println("Thread is now in Sleeping/Waiting state for 2 seconds.");

        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }

        // Thread finishes execution and enters the "Terminated" state
        System.out.println("Thread has finished execution (TERMINATED state).");
    }
}


class Thread1 extends Thread{

    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Thread 1");
        }
    }
}


class Thread2 extends Thread{

    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Thread 2");
        }
    }
}


class A{
    public void displayA(){
        System.out.println("In A");
    }
}

class B extends A implements Runnable{

    @Override
    public void run(){
        System.out.println("Running B Thread");
    }
}

class Counter{
    public static int i;
    public synchronized void increment(){
        i++;
    }
}

class C1 extends Thread{

    Counter c= new Counter();

    @Override
    public void run(){
        for(int i=0;i<=10000;i++){
            c.increment();
        }
    }
}

class C2 extends Thread{

    Counter c= new Counter();

    @Override
    public void run(){
        for(int i=0;i<=10000;i++){
            c.increment();
        }
    }
}

public class AboutThreads{

    public static void main(String[] args) throws InterruptedException {
        // // Thread is in the "New" state when it's created
        // ThreadLifecycleDemo thread = new ThreadLifecycleDemo();

        // // Start the thread - It moves to "Runnable" state
        // thread.start(); // This puts the thread in the Runnable state

        // // After this point, the lifecycle is controlled by the JVM (from Runnable -> Running -> Waiting -> Terminated)

        // Thread1 t1 = new Thread1();
        // Thread2 t2 = new Thread2();
        // System.out.println("t1 - "+t1.getPriority()); // 5 - default priority assigned 
        // System.out.println("t2 - "+t2.getPriority());
        // t2.setPriority(8);
        // t2.setPriority(Thread.MAX_PRIORITY);
        // t1.start();
        // t2.start();

        // B b = new B();  // B Class Object
        // Thread tb = new Thread(b);  // Passing Runnable object to Thread since B class is implementation of Runnable
        // tb.start();  // This will call the run() method of class B
        // b.displayA();  // This will call the displayA() method inherited from class A

        C1 c1 = new C1();
        c1.start();
        C2 c2 = new C2();
        c2.start();

        c1.join();
        c2.join();

        Counter c = new Counter();
        System.out.println(Counter.i);
    }
}