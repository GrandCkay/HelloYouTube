package JavaRush;


// "Марш!" "Прервано!"

public class CountdownOnRaces {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут

            // 2
            try {
                while (!isInterrupted() && numSeconds >= 0) {
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                    } else {
                        System.out.print(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                if (numSeconds != -1) {
                    System.out.println("Прервано!");
                }
            }


//            // 1.1
//            while (!this.isInterrupted()) {
//                try {
//                    System.out.print((numSeconds--) + " ");
//                    Thread.sleep(1000);
//                    if (numSeconds == 0) {
//                        System.out.println("Марш!");
//                        this.interrupt();
//                    }
//                } catch (InterruptedException e) {
//                    System.out.println("Прервано!");
//                    return;
//                }
//            }


//            // 1
//            Thread thread = Thread.currentThread();
//            while (!thread.isInterrupted()) {
//                try {
//                    System.out.print((numSeconds--) + " ");
//                    Thread.sleep(1000);
//                    if (numSeconds == 0) {
//                        System.out.println("Марш!");
//                        thread.interrupt();
//                    }
//                } catch (InterruptedException e) {
//                    System.out.println("Прервано!");
//                    return;
//                }
//            }
        }
    }
}






