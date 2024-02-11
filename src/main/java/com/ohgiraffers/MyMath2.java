package com.ohgiraffers;

public class MyMath2 {

    long a, b; // 인스턴스 변수(iv)

    /* 인스턴스 메서드*/
    long add() {
        return a + b; // <--- 인스턴스 변수 활용
    }

    /* static 메서드(클래스 메서드) */
    static long add(long a, long b) { // 지역 변수(lv)
        return a + b;  // <--- 지역 변수 활용
    }

}
