package edu.utdallas.cs2336;

public class ShirtMeasurements {

    private final Units units; 
    private int neck;
    private int arms;  
    private int chest;


    public ShirtMeasurements(Units units, int neck, int arms, int chest) {
        this.units = units;
        this.neck = neck;
        this.arms = arms;
        this.chest = chest;
    }


    public Units getUnits() {
        return units;
    }


    public int getNeck() {
        return neck;
    }

    public void setNeck(int neck) {
        this.neck = neck;
    }


    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }


    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }


    public double getNeck(Units desiredUnits) {
        return convert(neck, units, desiredUnits);
    }


    public double getArms(Units desiredUnits) {
        return convert(arms, units, desiredUnits);
    }


    public double getChest(Units desiredUnits) {
        return convert(chest, units, desiredUnits);
    }


    public int combined() {
        return neck + arms + chest;
    }


    private double convert(int value, Units currentUnits, Units desiredUnits) {
        if (currentUnits == desiredUnits) {
            return value;  
        } else if (currentUnits == Units.INCHES && desiredUnits == Units.CENTIMETERS) {
            return value * Units.CM_PER_INCH;
        } else if (currentUnits == Units.CENTIMETERS && desiredUnits == Units.INCHES) {
            return value * Units.INCH_PER_CM; 
        } else {
            throw new IllegalArgumentException("Unsupported unit conversion.");
        }
    }
}
