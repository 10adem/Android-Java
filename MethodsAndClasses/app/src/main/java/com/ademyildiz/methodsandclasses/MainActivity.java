package com.ademyildiz.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod();

        System.out.println(math(5, 7));

        System.out.println(newMethod("This"));

        username = "Milena";

        makeMusicians();

        makeSimpsons();
    }

    public void makeSimpsons() {
        Simpsons mySimpsons = new Simpsons("Homer", 50, "Nuclear");
        // mySimpsons.age = 51;
        // System.out.println(mySimpsons.age);
        System.out.println(mySimpsons.getName());
        mySimpsons.setName("Homer Simpson");
        System.out.println(mySimpsons.getName());
    }

    public void makeMusicians() {

        // instance
        Musicians myMusicians = new Musicians("Adele", "Guitar", 40);
        System.out.println(myMusicians.instrument);

        // myMusicians.name = "Adele";
        // myMusicians.age = 40;
        // myMusicians.instrument = "Guitar";
    }

    public void testMethod() {
        username = "Saibot";
        int x = 4 + 4;
        x = 9;
        System.out.println("Value of the x : " + x);
    }

    public int math(int a, int b) {
        username = "Scorpion";
        int x = 11;
        System.out.println("Value of x in math : " + x);
        return a + b;
    }

    public String newMethod(String string) {
        username = "Kitana";
        return string + " new method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}