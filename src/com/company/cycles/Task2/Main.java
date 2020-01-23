package com.company.cycles.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a = ");
        int a = in.nextInt();
        System.out.println("Input b = ");
        int b = in.nextInt();
        System.out.println("Input h = ");
        int h = in.nextInt();
        int y = 0;
        for(int x = a;x<=b;x+=h){
            if(x<=2) y = x*(-1);
            else y = x;
            System.out.println("y = " + y);
        }
    }
}
