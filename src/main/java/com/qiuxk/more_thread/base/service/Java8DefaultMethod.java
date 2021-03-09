package com.qiuxk.more_thread.base.service;

/**
 * 测试java8中的default关键字
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.Java8DefaultMethod
 * @date 2021-03-08 3:31 下午
 */
public interface Java8DefaultMethod {
    int operate(int a,int b);

    default int add(int a,int b){
        return  a+b;
    }

}
