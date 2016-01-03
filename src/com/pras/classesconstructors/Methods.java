package com.pras.classesconstructors;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class Methods {

    public static void main(String[] args) {
        //Create Runner
        Runner runner = new Runner();
        runner.setRaceID(1234);

        //Create swimmer
        Swimmer swimmer = new Swimmer();
        swimmer.setRaceID(3456);

        //Create another swimmer
        Swimmer swimmer2 = new Swimmer(78910);

        System.out.println(runner);
        System.out.println(swimmer);
        System.out.println(swimmer2);

        System.out.println("Is X equal to Y? " + Utilities.nullSafeEquals("X", "Y"));
    }
}
