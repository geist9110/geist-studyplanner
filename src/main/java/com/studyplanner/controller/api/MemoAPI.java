package com.studyplanner.controller.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.studyplanner.dto.MemoDTO;
import com.studyplanner.dto.StandardResponse;
import com.studyplanner.service.MemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/API")
public class MemoAPI {

    private final MemoService memoService;

    @PostMapping("/postMemo")
    public String postMemo(@RequestBody MemoDTO memoDTO) throws JsonProcessingException{

        log.info(memoDTO.toString());

        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "Memo Create Success",
                memoService.createMemo(memoDTO)
                ).toJson();
    }

    @GetMapping("/getMemo")
    public String getMemo() throws JsonProcessingException {
        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "Memo Load Success",
                memoService.getMemo()
        ).toJson();
    }
}
