package com.pras.unittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Prashanth on 03-01-2016.
 */
public class SwimmerTest {
    Swimmer s;
    String name = "Jill";
    int racerID = 319515;

    @Before
    public void setUp() throws Exception {
        s = new Swimmer();
    }

    @After
    public void tearDown() throws Exception {
        s = null;
    }

    @Test
    public void testConstructors() {
        assertNotNull("Could not create basic swimmer", s);
        Swimmer s2 = new Swimmer(racerID, name);
        assertNotNull("Could not create basic swimmer", s2);
        assertEquals("Name not set as expected in complex constructor", name, s2.getName());
        assertEquals("ID not set as expected in complex constructor", racerID, s2.getRaceID());
    }

    @Test
    public void testGetSetName() {
        s.setName(name);
        assertEquals("Name not set as expected in the setter", name, s.getName());
    }

    @Test
    public void testGetSetRacedID() {
        s.setRaceID(racerID);
        assertEquals("ID not set as expected in setter", racerID, s.getRaceID());
    }

    @Test
    public void testToString() {
        s.setName(name);
        s.setRaceID(racerID);
        String outputString = s.toString();
        assertTrue("To String does not contain the name", outputString.contains(name));
        assertTrue("To String does not contain the racerID", outputString.contains("" + racerID));
    }
}
