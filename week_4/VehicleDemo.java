package week_4;

public class VehicleDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(10);

        Motorcycle moto = new Motorcycle();
        moto.accelerate(10);
        moto.accelerate(10.2);

        FighterJet jet = new FighterJet();
        jet.accelerate(10);
        jet.stop();
        jet.speed = 100;
        jet.changeFlaps();

        PropPlane propPlane = new PropPlane();
        propPlane.accelerate(10);

        System.out.println(10);
        System.out.println("ten");
        System.out.println(10.2);
    }

}
