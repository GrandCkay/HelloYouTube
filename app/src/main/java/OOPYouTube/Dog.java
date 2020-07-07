package OOPYouTube;

public class Dog {
    String name;
    String breed;
    int speed;

    String info() {
        return "Name: " + name + "\nBreed: " + breed + "\nSpeed: " + speed;
    }

    void run() {
        String run = "Go";
        String result = "";
        String move = "Move!";

        for (int i = 0; i < speed; i++) {
            result += run;
            if (speed >= 4 && i == speed - 1) {
                result += ", " + move;
            } else if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
