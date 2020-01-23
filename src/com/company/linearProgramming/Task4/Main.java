package com.company.linearProgramming.Task4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a = ");
        double a = in.nextDouble();
        int b = (int)Math.abs(a);
        double n = b;
        int i;
        for(i=1;i<Integer.MAX_VALUE;i++){
            b = b/10;
            if(b%10==0){
                break;
            }
        }
        double R = (a-n)*Math.pow(10,i)+(n/Math.pow(10,i));
        System.out.printf("Input number = %.3f and Reverse number = %.3f",a,R);
    }
}
