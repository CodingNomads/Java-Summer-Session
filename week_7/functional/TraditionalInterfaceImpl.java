package week_7.functional;

public class TraditionalInterfaceImpl implements TraditionalInterface{

    @Override
    public void doAThing() {
        System.out.println("doing a thing");
    }

    @Override
    public void someThingElse() {
        System.out.println("doing something else");
    }
}
