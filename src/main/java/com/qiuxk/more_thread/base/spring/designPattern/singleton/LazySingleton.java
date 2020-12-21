package com.qiuxk.more_thread.base.spring.designPattern.singleton;

/**
 * 懒汉式单利
 * 只有在用到的时候才会创建对象或者返回已存在的对象
 * 缺点：有线程安全的隐患
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.singleton.LazySingleton
 * @date 2020-12-21 4:46 下午
 */
public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton lazySingleton=null;

    public synchronized static LazySingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
