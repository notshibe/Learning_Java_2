package com.example.learn_java;

public class Arrays {
    public static void main(String[] args) {

        //Tom (baseball batting average)
        //int game1 = 250;
        //int game2 = 400;
        //int game3 = 600;

        //step creates empty array of type given
        int[] tomsAverages = new int[3];
        double[] dblArray;
        String[] names;
        names = new String[5];

        names[0] = "John";
        names[1] = "Jacob";
        names[2] = "Jingle";
        names[3] = "Heimer";
        names[4] = "Kevin";

        tomsAverages[0] = 250;
        tomsAverages[1] = 400;
        tomsAverages[2] = 600;

        System.out.println("Val 1: " + tomsAverages[0]);
        System.out.println("Val 2: " + tomsAverages[1]);
        System.out.println("Val 3: " + tomsAverages[2]);

        tomsAverages[0] = 100;
        System.out.println(tomsAverages[0]);

        String[] top6Cars = {
         "GTR","Aston","Lambo","GTI","Chevy","Tesla"
        };


        //brackets supported for maths
        System.out.println(top6Cars[3]);
        int lastno = top6Cars.length;

        String lastcar = top6Cars[lastno-1];
        System.out.println(lastcar);
    }
}