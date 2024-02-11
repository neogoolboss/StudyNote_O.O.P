package com.ohgiraffers;

import static com.ohgiraffers.Data.change;

import static com.ohgiraffers.Data2.change;
import static com.ohgiraffers.Data3.copy;

public class Main {

    public static void main(String[] args) {

        Tv t;
        t = new Tv();

        t.channel = 7;      // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown();    // Tv인스턴스 메소드 channelDown()을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");

        /* 객체의 생성과 사용 - 예제 */
        // 객체마다 별도의 저장공간이 생기기 때문에 값이 다르다.
        Tv t1 = new Tv();
        Tv t2 = new Tv();
//            t2 = t1; // 주소값((ex)0x100))이 바뀌기 때문에 기존 t2는 사용할 수 없게 된다.
        t1.channel = 7;
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        System.out.println("-----------------------------------------------------");
        // 객체 생성 없이 사용 가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        Card.width = 50;    // c1.width = 50; 실제로 cv지만 iv로 착각할 수 있기에 사용을 지양한다.
        Card.height = 80;   // c1.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");

        System.out.println("-----------------------------------------------------");

        /* 1. MyMath 라는 클래스를 작성(메서드 작성) */
        /* 2. MyMath 객체 생성*/
        MyMath myMath = new MyMath();
        /* 3. MyMath 객체 사용(객체의 메서드 호출) */
        long result1 = myMath.add(5L, 3L);
        long result2 = myMath.subtract(5L, 3L);
        long result3 = myMath.multiply(5L, 3L);
        double result4 = myMath.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);

        long result5 = myMath.max(8,10);
        System.out.println(result5);
        long result6 = myMath.max1(3,1);
        System.out.println(result6);

        Gugudan gugudan = new Gugudan();
        gugudan.printGugudan(4);

        System.out.println("---------------- 기본형 매개변수 ------------------");

        Data data = new Data();
        data.x = 10;
        System.out.println("main() : x = " + data.x);

        change(data.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + data.x);

        System.out.println("---------------- 참조형 매개변수 ------------------");

        Data2 data2 = new Data2();
        data2.x = 10;
        System.out.println("main() : x = " + data2.x );

        change(data2);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + data2.x );

        System.out.println("---------------- 참조형 반환타입 ------------------");

        Data3 data3 = new Data3();
        data3.x = 10;

        Data3 data31 = copy(data3);
        System.out.println("data3.x = " + data3.x);
        System.out.println("data31.x = " + data31.x);

        System.out.println(data31.hashCode());
        System.out.println(data3.hashCode());

        System.out.println("-----------------------------------------------------");

        MyMath3 myMath3 = new MyMath3();
        System.out.println("myMath3.add(3, 3) 결과 : " + myMath3.add(3,3));
        System.out.println("myMath3.add(3L, 3) 결과 : " + myMath3.add(3L,3));
        System.out.println("myMath3.add(3, 3L) 결과 : " + myMath3.add(3,3L));
        System.out.println("myMath3.add(3L, 3L) 결과 : " + myMath3.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("myMath3.add(a) 결과 : " + myMath3.add(a));

        System.out.println("-----------------------------------------------------");

        Data_1 d1 = new Data_1();
//        Data_2 d2 = new Data_2(); // compile error 발생







    }




}


