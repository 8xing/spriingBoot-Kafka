package com.xing.kafkaUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    public void  sendMessage(Message message){
        this.kafkaTemplate.send("test0",ObjectMapperUtil.toJson(message));
    }
}
