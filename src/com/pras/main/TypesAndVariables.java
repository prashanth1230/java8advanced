package com.pras.main;

public class TypesAndVariables {

    public static void main(String[] args) {
        //Variables
        String fName = "James";
        char middleInit = 'T';
        char middleInitSymbol = '.';
        String lName = "Kirk";

        byte age = 32;
        short numberShipsEncountered = 358;
        int numberOfPlanetsDiscovered = 126893;
        long distanceTravelled = 1234455533221L;
        float numberOfHours = 43800.0f;
        double costOfMission = 233534534533.34;
        boolean missionSuccess = true;

        String output = String.format("Example text %s. Using characters also %c. Some numbers %d, %d. Some float " +
                        "numbers %.2f and %.1f. Finally boolean - %b",
                fName, middleInit, age, numberShipsEncountered, numberOfHours, costOfMission, missionSuccess);

        System.out.println(output);
    }
}
