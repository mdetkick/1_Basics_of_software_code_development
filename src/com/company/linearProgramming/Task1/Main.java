package com.company.linearProgramming.Task1;

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
        double z = ((a-3)/b*2)+c;
        System.out.printf("The result of z = ((a-3)/b*2)+c = %f",z);
    }
}
