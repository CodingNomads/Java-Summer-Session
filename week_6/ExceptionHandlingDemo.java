package week_6;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        System.out.println("hello");
//        try {
//            double val = divide(10, 2);
//            System.out.println(val);
//        } catch(ArithmeticException e){
//            System.out.println("exception caught: e = " + e.getMessage());
//        } finally {
//            System.out.println("this will always execute");
//        }

        int[] nums = null;

        try {
            double val = divideArrayValues(nums);
            System.out.println(val);
        } catch(ArrayIndexOutOfBoundsException arrayException){
            System.out.println("array exception caught");
        } catch (ArithmeticException arithmeticException){
            System.out.println("division by zero error");
        } catch(Exception e){
            System.out.println("exception caught: e = " + e.getMessage());
        }

        try {
            stampPassport(2024);
        } catch (CustomExceptionDemo e) {
            System.out.println("error caught: e = " + e.getMessage());
        }

        System.out.println("world");
    }

    public static double divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    // this method can generate two exceptions
    // division by zero and arrayindexoutofbounds
    public static int divideArrayValues(int[] nums) throws Exception {

        int val = nums[0] / nums[1];
        return val;
        ///throw new Exception("demo exception");
    }

    public static void stampPassport(int date) throws CustomExceptionDemo {
        if (date < 2025){
            throw new CustomExceptionDemo("passport is expired");
        }
        System.out.println("passport stamped");
    }
}
