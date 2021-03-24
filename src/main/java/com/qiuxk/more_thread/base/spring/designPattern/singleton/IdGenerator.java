package com.qiuxk.more_thread.base.spring.designPattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 通过枚举实现单利
 *  INSTANCE，NAME 都会变编译成常量对象，只会在加载的时候new一次
 *  枚举中可以添加属性
 *  此单利模式就是通过常量对象被加载一次的原理创造的
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.singleton.IdGenerator
 * @date 2021-03-22 4:31 下午
 */


public enum IdGenerator {

    INSTANCE,NAME;


    private AtomicLong id= new AtomicLong(0);

    public static Long getId(){
        return IdGenerator.INSTANCE.id.incrementAndGet();
    }

    public static  Long anotherGetId(){
        return IdGenerator.NAME.id.incrementAndGet();
    }

}
