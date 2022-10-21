package com.studyplanner.service;

import com.studyplanner.domain.Calendar;
import com.studyplanner.dto.CalendarDTO;
import com.studyplanner.dto.DateDTO;
import com.studyplanner.dto.TimeDTO;
import com.studyplanner.repository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CalendarService {

    private final CalendarRepository calendarRepository;

    public List<CalendarDTO> getAll(){
        return calendarRepository.findAll().stream().map(CalendarDTO::fromEntity).collect(Collectors.toList());
    }

    public boolean updateStudyTime(CalendarDTO calendarDTO){

        Calendar calendar = calendarRepository.getCalendarsByDate(calendarDTO.date());
        calendar.setTime(calendarDTO.time());
        calendarRepository.save(calendar);

        return true;
    }

    public CalendarDTO getTime(DateDTO dateDTO){
        return CalendarDTO.fromEntity(calendarRepository.getTime(dateDTO));
    }
}
