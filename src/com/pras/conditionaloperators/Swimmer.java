package com.pras.conditionaloperators;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class Swimmer {
    private int raceID;
    private String name;

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
    public Swimmer(int argRaceID, String argName) {
        this.raceID = argRaceID;
        this.name = argName;
    }

    /**
     * @return raceID
     */
    public int getRaceID() {
        return raceID;
    }

    /**
     * Sets raceID
     *
     * @param raceID
     */
    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    /**
     * returns name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * sets name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
        return name + ":" + raceID + " is " + performSport();
    }
}
