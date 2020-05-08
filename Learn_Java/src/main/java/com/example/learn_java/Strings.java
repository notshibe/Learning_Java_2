package com.example.learn_java;

public class Scratch_pad_3 {
    public static void main(String[] args) { //main is entry point
        String vehicle = "Truck"; //string: text, not for things to do maths with
        //int myBankAccount = 500; //numbers for maths
        String make = "Chevy";
        String model = "Tahoe";

        String fullVehicleDetails = vehicle + " - " + make + " : " + model;

        System.out.println(fullVehicleDetails); //prints this to the console

        String upper = "CRAZY MAXIMUS!";
        String lower = upper.toLowerCase();

        System.out.println(upper + " " + lower);

        int accountBalance = 500;

        String printBalance = String.format("Your account balance is %d",accountBalance); //%d is replaced with integer after comma, %s would be replaced with string after comma

        System.out.println(printBalance);



    }
}

