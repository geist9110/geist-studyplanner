package com.studyplanner.service;

import com.studyplanner.domain.StudyTime;
import com.studyplanner.dto.StandardResponse;
import com.studyplanner.dto.StudyTimeDTO;
import com.studyplanner.repository.StudyTimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class StudyTimeService {

    private final StudyTimeRepository studyTimeRepository;

    public StudyTimeDTO getHowMuchStudy(int year, int month, int day){
        return studyTimeRepository.findByYearAndMonthAndDay(year, month, day);
    }

    public StandardResponse saveStudyTime(StudyTime studyTime){
        studyTimeRepository.save(studyTime);
        return StandardResponse.of(
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "SAVE",
                studyTime
        );
    }

    public List<StudyTime> getAll(){
        return studyTimeRepository.findAll();
    }

    public StandardResponse upDateStudyTime(StudyTimeDTO studyTimeDTO){
        return null;
    }

}
