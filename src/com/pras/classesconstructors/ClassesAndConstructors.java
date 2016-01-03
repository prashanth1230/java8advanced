package com.pras.classesconstructors;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class ClassesAndConstructors {
    public static void main(String[] args) {
        //Create a runner
        Runner runner = new Runner();

        //Create Swimmer (default constructor)
        Swimmer swimmer = new Swimmer();

        //Create swimmer explicitly
        Swimmer swimmerExplicit = new Swimmer(12345);

        System.out.println(runner);
        System.out.println(swimmer);
        System.out.println(swimmerExplicit);
    }
}
