package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.Updater;

public class KafkaConfig implements Updater {
    @Override
    public void update() {
        System.out.println("this is kafkaConfig update");
    }
}
