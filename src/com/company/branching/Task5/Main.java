package com.company.branching.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x = ");
        double x = in.nextDouble();
        double f;
        if(x<=3){
            f = Math.pow(x,2) - 3*x + 9;
        }
        else{
            f = 1/(Math.pow(x,3)+6);
        }
        System.out.println("Result f(x) = "+f);
    }
}
