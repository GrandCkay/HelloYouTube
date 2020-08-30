package ua.gfg.helloyoutube;

public class ForTest {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
