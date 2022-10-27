package com.company.n2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cathet1 = sc.nextInt();
        int cathet2 = sc.nextInt();
        RightTriangle hypotenuse1 = new RightTriangle(cathet1,cathet2);
        double hypotenuse = hypotenuse1.hypo(cathet1,cathet2);
        System.out.print(hypotenuse);
    }
}
