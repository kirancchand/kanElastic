package com.kan.kanElastic.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
@Service
public class KafkaConsumerService {

    @Autowired
    private UserESService userESService;
    
    @KafkaListener(topics="UserRegistration",groupId="kafkaElasticGroupId")
    public void consume(String message) throws JsonMappingException, JsonProcessingException {
        System.out.println("Consumed message from kanElastic"+message);
        userESService.ReqFromKafka(message);
//        userESService.save(message);
        
    }
}
