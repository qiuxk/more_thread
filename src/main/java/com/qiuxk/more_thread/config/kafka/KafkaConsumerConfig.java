package com.qiuxk.more_thread.config.kafka;

import com.qiuxk.more_thread.base.model.entity.Message;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;


/**
 * kafka消费者的配置类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.config.kafka.KafkaConsumerConfig
 * @date 2021-02-19 10:49 上午
 */
@Configuration
@EnableKafka
public class KafkaConsumerConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.consumer.group-id}")
    private String consumerGroupId;

    @Value(("${spring.kafka.consumer.auto-offset-reset}"))
    private String autoOffsetReset;


    @Bean
    public ConsumerFactory<String, Message> consumerFactory(){
        HashMap<String, Object> configProps = new HashMap<>();
        configProps.put(
                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
        configProps.put(
                ConsumerConfig.GROUP_ID_CONFIG, consumerGroupId);

        configProps.put(
                ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, autoOffsetReset);

//        configProps.put(
//                ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

//        configProps.put(
//                ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return new DefaultKafkaConsumerFactory<>(configProps,new StringDeserializer(),new JsonDeserializer<>(Message.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,Message> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, Message> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        //添加过滤设置 过滤掉含有cao的消息
        factory.setRecordFilterStrategy(a->a.value().getMessage().contains("cao"));
        return factory;
    }
 }
