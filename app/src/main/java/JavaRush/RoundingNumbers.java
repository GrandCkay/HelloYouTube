package JavaRush;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


// C:\Users\Home\Desktop\1.txt

public class RoundingNumbers {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {

            String[] strings = reader.readLine().split(" ");

            for (String s : strings) {
                writer.write(Math.round(Double.parseDouble(s)) + " ");
            }
        }
    }
}
