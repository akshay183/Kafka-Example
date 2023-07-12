package com.kafkaproducer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkaExampleTopic",
            groupId = "UUID100"
    )
    void listener(String data) {
        System.out.println("Kafka listening" + data);
    }

}
