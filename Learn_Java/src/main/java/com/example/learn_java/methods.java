package com.example.learn_java;

public class methods {

    public static void main(String[] args) {
        //calling a function
        printName();
        printName();

        int len = 10;
        int wid = 5;
        printArea51(len,wid);

        //stores result of running function as variable called area
        int area = getArea(5,6);
        System.out.println(area);
    }

    //void means return nothing
    //the below defines a method/function
    private static void printName() {
        System.out.println("Hi, my name is pedro but my friends call me Max");
    }

    //inside brackets are arguments/variables to feed function
    //maths operation needs to be contained in brackets, else will just append later no's
    //void means we can only use the output once, not generate variables for future use, and no return statement needed
    public static void printArea51(int length, int width){
        System.out.println("Area: " + (length * width + 1));
    }

    //int means the output is an integer that we can use as a variable for future calculations
    private static int getArea(int length, int width) {

        int area = length * width;
        //return is end of code in function
        return area;

        //return 0; statement unreachable because first return is end of code in function
        //deliberate redundant variable to show how code works
    }
}

//FUNCTION (java calls these methods) TYPES
//public means accessible by all classes and other packages
//protected means accessible only by classes in same package
//private means only operations inside this class can access this variable
