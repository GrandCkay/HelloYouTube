package OOPYouTube;

public class Human {
    String name;
    int age;
    double weight;

    static int humanCount = 0;

    public int getHumanCount() {
        humanCount++;
        return humanCount;
    }
}
