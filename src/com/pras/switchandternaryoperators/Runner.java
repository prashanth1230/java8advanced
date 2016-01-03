package com.pras.switchandternaryoperators;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class Runner {

    private int raceID;
    private String name;

    /**
     * Default constructor
     */
    public Runner() {

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
     * @return Sport Action
     */
    public String performSport() {
        return "Running...";
    }

    /**
     * This outputs the function performed by the runner
     *
     * @return
     */
    public String toString() {
        return name + ":" + raceID + " is " + performSport();
    }
}
