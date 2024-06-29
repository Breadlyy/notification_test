package com.notification.notification_service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class KafkaConsumer {


    @KafkaListener(topics = "notification_topic", groupId = "myGroup")
    public void consume(String message)
    {
        log.info("Message received -> " + message);
    }
}
