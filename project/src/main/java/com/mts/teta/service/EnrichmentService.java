package com.mts.teta.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mts.teta.models.Message;
import com.mts.teta.models.User;
import com.mts.teta.repositories.UserRepository;
import com.mts.teta.validator.MessageValidator;

import java.util.Map;
import java.util.Optional;

public class EnrichmentService {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final MessageValidator validator = null;
    private final UserRepository userRepository = null;

    public String enrich(Message message) {
        try {
            Map<String, Object> msg = validator.checker(message);
            Optional<User> user = userRepository.findByMsisdn((String) msg.get("msisdn"));
            user.ifPresent(value -> msg.put("enrichment", value));
            return MAPPER.writeValueAsString(msg);
        } catch (JsonProcessingException e) {
            System.err.println(e.getMessage());
            return message.getContent();
        }
    }
}
