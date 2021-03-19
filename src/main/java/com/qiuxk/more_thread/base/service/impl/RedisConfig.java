package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.Updater;
import com.qiuxk.more_thread.base.service.Viewer;

import java.util.HashMap;
import java.util.Map;

public class RedisConfig implements Updater, Viewer {
    @Override
    public void update() {
        System.out.println("this is redisConfig update");
    }

    @Override
    public String outputInPlainText() {
        return "this is redisViewer";
    }

    @Override
    public Map<String, String> outPut() {
        return new HashMap<>();
    }
}
