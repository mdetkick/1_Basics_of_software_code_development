package com.company.linearProgramming.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x = ");
        int x = in.nextInt();
        System.out.println("Input y = ");
        int y = in.nextInt();
        boolean pechataet = ((x>=-2 && x<=2) && (y>=0 && y<=4) || (x>=-4 && x<=4) && (y<=0 && y>=-3));
        if(x==0 && y==-1) pechataet = false;
        System.out.println(pechataet);
    }
}