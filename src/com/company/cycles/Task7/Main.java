package com.company.cycles.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a = ");
        int a = in.nextInt();
        System.out.println("Input b = ");
        int b = in.nextInt();
        for(int i = a;i<=b;i++){
            for(int j = 2;j <= i/2;j++){
                if(i%j==0) System.out.println(i+" divider "+j);
            }
        }
    }
}
