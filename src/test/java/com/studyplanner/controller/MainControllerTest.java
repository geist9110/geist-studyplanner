package com.studyplanner.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Disabled
@WebMvcTest(MainController.class)
class MainControllerTest {
    private final MockMvc mvc;
    public MainControllerTest(@Autowired MockMvc mvc) {this.mvc = mvc;}

    @DisplayName("[View][GET] Main Controller Test")
    @Test
    public void givenNothing_thenRequestMainPage_returnIndexPage() throws Exception{
        // Given

        // When

        // Then
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("index"));
    }

}