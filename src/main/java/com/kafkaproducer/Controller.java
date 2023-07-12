package com.kafkaproducer;

import com.kafkaproducer.DAO.KafkaMessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class Controller {

    private KafkaTemplate<String, String> kafkaTemplate;

    public Controller(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping()
    public void publishKafkaMessage(@RequestBody KafkaMessageRequest messageRequest) {
        kafkaTemplate.send("kafkaExampleTopic", messageRequest.message());
    }
}
