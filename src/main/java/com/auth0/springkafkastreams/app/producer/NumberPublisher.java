package com.auth0.springkafkastreams.app.producer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static com.auth0.springkafkastreams.app.streams.KafkaStream.INPUT_TOPIC_NAME;

@Slf4j
@Component
@AllArgsConstructor
public class NumberPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void produce(Integer randomNumber) {
        String s = "Odd";
        if (randomNumber % 2 == 0) s = "Even";
        System.out.println("Produced number: " + randomNumber);
        kafkaTemplate.send(INPUT_TOPIC_NAME, s, String.valueOf(randomNumber));
    }
}