package com.example.learn_java;

import java.util.ArrayList;

public class Array_lists {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();

        names.add("cat food");
        names.add("fookin prawns");
        names.add("matthew");

        System.out.println(names.get(1));



        names.remove("cat food");

        System.out.println(names.get(1));

        //this won't work because array lists different to array
        //System.out.println(names[1]);

        names.remove(0);

        System.out.println(names.get(0));

    }
}
