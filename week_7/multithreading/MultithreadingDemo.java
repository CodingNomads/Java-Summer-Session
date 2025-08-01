package week_7.multithreading;

public class MultithreadingDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("starting main() method");

        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.setPriority(1);
        t1.start();

        MyThread myThread = new MyThread("t1");
        myThread.setPriority(5);
        myThread.start();

        t1.join();
        myThread.join();


        System.out.println("ending main() method");

    }

}
