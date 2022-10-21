package com.studyplanner.controller.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.studyplanner.dto.CalendarDTO;
import com.studyplanner.dto.DateDTO;
import com.studyplanner.dto.StandardResponse;
import com.studyplanner.service.CalendarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/API")
@RestController
public class CalendarAPI {

    private final CalendarService calendarService;

    @GetMapping("/getCalendar")
    public String getCalendar() throws JsonProcessingException{
        log.info(calendarService.getAll().toString());

        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "Get Calendar Success",
                calendarService.getAll()
        ).toJson();
    }

    @PostMapping("/updateStudyTime")
    public String updateStudyTime(@RequestBody CalendarDTO calendarDTO) throws JsonProcessingException{

        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "Update StudyTime Success",
                calendarService.updateStudyTime(calendarDTO)
        ).toJson();
    }

    @GetMapping("/getTime")
    public String getTime(@RequestBody DateDTO dateDTO) throws JsonProcessingException{
        log.info("getTime is calles");
        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "Get Time Success",
                calendarService.getTime(dateDTO)
        ).toJson();


    }
}
