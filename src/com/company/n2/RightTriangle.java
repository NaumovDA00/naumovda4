package com.company.n2;

public class RightTriangle {
    public int cathet1;
    public int cathet2;
    public double hypotenuse;
    public RightTriangle(int cathet1, int cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }
    public double hypo(int x, int y) {
        double z = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
        return z;
    }
}
