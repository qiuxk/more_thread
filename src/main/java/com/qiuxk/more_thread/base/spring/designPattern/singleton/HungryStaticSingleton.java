package com.qiuxk.more_thread.base.spring.designPattern.singleton;

/**
 * 饿汉式单利
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.singleton.HungryStaticSingleton
 * @date 2020-12-21 4:41 下午
 */
public class HungryStaticSingleton {
    //静态变量和静态代码块的加载顺序是代码编写的顺序
    private static  final  HungryStaticSingleton  hungryStaticSingleton;
    static {
        hungryStaticSingleton=new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return  hungryStaticSingleton;
    }
}
