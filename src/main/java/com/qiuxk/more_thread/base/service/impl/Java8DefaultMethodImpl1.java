package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.Java8DefaultMethod;

public class Java8DefaultMethodImpl1  implements Java8DefaultMethod {


    @Override
    public int operate(int a, int b) {
        return a-b;
    }


    public static void main(String[] args) {
        Java8DefaultMethodImpl1 java8DefaultMethodImpl1 = new Java8DefaultMethodImpl1();
        int add = java8DefaultMethodImpl1.add(5, 3);
        System.out.println(add);
        int operate = java8DefaultMethodImpl1.operate(5, 3);
        System.out.println(operate);
    }
}
