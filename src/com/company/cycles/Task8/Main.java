package com.company.cycles.Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a = ");
        int a = in.nextInt();
        System.out.println("Input b = ");
        int b = in.nextInt();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>();
        while (a>0){
            if(!a1.contains(a%10)) {
                a1.add(a % 10);
            }
            a/=10;
        }
        while (b>0){
            if(!b1.contains(b%10)) {
                b1.add(b % 10);
            }
            b/=10;
        }
        for(int i = 0;i < a1.size();i++){
            for(int j = 0;j<b1.size();j++){
                if(a1.get(i).equals(b1.get(j))) System.out.println(a1.get(i));
            }
        }
    }
}
