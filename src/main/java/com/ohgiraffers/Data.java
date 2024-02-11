package com.ohgiraffers;

public class Data {
    int x;

    static void change(int x) { // 기본형 매개변수
        x = 1000;               // 지역변수 x
        System.out.println("change() : x = " + x);
    }
}
