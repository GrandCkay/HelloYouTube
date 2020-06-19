package ua.gfg.helloyoutube;

public class Sum {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = (float) sum / count;
        System.out.println(result);
    }
}
