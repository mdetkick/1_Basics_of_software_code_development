package com.company.linearProgramming.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds = ");
        long seconds = in.nextLong();
        TimeFormat timeFormat = new TimeFormat(seconds);
        System.out.println(timeFormat);
    }
}
class TimeFormat{
    private long time;
    private short hours;
    private short minutes;
    private short seconds;

    public TimeFormat(long time) {
        this.time = time;
        formatTime();
    }

    private void formatTime(){
        if(time/3600!=0){
        hours = (short) (time / 3600);
        time = time - 3600*hours;
        }
        else{
            hours=0;
        }
        if(time/60!=0) {
            minutes = (short) (time/60);
            time = time - 60*minutes;
        }
        else{
            minutes=0;
        }
        seconds = (short) time;
    }

    @Override
    public String toString() {
        return "TimeFormat{" + hours + "ч"+
                ", " + minutes + "мин" +
                "," + seconds + "сек" +
                '}';
    }
}
