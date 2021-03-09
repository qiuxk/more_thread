package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.desginPattern.Adapter;


/**
 * 如果类继承一个抽象类，必须得实现父类中得抽象方法，如果不想实现父类得方法，那么子类必须也是抽象类才行
 *
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.impl.AdapterSon
 * @date 2021-03-08 11:26 上午
 */
public class AdapterSon extends Adapter {
    @Override
    public String command() {
        return null;
    }
}
