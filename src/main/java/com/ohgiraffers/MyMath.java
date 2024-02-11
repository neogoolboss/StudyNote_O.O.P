package com.ohgiraffers;

public class MyMath {

    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b; 로 간단히 할 수 있다.
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    long max(long a, long b){
        long result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    // 삼항연산자를 활용하면 간단히 표현 가능
     long max1(long a, long b) {
      return  a > b ? a : b;
     }

}
