package com.pras.classesconstructors;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class Runner {

    private int raceID;

    /**
     * Default constructor
     */
    public Runner() {

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
        return raceID + " is " + performSport();
    }
}
