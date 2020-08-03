package itvdnJavaStarter;

public class Test {
    public static void main(String[] args) {

        /*
        int a = 0;
        int b = 0;

        if (a > 0) {
            if (a < 100) {
                b = 1;
            } else {
                b = 0;
            }
        } else {
            b = - 1;
        }
        */

        int a = 0;
        int b = (a > 0) ? ((a < 100) ? 1 : 0) : - 1;

        System.out.println(b);

    }
}
