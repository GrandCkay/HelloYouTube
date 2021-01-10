package JavaRush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


// C:\Users\Home\Desktop\1.txt
public class FileSplitting {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileOutputStream out1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileOutputStream out2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {

            // 3
            byte[] bytesSecond = new byte[in.available() / 2];
            byte[] bytesFirst = new byte[in.available() - bytesSecond.length - 2];      // !!!

            System.out.println("Сколько храниться байт в \"блоке (в потоке)\" до записи в буффер (в byte[] bytesFirst) - "
                    + in.available());

            in.read(bytesFirst);

            System.out.println("Сколько осталось байт в \"блоке (в потоке)\" после записи в буффер (в byte[] bytesFirst) - "
                    + in.available());

            out1.write(bytesFirst);

            in.read(bytesSecond);

            System.out.println("Сколько осталось байт в \"блоке (в потоке)\" после записи в буффер (в byte[] bytesSecond) - "
                    + in.available());

            out2.write(bytesSecond);

            in.read(new byte[2]);      // !!!

            System.out.println("Сколько осталось байт в \"блоке (в потоке)\" после записи в буффер (в new byte[]) - "
                    + in.available());

//            // 2
//            int count = (in.available() + 1) / 2;
//            int num = 0;
//
//            while (in.available() > 0) {
//                if (num < count) {
//                    out1.write(in.read());
//                    num++;
//                } else {
//                    out2.write(in.read());
//                }
//            }


//            // 1
//            byte[] bytes = new byte[in.available()];
//            int count = in.read(bytes);
//            int i = (count % 2 == 0) ? (count / 2) : ((count / 2) + 1);
//
//            out1.write(bytes, 0, i);
//            out2.write(bytes, i, count - i);
        }
    }
}











