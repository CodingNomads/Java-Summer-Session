package week_5;

public class StaticDemo {

    // java StaticDemo;
    // behind the scenes it calls StaticDemo.main()

    public static void main(String[] args) {

        // can I call printMessage() here?
        StaticDemo obj = new StaticDemo();
        obj.printMessage("hello Java World!");

        double val = Math.floorDiv(21999, 75764);
        System.out.println(val);

        staticMethod();

        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Tacoma");
        car1.setColor("Silver");

        System.out.println("PI = " + Math.PI);

        System.out.println(Car.getNumCarsCreated());

        Car car2 = new Car();
        car2.setMake("Nissan");
        car2.setModel("XTerra");
        car2.setColor("Blue");

        System.out.println(Car.getNumCarsCreated());


        Car car3 = new Car();
        car3.setMake("Subaru");
        car3.setModel("Legacy");
        car3.setColor("White");

        System.out.println(Car.getNumCarsCreated());

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        Car.crushCarsTogether(car1, car2);
    }

    public void printMessage(String msg){
        System.out.println(msg);
    }

    public static void staticMethod(){
        System.out.println("static method");
    }

}
