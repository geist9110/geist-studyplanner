package com.studyplanner.controller.api;

import com.studyplanner.dto.StandardResponse;
import com.studyplanner.dto.StudyTimeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/API")
public class StopWatchAPI {

    @PostMapping("/StopWatch")
    public StandardResponse createStopWatchTime(@RequestBody StudyTimeDTO studyTime) {
        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "SUCCESS",
                studyTime
        );
    }
}
