package com.ohgiraffers;

public class Data2 {
    int x;

    static void change(Data2 d) { // 참조형 매개변수
        d.x = 1000;               // 지역변수 x
        System.out.println("change() : x = " + d.x);
    }

}
