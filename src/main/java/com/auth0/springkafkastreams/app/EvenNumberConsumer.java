package com.auth0.springkafkastreams.app;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.auth0.springkafkastreams.app.KafkaStream.OUTPUT_TOPIC_NAME;

@Component
@EnableKafka
public class EvenNumberConsumer {

    @KafkaListener(topics = OUTPUT_TOPIC_NAME)
    public void receive(String value) {
        System.out.println("Received number: " + value);
    }
}
