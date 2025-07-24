package week_4;

public interface VehicleInterface {

    public void accelerate(int rate);
    public void decelerate(int rate);
    public void start();
    public void stop();

//    public default void charge(){
//        System.out.println("charging");
//    }
}
