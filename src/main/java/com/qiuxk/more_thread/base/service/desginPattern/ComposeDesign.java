package com.qiuxk.more_thread.base.service.desginPattern;

import com.qiuxk.more_thread.base.service.Flyable;
import com.qiuxk.more_thread.base.service.impl.FlyableImpl;

/**
 * 设计模式之 组合
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.desginPattern.ComposeDesign
 * @date 2021-03-16 6:11 下午
 */
public class ComposeDesign implements Flyable {
   Flyable flyable  =  new FlyableImpl();

    @Override
    public void fly() {
        flyable.fly();
    }
}
