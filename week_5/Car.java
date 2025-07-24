package week_5;

public class Car {

    private String make;
    private String model;
    private String color;
    private static int numCarsCreated;

    public Car(){
        numCarsCreated++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getNumCarsCreated() {
        return numCarsCreated;
    }

    public static void crushCarsTogether(Car car1, Car car2){
        System.out.println("smashing " + car1.getModel() + " into " + car2.getModel());
        car1.setMake("Chevy");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
