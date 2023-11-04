package com.ademyildiz.javalearning;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(5*2);

        // Variables

        // Integer - Long
        int age = 20;

        System.out.println(10 * 20);
        System.out.println(10 * age);
        System.out.println(age / 5);

        int x = 5;
        int y = 10;
        System.out.println(y / x);

        long myLong = 10;
        System.out.println(myLong / 5);

        //Double - Float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a / z);

        float myFloat = 10.0f;
        System.out.println(myFloat / 5);

        double pi = 3.14;
        int r = 5;
        System.out.println(2*r*pi);

        //String
        String name = "Henry";
        String surName = "Jackson";

        // name = 40; Değişken türü aynı olmadığı durumda değişiklik yapılmaz.

        String fullName = name + " " + surName;

        System.out.println(name);
        System.out.println(surName);
        System.out.println(fullName);

        //Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final
        final int myInteger = 5;
        System.out.println("myInteger : " + myInteger);

        // myInteger = 4;
        System.out.println("myInteger : " + myInteger);

        // Final : Bir şeyin değeri sonradan değişmesin istiyorsam bunu kullanabilirim.
    }
}
