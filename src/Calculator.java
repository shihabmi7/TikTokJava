@FunctionalInterface
public interface Calculator {


    String getName();

    default void display(String printMessage) {
        System.out.println(printMessage);
    }

    default double add(double a, double b) {
        double result = a + b;
        return result;
    }

    default double multiply(double a, double b) {
        return a * b;
    }

}