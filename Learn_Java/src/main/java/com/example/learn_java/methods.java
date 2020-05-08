package com.example.learn_java;

public class methods {

    public static void main(String[] args) {
        //calling a function
        printName();
        printName();
        int len = 10;
        int wid = 5;
        printArea51(len,wid);
    }

    //void means return nothing
    //the below defines a method/function
    private static void printName() {
        System.out.println("Hi, my name is pedro but my friends call me Max");
    }

    //inside brackets are arguments/variables to feed function
    //public means globally accessible
    //maths operation needs to be contained in brackets, else will just append later no's
    private static void printArea51(int length, int width){
        System.out.println("Area: " + (length * width + 1));
    }
}
