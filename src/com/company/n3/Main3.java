package com.company.n3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double m = sc.nextInt();
        PotentialEnergy energy1 = new PotentialEnergy(h,m);
        double e = energy1.energy(h,m,PotentialEnergy.g);
        System.out.println(e);
    }
}
