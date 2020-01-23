package com.company.cycles.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number = ");
        int number = in.nextInt();
        int sum = 1;
        for(int i = 2;i<=number;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
