package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.Flyable;

public class FlyableImpl implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can fly in the sky");
    }
}
