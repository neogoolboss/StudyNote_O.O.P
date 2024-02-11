package com.ohgiraffers;

public class Card {

    String kind;                // 무늬
    int number;                 // 숫자

    static int width = 100;     // 폭
    static int height = 250;    // 높이



    public static void main(String[] args) {

        Card c = new Card(); // 객체 생성

        /* 객체 사용*/
        c.kind = "Heart";
        c.number = 5;

        Card.width = 200;  // cv는 클래스 이름으로 호출한다.
        Card.height = 300;


    }

}
