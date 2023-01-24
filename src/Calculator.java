public class Calculator {
    // addition
    public static int add(int a, int b) {
        return a + b;
    }

    // multiply
    public static int multiply(int a, int b) {
        return a * b;
    }


    // subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // division with int
    public static int divide(int a, int b) {
        return a / b;
    }

    // division with double
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(3, 2)); // 5
        System.out.println(multiply(3, 2));  // 6
        System.out.println(subtract(3, 2)); // 1
        System.out.println(divide(3, 2));  // 1
        System.out.println(divide(3.0, 2.0));  // 1.5
        System.out.println(divide((int) 3.0, (int) 2.0));  // 1
        System.out.println(divide((double) 3, (double) 2));  // 1.5
    }
}
