public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Java 8 features ");

        UsePredicate usePredicate = new UsePredicate();
        usePredicate.findNameInList("S");


        MyMathMatics myMathMaticsObj = new MyMathMatics(() -> "China Calculator");
        myMathMaticsObj.getCalculatorName();


        System.out.println("" + myMathMaticsObj.addTwoNumber(20, 3));
        System.out.println("" + myMathMaticsObj.multiplyTwoNumber(100, 3.6));


    }
}
