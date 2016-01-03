package com.pras.conditionaloperators;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class ConditionalOperators {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.setRaceID(1234);
        runner.setName("Mark");

        Swimmer swimmer = new Swimmer(12344, "John");

        Swimmer swimmer1 = new Swimmer();

        System.out.println(runner.getName() + " equals " + swimmer.getName() + "? " + Utilities.nullSafeEquals(runner
                .getName(), swimmer.getName()));

        System.out.println(swimmer1.getName() + " equals " + swimmer.getName() + "? " + Utilities.nullSafeEquals
                (swimmer1.getName(), swimmer.getName()));
    }
}
