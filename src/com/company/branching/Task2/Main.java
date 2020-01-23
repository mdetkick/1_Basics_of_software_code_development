package com.company.branching.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a = ");
        double a = in.nextDouble();
        System.out.println("Input b = ");
        double b = in.nextDouble();
        System.out.println("Input c = ");
        double c = in.nextDouble();
        System.out.println("Input d = ");
        double d = in.nextDouble();
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }

    /*private static double min(double a,double b) {
        if (a < b) return a;
        else return b;
    }*/

    /*private static double max(double a,double b){
        if(a>b) return a;
        else return b;
    }*/
}
