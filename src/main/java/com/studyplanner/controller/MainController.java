package com.studyplanner.controller;

import com.studyplanner.service.MemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Slf4j
@Controller
public class MainController {

    private final MemoService memoService;

//    @GetMapping("/")
//    public ModelAndView rootPage(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//
//        modelAndView.addObject("Memo", memoService.getMemo().memo());
//
//
//        return modelAndView;
//    }
    @GetMapping("/")
    public String page() {
        return "index.html";
    }
}
