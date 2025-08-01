package week_7.multithreading;

// retains the ability to extend another class
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // everything in here executed on it's own thread
        for (int i = 0; i < 5; i++) {
            System.out.println("In MyRunnable " + Thread.currentThread().getName() + ": i = " + i);

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
