package com.kan.kanElastic.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kan.kanElastic.repository.UserESRepository;
import com.kan.kanElastic.vo.UserES;

@Service
public class UserESService {

    
    @Autowired
    private UserESRepository userESRepository;
    
    private final ObjectMapper objectMapper = new ObjectMapper();

    
//    public UserESService(UserESRepository userESRepository) {
//        this.userESRepository = userESRepository;
//      }
    // Save an entity
    public UserES save(UserES userES) {
    	System.out.println("received from kafka {}"+userES);
        return userESRepository.save(userES);
    }
    
    public Iterable<UserES> findAll() {
        return userESRepository.findAll();
    }
    
    
    public String ReqFromKafka(@RequestBody String receivedMessage) throws JsonMappingException, JsonProcessingException {
    	
        Map<String, Object> messageMap = objectMapper.readValue(receivedMessage, Map.class);
    	System.out.println("received from kafka {}"+messageMap.get("payload"));
        List<Map<String, Object>> payloadData = (List<Map<String, Object>>) messageMap.get("payload");
    	Map<String, Object> userESMap = payloadData.get(0);
    	UserES userES = objectMapper.convertValue(userESMap, UserES.class);
    	this.save(userES);
    	return "hyy";
    }
}
