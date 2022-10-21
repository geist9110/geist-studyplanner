package com.studyplanner.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

public record StandardResponse(
    Integer code,
    HttpStatus httpStatus,
    String message,
    Object result
) {
    public static StandardResponse of(
            Integer code,
            HttpStatus httpStatus,
            String message,
            Object result
    ){
        return new StandardResponse(code, httpStatus, message, result);
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.registerModule(new JavaTimeModule()).writeValueAsString(this.result);
    }
}
