package ua.gfg.helloyoutube;

public class ArrayTest {
    public static void main(String[] args) {
        int[] first = new int[41];
        int[] second = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = i + 10;
        }

        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];
        }

        System.out.println("First array:");
        for (int k : first) {
            System.out.println(k);
        }
        System.out.println("The end. \n" + "Second array:");
        for (int t : second) {
            if (t % 5 == 0) {
                System.out.println("\t" + t);
            }
        }
        System.out.println("The end.");
    }
}
