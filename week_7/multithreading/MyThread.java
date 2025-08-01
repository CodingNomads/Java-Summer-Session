package week_7.multithreading;

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        // everything in here executed on it's own thread
        for (int i = 0; i < 5; i++) {
            System.out.println("In MyThread " + getName() + ": i = " + i);

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
