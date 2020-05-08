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
        int degrees = 58;

        if (degrees >= 70) {
            System.out.println("it hot yo..");
            //&& and - both clauses have to be true
            // || is or
        } else if (degrees < 70 && degrees >= 59) {
            System.out.println("You might need a sweater");
            //else has to be the last one in an elseif chain
        } else {
            System.out.println("Put on a heavy coat");
        }

        boolean firstTimeCustomer = false;
        boolean isExecutiveMember = true;

        if(firstTimeCustomer == true || isExecutiveMember == true) {
            System.out.println("You got a 10% discount");
        }

        //shortcuts to true
        if(firstTimeCustomer || isExecutiveMember) {
            System.out.println("You got a 10% discount");
        }

        //if (true == true || false == true && false == true) will not be called because works left to right


    }
}
