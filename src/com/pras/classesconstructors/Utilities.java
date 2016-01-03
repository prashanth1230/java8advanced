package com.pras.classesconstructors;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class Utilities {

    /**
     * This utility compares two objects in a null safe way
     *
     * @param one
     * @param two
     * @return
     */
    public static boolean nullSafeEquals(Object one, Object two) {
        return one.equals(two);
    }
}
