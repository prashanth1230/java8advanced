package com.pras.conditionaloperators;

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
        if (one == null) {
            return two == null;
        } else {
            return one.equals(two);
        }
    }
}
