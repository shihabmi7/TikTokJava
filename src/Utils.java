public class Utils {


    static int a[] = {1, 2, 3, 4};
    static int b[] = {5, 6, 7, 8};

    public static void mergeArrays(int[] x, int[] y) {

        System.out.println("Hello World!");
        int totalLengh = x.length + y.length;

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
        }
    }
}
