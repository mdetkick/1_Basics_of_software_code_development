package com.company.branching.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A = ");
        int A = in.nextInt();
        System.out.println("Input B = ");
        int B = in.nextInt();
        System.out.println("Input x = ");
        int x = in.nextInt();
        System.out.println("Input y = ");
        int y = in.nextInt();
        System.out.println("Input z = ");
        int z = in.nextInt();
        boolean isProxodit = ((A < x) && (B < y)) || ((A < x) && (B < z)) || ((A < z) && (B < y));
        System.out.println("Is proxodit " + isProxodit);
    }
}
