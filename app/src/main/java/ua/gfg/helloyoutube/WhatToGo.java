package ua.gfg.helloyoutube;

public class WhatToGo {
    public static void main(String[] args) {
        int time = 24;
        boolean isGoodWeather = false;

        boolean night = time >= 23 || time <= 5;
        String outDoors = "it's raining";

            if (isGoodWeather) {
                outDoors = "good weather";
            }

        System.out.println("Time: " + time + " hours. Outdoor " + outDoors);

        if (night) {
            System.out.println("Time to sleep");
        }
        if (!night && isGoodWeather) {
            System.out.println("Go to play");
        }
        if (!night && !isGoodWeather) {
            System.out.println("Turn on YouTube");
        }
    }
}
