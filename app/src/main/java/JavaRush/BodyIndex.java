package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BodyIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double indexBody = weight / (height * height);

            if (indexBody < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (indexBody >= 18.5 && indexBody < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            } else if (indexBody >= 25 && indexBody < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            } else {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
