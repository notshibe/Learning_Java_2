package com.example.learn_java;

public class Numbers {
    public static void main(String[] args) {

        int age = 25; //int doesn't support decimals, integers only
        int myFavoriteSports = -50;

        int sum = 5 + 5;

        int num1 = 10;
        int num2 = 5000;



        System.out.println(sum);
        System.out.println(num1 + num2);

        int difference = 100 - 20;
        int product = 22 * 5;
        int divide = 15 / 5;

        System.out.println(difference);
        System.out.println(product);
        System.out.println(divide);

        int modulo = 20 % 3;
        System.out.println(modulo);

        //float bankBalance = 432.23; //float allows fewer dp than a double, 32 bits of storage
        double thisIsADouble = 5678.52345276; //64 bits of storage, more dp
    }
}
