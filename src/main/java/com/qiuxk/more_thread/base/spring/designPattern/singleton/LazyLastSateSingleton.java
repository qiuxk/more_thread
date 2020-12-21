package com.qiuxk.more_thread.base.spring.designPattern.singleton;

/**
 * 终极版 线程安全的 懒汉式单例模式
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.singleton.LazyLastSateSingleton
 * @date 2020-12-21 5:32 下午
 */
public class LazyLastSateSingleton {

    private LazyLastSateSingleton(){
        if(null != LazyHolder.LAZY){
            throw new RuntimeException("不允许创建多个实例!");
        }
    }

    public static final  LazyLastSateSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private final static LazyLastSateSingleton LAZY=new LazyLastSateSingleton();
    }
}
