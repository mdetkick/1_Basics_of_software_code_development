package com.company.branching.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first corner = ");
        double first = in.nextDouble();
        System.out.println("Input second corner = ");
        double second = in.nextDouble();
        if(first+second<180){
            System.out.println("Triangle is exist");
            if(first==90 || second==90 || first+second==90){
                System.out.println("Right triangle");
            }
        }
        else{
            System.out.println("Triangle isn't exist");
        }
    }
}
