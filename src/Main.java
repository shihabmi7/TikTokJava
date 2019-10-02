public class Main {


    static int a[] = {1, 2, 3, 4};
    static int b[] = {5, 6, 7, 8};

    public static void main(String[] args) {

        System.out.println("Hello World!");
        /*int totalLengh = a.length + b.length;

        int c[] = new int[totalLengh];

        int j = 0;
        for (int i = 0; i < totalLengh; i++) {

            if (i < a.length) {

                c[i] = a[i];

            } else {
                c[i] = b[j];
                j++;
            }

            System.out.println("" + c[i]);
        }*/

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
}
