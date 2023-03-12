package com.mts.teta.validator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mts.teta.models.Message;

import java.util.Map;

public interface MessageValidator {
    Map<String, Object> checker(Message message) throws JsonProcessingException;
}
