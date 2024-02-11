package com.ohgiraffers;

public class Variables {

    /* 클래스 영역 */
    int iv;             // 인스턴스 변수
    static int cv;      // 클래스 변수(static변수, 공유변수)

    /* 메서드 영역 */
    void method() {
        int lv = 0;     // 지역변수
    }

}

    /* 영역 : ① 클래스 영역 - iv, cv(static + iv)
    *        ② 메서드 영역 - lv
    *
    * 클래스영역 : 선언문만 가능(변수선언, 메서드 선언)
    *            변수선언의 순서는 상관없으나 일반적으로 위에 선언함.
    * */