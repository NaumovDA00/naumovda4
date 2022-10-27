package com.company.n3;

public class PotentialEnergy {
    public static final double g = 9.8;
    private double h;
    private double m;
    public PotentialEnergy(double h, double m) {
        this.h = h;
        this.m = m;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }
    public double getG() {
        return g;
    }

    public double energy(double x, double y, double z){
        double e = x * y * z;
        return e;
    }
}
