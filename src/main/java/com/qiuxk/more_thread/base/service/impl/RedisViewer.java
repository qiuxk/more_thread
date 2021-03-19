package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.Viewer;

import java.util.HashMap;
import java.util.Map;

public class RedisViewer implements Viewer {
    @Override
    public String outputInPlainText() {
        return "this is redisViewer";
    }

    @Override
    public Map<String, String> outPut() {
        return new HashMap<>();
    }
}
