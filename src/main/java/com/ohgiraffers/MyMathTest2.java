package com.ohgiraffers;

public class MyMathTest2 {

    public static void main(String[] args) {

        System.out.println(MyMath2.add(200L, 100L)); // 클래스 메서드 호출
        // 객체 생성 없이 클래스 명으로 호출

        MyMath2 myMath2 = new MyMath2(); // ① 인스턴스 생성
        myMath2.a = 200L;
        myMath2.b = 100L;
        System.out.println(myMath2.add()); // ② 인스턴스 메서드 호출
        // 객체 생성 후 참조변수로 호출

    }

}
