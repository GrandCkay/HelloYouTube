package JavaRush;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName, fileNameOut = null;
            Set<String> set = new TreeSet<>();

            while (!(fileName = reader.readLine()).equals("end")) {
                set.add(fileName);

                if (fileNameOut == null) {
                    fileNameOut = fileName.substring(0, fileName.lastIndexOf("."));
                }
            }

            BufferedWriter out = new BufferedWriter(new FileWriter(fileNameOut, true));
            BufferedReader in;

            for (String s : set) {
                in = new BufferedReader(new FileReader(s));
                while (in.ready()) {
                    out.write(in.read());
                }
                in.close();
            }
            out.close();
        }
    }
}






















