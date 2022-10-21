package com.studyplanner.controller.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studyplanner.domain.StudyTime;
import com.studyplanner.dto.MemoDTO;
import com.studyplanner.repository.StudyTimeRepository;
import com.studyplanner.service.StudyTimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TestAPI {

    private final StudyTimeService studyTimeService;

    @GetMapping("/test")
    public String testPage() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        MemoDTO memoDTO = new MemoDTO("Memo Test");

        log.info("[GET] [test page] return : " + memoDTO.toString());
        return mapper.writeValueAsString(memoDTO);
    }

    @GetMapping("/sqlTest")
    public List<StudyTime> sqlTest(){
        return studyTimeService.getAll();
    }
}
