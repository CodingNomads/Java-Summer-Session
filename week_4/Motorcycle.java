package week_4;

public class Motorcycle implements VehicleInterface{


    @Override
    public void accelerate(int rate) {
        // turn throttle with right hand
    }

    public void accelerate(double rate) {
        // turn throttle with right hand
    }

    @Override
    public void decelerate(int rate) {
        // squeeze brake level with either hand
    }

    @Override
    public void start() {
        // kickstart after turning key
    }

    @Override
    public void stop() {
        // turn key left
    }
}
