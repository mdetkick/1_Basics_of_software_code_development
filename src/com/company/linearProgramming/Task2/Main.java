package com.company.linearProgramming.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a = ");
        double a = in.nextDouble();
        System.out.print("Input b = ");
        double b = in.nextDouble();
        System.out.print("Input c = ");
        double c = in.nextDouble();
        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a));
        System.out.printf("The result of z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a) = %f", z);
    }
}
