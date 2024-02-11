package com.ohgiraffers;

public class Tv {

    // TV의 속성 : 크기, 길이, 높이, 색상, 볼륨, 채널 등
    // 변수
    String color;   // 색깔
    boolean power;  // 전원상태
    int channel;    // 채널

    // TV의 기능 : 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등
    // 메소드
    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }


}
