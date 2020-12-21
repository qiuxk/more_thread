package com.qiuxk.more_thread.base.spring.designPattern.singleton;

/**
 * 懒汉式单例 线程安全
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.singleton.LazySafeSingleton
 * @date 2020-12-21 4:58 下午
 */
public class LazySafeSingleton {

    private LazySafeSingleton(){}
    //使用static是为了使用单例的空间共享
    public static final LazySafeSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    //内部类创建对象 默认是不被加载的
    //静态方法是在被调用是才会初始化
    //所以当调用getInstance时，再去创建对象
    private static class  LazyHolder{
        private static final LazySafeSingleton LAZY = new LazySafeSingleton();
    }

}
