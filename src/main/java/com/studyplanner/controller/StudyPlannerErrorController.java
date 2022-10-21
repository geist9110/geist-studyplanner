package com.studyplanner.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class StudyPlannerErrorController implements ErrorController {
    @GetMapping("/error")
    public ModelAndView studyPlannerErrorController(){
        log.warn("Error page");
        return new ModelAndView("/error/error");
    }
}
