package JavaRush;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddException {
    private static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            System.out.println(exceptions.get(1));
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new ClassCastException();
        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new NoSuchFieldException());
            exceptions.add(new NoSuchMethodException());
            exceptions.add(new IOException());
            exceptions.add(new NullPointerException());
            exceptions.add(new IllegalStateException());
            exceptions.add(new RuntimeException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
        }
    }
}








