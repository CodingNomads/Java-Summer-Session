package week_6.generics;

public class GenericMethods {

    public static void main(String[] args) {
        double val1 = addNums(3, 3.14);
        long l = 76146751461l;
        float f = 7687565.45867f;

        double val2 = addNums(l, f);
        System.out.println(val2);

    }

    public static <N extends Number, M extends Number> double addNums (N num1, M num2){

        double val = num1.doubleValue() + num2.doubleValue();
        return val;

    }

    public static <N extends Number> N sumGen(N val1, N val2){
        return val1;
    }
}
