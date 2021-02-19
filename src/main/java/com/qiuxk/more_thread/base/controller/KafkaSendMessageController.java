package com.qiuxk.more_thread.base.controller;

import com.qiuxk.more_thread.base.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * kafka发送消息控制器
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.controller.KafkaSendMessageController
 * @date 2021-02-19 12:16 下午
 */
@RestController
public class KafkaSendMessageController {
    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    @GetMapping("send/{message}")
    public void send(@PathVariable String message){
        kafkaTemplate.send("test",new Message("hello",message));
    }


}
