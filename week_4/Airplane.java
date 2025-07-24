package week_4;

public abstract class Airplane implements VehicleInterface{

    // instance variables
    int speed;

    @Override
    public void accelerate(int rate) {
        // push throttle with right hand
    }

    @Override
    public void decelerate(int rate) {
        // pull back throttle with right hand
    }

    @Override
    public void stop() {
        // stop airplane
    }

    public void changeFlaps(){
        // local variable
        int flapAngle;
    }
}
