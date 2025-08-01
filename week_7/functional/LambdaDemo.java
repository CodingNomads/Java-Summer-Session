package week_7.functional;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main(String[] args) {

        // traditional interface
        TraditionalInterfaceImpl obj = new TraditionalInterfaceImpl();
        obj.doAThing();

        // abstract inner class
        TraditionalInterface obj2 = new TraditionalInterface() {
            @Override
            public void doAThing() {
                System.out.println("abstract inner class doing a thing");

            }

            @Override
            public void someThingElse() {
                System.out.println("abstract inner class doing something else");

            }
        };
        obj2.doAThing();

        // lambda expression equivolent
        SomeInterface<String> lamba1 = (String thing)
                -> System.out.println("lambda doing a thing -> " + thing);

        lamba1.doSomething("lambda things");

        SomeInterface<Integer> lamba2 = (Integer num) -> {
            System.out.println(num + num);
            System.out.println(num * num);
            System.out.println((num * 2) / num);
            System.out.println("dancing all night long");
        };

        Predicate<String> predicate = (String s) -> args.length > 10 ;
        System.out.println(predicate.test("hello")); // false
        System.out.println(predicate.test("iuoaogouyafgutsdfiuga")); // true

        lamba2.doSomething(78);

        BiFunction<Integer, Double, String> biFun = (Integer i, Double d) -> {
            Double x = i.doubleValue() + d.doubleValue();
            return x.toString();
        };

        String result = biFun.apply(34, 98.76);
        System.out.println("result = " + result);
    }

}
