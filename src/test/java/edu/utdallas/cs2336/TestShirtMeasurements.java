package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShirtMeasurements {

    @Test
    public void testSetup() {
        ShirtMeasurements shirtMeasurements = new ShirtMeasurements(Units.INCHES, 16, 35, 40);
        assertEquals(Units.INCHES, shirtMeasurements.getUnits());
        assertEquals(16, shirtMeasurements.getNeck());
        assertEquals(35, shirtMeasurements.getArms());
        assertEquals(40, shirtMeasurements.getChest());

        shirtMeasurements = new ShirtMeasurements(Units.CENTIMETERS, 40, 85, 100);
        assertEquals(Units.CENTIMETERS, shirtMeasurements.getUnits());
        assertEquals(40, shirtMeasurements.getNeck());
        assertEquals(85, shirtMeasurements.getArms());
        assertEquals(100, shirtMeasurements.getChest());
    }

    @Test
    public void testMutation() {
        ShirtMeasurements growingPerson = new ShirtMeasurements(Units.INCHES, 16, 33, 35);
        growingPerson.setNeck(17);
        assertEquals(17, growingPerson.getNeck());
        growingPerson.setArms(37);
        assertEquals(37, growingPerson.getArms());
        growingPerson.setChest(42);
        assertEquals(42, growingPerson.getChest());
    }

    @Test
    public void testCombined() {
        ShirtMeasurements shirtMeasurements = new ShirtMeasurements(Units.CENTIMETERS, 41, 84, 99);
        assertEquals(224, shirtMeasurements.combined());
        shirtMeasurements.setNeck(40);
        assertEquals(223, shirtMeasurements.combined());
        shirtMeasurements.setArms(86);
        assertEquals(225, shirtMeasurements.combined());
        shirtMeasurements.setChest(95);
        assertEquals(221, shirtMeasurements.combined());
    }

    @Test
    public void testConversion() {
        ShirtMeasurements shirtMeasurements = new ShirtMeasurements(Units.CENTIMETERS, 39, 83, 101);
        assertEquals(39.0, shirtMeasurements.getNeck(Units.CENTIMETERS));
        assertTrue(0.001 > Math.abs(shirtMeasurements.getNeck(Units.INCHES) - (39 / 2.54)));
        assertEquals(83.0, shirtMeasurements.getArms(Units.CENTIMETERS));
        assertTrue(0.001 > Math.abs(shirtMeasurements.getArms(Units.INCHES) - (83 / 2.54)));
        assertEquals(101.0, shirtMeasurements.getChest(Units.CENTIMETERS));
        assertTrue(0.001 > Math.abs(shirtMeasurements.getChest(Units.INCHES) - (101 / 2.54)));

        shirtMeasurements = new ShirtMeasurements(Units.INCHES, 15, 33, 32);
        assertEquals(15.0, shirtMeasurements.getNeck(Units.INCHES));
        assertTrue(0.001 > Math.abs(shirtMeasurements.getNeck(Units.CENTIMETERS) - (15 * 2.54)));
        assertEquals(33.0, shirtMeasurements.getArms(Units.INCHES));
        assertTrue(0.001 > Math.abs(shirtMeasurements.getArms(Units.CENTIMETERS) - (33 * 2.54)));
        assertEquals(32.0, shirtMeasurements.getChest(Units.INCHES));
        assertTrue(0.001 > Math.abs(shirtMeasurements.getChest(Units.CENTIMETERS) - (32 * 2.54)));
    }
}
