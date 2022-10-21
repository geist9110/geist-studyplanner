package com.studyplanner.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Disabled
@DisplayName("Error Controller Test")
@WebMvcTest(StudyPlannerErrorController.class)
class StudyPlannerErrorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void givenWrongPath_whenRequestAnyPages_returnErrorPage() throws Exception{
        // Given
        String wrongPath = "/wrongPath";

        // When & Then
        mvc.perform(get(wrongPath))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("/error/error"));

    }

}