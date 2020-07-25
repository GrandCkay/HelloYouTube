package OOPYouTube;

import JavaRush.Cat;

public class MainDog {
    public static void main(String[] args) {
        Dog fly = new Dog();
        fly.name = "Fly";
        fly.breed = "Samoyed";
        fly.speed = 4;

        Dog cherry = new Dog();
        cherry.name = "Cherry";
        cherry.breed = "Husky";
        cherry.speed = 5;

        System.out.println(fly.info());
        fly.run();

        System.out.println("\n" + cherry.info());
        cherry.run();


    }
}