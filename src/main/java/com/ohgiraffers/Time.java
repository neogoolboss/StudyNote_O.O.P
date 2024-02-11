package com.ohgiraffers;

public class Time {

    int hour;
    int minute;
    int second;

    public static void main(String[] args) {

        int hour1 = 12;
        int minute1 = 34;
        int second1 = 56;

        System.out.println("=== 비객체지향적인 코드 ===");
        System.out.println(hour1 + "시 " + minute1 + "분 " + second1 + "초");

        Time t = new Time();
        t.hour = 12;
        t.minute = 34;
        t.second = 56;

        System.out.println("=== 객체지향적인 코드 ===");


    }

}
