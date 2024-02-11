package com.ohgiraffers;

public class Gugudan {

    void printGugudan(int dan) {
                if(!(2 <= dan && dan <= 9))
                       return;  // dan의 값이 2 ~ 9가 아닌 경우, 호출한 곳으로 되돌아간다.

                for(int i = 1; i <= 9; i++) {
                       System.out.printf("%d * %d = %d%n", dan, i, dan * i);
                }
                return;        // 반환타입이 void 이므로 생략 가능. 컴파일러가 자동추가해준다.
           }

}
