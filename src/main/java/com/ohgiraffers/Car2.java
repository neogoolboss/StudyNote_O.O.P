package com.ohgiraffers;

public class Car2 {

    String color;           // 색상
    String gearType;        // 변속기 종류 - auto(자동), manual(수동)
    int door;               // 문의 개수

    Car2() {                                           // 코드 중복을 제거하기 위해
        this("white", "auto", 4);  // Car2(String color, String gearType, int door)를 호출
    }

    Car2(String c) {
        this(color, "auto", 4);         // Car2(String color, String gearType, int door)를 호출
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}
