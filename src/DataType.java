public class DataType {

    public static void main(String[] args) {
        int a = 100;
        Integer b = 100;
        Integer y = new Integer(100);

        if (a == b) {
            System.out.println("a & b values are equal");
        } else {
            System.out.println("a & b values are not equal");
        }


        if (b == y) {
            System.out.println("b & y values are equal");
        } else {
            System.out.println("b & y values are not equal");
        }


        if (b.equals(y)) {

            System.out.println("Equals method : b & y values are equal");

        } else {

            System.out.println("Equals method: b & y values are not equal");

        }
    }

    /*
    * Primitive Data Types :

    - Predefined by the language and named by a keyword
    - Total no = 8
    boolean
    char
    byte
    short
    integer
    long
    float
    double

    Reference/Object Data Types :

    -Created using defined constructors of the classes
    -Used to access objects
    -Default value of any reference variable is null
    -Reference variable can be used to refer to any object of the declared type or any compatible type.

*/
}
