package com.example.learn_java;

public class Boolean {
    public static void main(String[] args) {
        //euqality operators: > < == != >= <=
        if (1 == 1) {
            System.out.println("One equals one");
        }

        if (1 != 1) {
            System.out.println("One is not equal to one");
        }

        int accountBalance = 100;
        int itemPrice = 10;

        if (accountBalance >= itemPrice) {
            System.out.println("you can purchase the item!");
        } else {
            System.out.println("You don't have enough money, get job.");
        }
        int degrees = 61;

        if (degrees >= 70) {
            System.out.println("it hot yo..");
        } else if (degrees < 70 && degrees >= 59) {
            System.out.println("You might need a sweater");
        }
    }
}
