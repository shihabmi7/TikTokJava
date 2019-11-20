public class MyMathMatics {
    Calculator calculator;

    public MyMathMatics(Calculator calculator) {

        this.calculator = calculator;

    }

    void getCalculatorName() {

        String name = calculator.getName();
        System.out.println("" + name);

    }


    double addTwoNumber(double firstNumber, double secondNumber) {

        return calculator.add(firstNumber, secondNumber);
    }


    double multiplyTwoNumber(double firstNumber, double secondNumber) {

        return calculator.multiply(firstNumber, secondNumber);
    }
}
