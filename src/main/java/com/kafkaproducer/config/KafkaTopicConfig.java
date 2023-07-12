package com.kafkaproducer.config;

;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaExampleTopic() {
        return TopicBuilder.name("kafkaExampleTopic")
                .build();
    }

}
