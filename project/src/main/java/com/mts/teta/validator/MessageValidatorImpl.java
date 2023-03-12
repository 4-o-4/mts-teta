package com.mts.teta.validator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mts.teta.models.Message;

import java.util.Map;

public class MessageValidatorImpl implements MessageValidator {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public Map<String, Object> checker(Message message) throws JsonProcessingException {
        String content = message.getContent();
        return MAPPER.readValue(content, new TypeReference<>() {});
    }
}
