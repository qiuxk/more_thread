package com.qiuxk.more_thread.config.kafka;

import com.qiuxk.more_thread.base.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka监听器
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.config.kafka.KafkaMessageListener
 * @date 2021-02-19 11:48 上午
 */


@Slf4j
@Component
public class KafkaMessageListener {
    //可以监听多个topic  topics="test1，test2"
   // @KafkaListener(topics = "test",groupId = "test-consumer")
    public void listen(Message message){
        log.info("接收消息：{}",message.toString());
    }
}
