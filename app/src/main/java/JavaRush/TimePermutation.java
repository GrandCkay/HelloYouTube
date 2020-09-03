package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TimePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int numberN = Integer.parseInt(reader.readLine());
        int numberM = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberN; i++) {
            list.add(reader.readLine());
        }

        Collections.rotate(list, -numberM);

//        for (int i = 0; i < numberM; i++) {
//            list.add(list.remove(0));
//        }

        for (String i : list) {
            System.out.println(i);
        }

    }

}
