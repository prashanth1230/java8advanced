package com.pras.switchandternaryoperators;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class SwitchAndTernary {
    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "1":
                    System.out.println("Creating a Runner...");
                    Runner runner = new Runner();
                    runner.setName("John");
                    runner.setRaceID(1234);
                    System.out.println(runner);
                    break;
                case "2":
                    System.out.println("Creating a Swimmer...");
                    Swimmer swimmer = new Swimmer(4567, "Ron");
                    System.out.println(swimmer);
                    break;
                default:
                    System.out.println("Did not receive any parameter exiting...");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Checking if the error is IndexOutOfBoundException? " + Utilities.nullSafeEquals(e
                    .toString(), "java.lang.ArrayIndexOutOfBoundsException: 0"));
        }
    }
}
