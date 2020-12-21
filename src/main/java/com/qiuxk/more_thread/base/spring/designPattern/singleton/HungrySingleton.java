package com.qiuxk.more_thread.base.spring.designPattern.singleton;

/**
 * 饿汉式单利  汉子比较饿，所以管他三七二一，类加载的时候就先把对象创建了再说
 * 优点：没有锁，效率高
 * 缺点：类加载的时候就把对象创建，占内存
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.sigleton.HungrySigleton
 * @date 2020-12-21 4:01 下午
 */
public class HungrySingleton {

    //先静态，后动态
    //先属性，后方法
    //先上后下
    /**类加载顺序**/
    // 1.静态变量和静态代码块 看写的顺序决定
    // 静态快（静态变量）-->成员变量---> 构造方法--->静态方法
    //参考 https://www.cnblogs.com/leiqiannian/p/7922824.html
    private static final  HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }
}
