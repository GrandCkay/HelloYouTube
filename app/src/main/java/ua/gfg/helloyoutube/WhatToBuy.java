package ua.gfg.helloyoutube;

public class WhatToBuy {
    static int countOfMoney = 55;

    static int restOfMoney;
    static String restText = ", it's all!";

    static void text() {
        if (restOfMoney > 0 ) {
            restText = ". The rest of money " + restOfMoney + "$";
        }
    }

    public static void main(String[] args) {
        System.out.println("You have " + countOfMoney + "$ and you can buy:");

        if (countOfMoney >= 50) {
            restOfMoney = countOfMoney - 50;
            text();
            System.out.println("Pizza" + restText);
        } else if (countOfMoney >= 30) {
            restOfMoney = countOfMoney - 30;
            text();
            System.out.println("Burger" + restText);
        } else if (countOfMoney >= 10) {
            restOfMoney = countOfMoney - 10;
            text();
            System.out.println("Coca Cola" + restText);
        } else {
            System.out.println("Not enough money, need at least 10$");
        }
    }
}
