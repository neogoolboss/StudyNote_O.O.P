package com.ohgiraffers;

public class TestClass2 {

    int iv;                 // 인스턴스 변수
    static int cv;          // 클래스 변수

    void instanceMethod() {                 // 인스턴스 메소드
        System.out.println(iv);             // 인스턴수 변수를 사용할 수 있다.
        System.out.println(cv);             // 클래스 변수를 사용할 수 있다.
    }

    static void staticMethod() {            // 클래스 변수
//        System.out.println(iv);             // ❌에러!! 인스턴스 변수를 사용할 수 없다
        System.out.println(cv);             // 클래스 변수는 사용할 수 있다.
    }
}
