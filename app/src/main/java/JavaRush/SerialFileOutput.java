package JavaRush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;


// C:\Users\Home\Desktop\2.txt

public class SerialFileOutput {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fullName;
        String sFull = "";
//        List<String> strings = new ArrayList<>();

        @Override
        public void setFileName(String fullFileName) {
            this.fullName = fullFileName;
        }

        @Override
        public String getFileContent() {
//            // 1
//            for (String string : strings) {
//                sFull = sFull + string + " ";
//            }
            return sFull;
        }

        public void run() {
//            return;
            try {
                String s;
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fullName)));
                while ((s = reader.readLine()) != null) {

                    // 2
                    sFull = MessageFormat.format("{0}{1} ", sFull, s);
//                    sFull = new StringBuilder().append(sFull).append(s).append(" ").toString();
//                    sFull = sFull + s + " ";
//                    sFull = String.format("%s%s ", sFull, s);

//                    // 1
//                    strings.add(s);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
