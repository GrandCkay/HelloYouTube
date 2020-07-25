package JavaRush;

public class NewCat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 12;
        this.weight = 6;
        this.color = "Red";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Blue";
    }

    public void initialize(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.age = 10;
        this.color = "Green";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 6;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }


}
