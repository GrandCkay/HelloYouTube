package OOPYouTube;

public class Dog {
    String name;
    int height;
    String color;
//
//    public Dog(String name) {
//        this.name = name;
//    }
//
//    public Dog(String name, int height) {
//        this.name = name;
//        this.height = height;
//    }
//
//    public Dog(String name, int height, String color) {
//        this.name = name;
//        this.height = height;
//        this.color = color;
//    }

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }


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
