package com.company.branching.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x1 = ");
        double x1 = in.nextDouble();
        System.out.println("Input y1 = ");
        double y1 = in.nextDouble();
        System.out.println("Input x2 = ");
        double x2 = in.nextDouble();
        System.out.println("Input y2 = ");
        double y2 = in.nextDouble();
        System.out.println("Input x3 = ");
        double x3 = in.nextDouble();
        System.out.println("Input y3 = ");
        double y3 = in.nextDouble();
        boolean isOnLine = (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1); //Гуглил формулу
        System.out.println("Dat points is on line = " + isOnLine);
    }
}
