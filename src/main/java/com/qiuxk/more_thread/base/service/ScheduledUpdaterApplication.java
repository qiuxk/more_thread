package com.qiuxk.more_thread.base.service;


import com.qiuxk.more_thread.base.service.impl.KafkaConfig;
import com.qiuxk.more_thread.base.service.impl.RedisConfig;
import com.qiuxk.more_thread.base.service.impl.ScheduledUpdater;

public class ScheduledUpdaterApplication {

   public static final RedisConfig redisConfig=  new RedisConfig();
   public static final KafkaConfig kafkaConfig=  new KafkaConfig();

    public static void main(String[] args) {

        //监控redis和kafka
        ScheduledUpdater redisScheduledUpdater = new ScheduledUpdater(redisConfig, 300, 300);
        redisScheduledUpdater.run();

        ScheduledUpdater kafkaScheduledUpdater = new ScheduledUpdater(kafkaConfig, 300, 400);
        kafkaScheduledUpdater.run();

        //输出redis信息
        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 8888);
        simpleHttpServer.addViewers("/config",redisConfig);
        simpleHttpServer.run();
    }

}
