package com.main.main_service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    KafkaProducer kafkaProducer;

    public MainController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/message")
    public void sendMessage() throws InterruptedException {
        kafkaProducer.sendMessage();
    }
}
