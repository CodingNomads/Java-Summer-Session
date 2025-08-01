package week_7.functional;

@FunctionalInterface
// required to have one AND ONLY one abstract method
public interface SomeInterface<T> {

    public void doSomething(T s);

}
