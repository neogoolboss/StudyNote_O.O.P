package com.ohgiraffers;

public class Data3 {
    int x;

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;
    }
}
