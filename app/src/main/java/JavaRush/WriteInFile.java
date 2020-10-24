package JavaRush;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WriteInFile {   //   C:\Users\Home\Desktop\1.txt
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        // 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        StringBuilder stringBuilder = new StringBuilder();
        String s = "";

        while (!s.equals("exit")) {
            s = reader.readLine();
            stringBuilder.append(s).append("\n");
        }

        writer.write(stringBuilder.toString());
        writer.close();

//        // 2
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))) {
//                while (true) {
//                    String s = reader.readLine();
//                    writer.write(s + System.lineSeparator());
//
//                    if (s.equalsIgnoreCase("exit")) {
//                        reader.close();
//                        writer.close();
//                        break;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        // 1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        boolean isRead = true;
//
//        while (isRead) {
//            String s = reader.readLine();
//            arrayList.add(s);
//
//            switch (s) {
//                case "exit":
//                    isRead = false;
//                    reader.close();
//                    break;
//            }
//        }
//
//        for (String s : arrayList) {
//            writer.write(s + "\n");
//        }
//        writer.close();
    }
}






















