package com.pras.classesconstructors;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class Swimmer {
    private int raceID;

    /**
     * Default constructor
     */
    public Swimmer() {

    }

    /**
     * Explicit constructor that acceps raceID
     *
     * @param argRaceID
     */
    public Swimmer(int argRaceID) {
        this.raceID = argRaceID;
    }

    /**
     * Make the runner perform sport
     *
     * @return
     */
    public String performSport() {
        return "Swimming...";
    }

    /**
     * This outputs the function performed by the swimmer
     *
     * @return
     */
    public String toString() {
        return raceID + " is " + performSport();
    }
}
