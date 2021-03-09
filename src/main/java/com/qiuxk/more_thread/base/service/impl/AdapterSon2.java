package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.desginPattern.Adapter;

public abstract class AdapterSon2 extends Adapter {

    @Override
    public   String command(){
        String b = super.b;
        return "command";
    }
}
