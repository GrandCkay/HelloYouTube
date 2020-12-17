package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

interface Message {
    void showWarning();
}

public class Clew {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
//        threads.get(0).start();

//        threads.get(1).start();
//        threads.get(1).interrupt();

//        threads.get(2).start();

//        threads.get(3).start();
//        Thread.sleep(1);
//        Thread4 thread4 = (Thread4) threads.get(3);
//        thread4.showWarning();

//        threads.get(4).start();
    }

    public static class Thread1 extends Thread {

        // 2
        public void run() {
            while (true) {
            }
        }

        // 1
//        public void run() {
//            while (!isInterrupted()) {
//                try {
////                    System.out.println("! ");
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    public static class Thread2 extends Thread {
        // 2
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }


        // 1
//        public void run() {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("InterruptedException");
//            }
//        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public void run() {
            while (!isInterrupted()) {
//                System.out.println("? ");
            }
        }

        @Override
        public void showWarning() {
            if (isAlive()) {
                interrupt();
//                System.out.println("!!!");
            }
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i;

        public void run() {
            try {
                while (true) {
                    if ((s = reader.readLine()).equals(String.valueOf('N'))) {
                        break;
                    }
                    i += Integer.parseInt(s);
                }
                System.out.println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
