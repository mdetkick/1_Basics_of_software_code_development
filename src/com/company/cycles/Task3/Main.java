package com.company.cycles.Task3;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum += Math.pow(i,2);
        }
        System.out.println("Summary of first 100 digits is " + sum);
    }
}
