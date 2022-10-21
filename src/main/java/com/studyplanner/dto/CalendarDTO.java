package com.studyplanner.dto;

import com.studyplanner.domain.Calendar;

import java.time.LocalDate;
import java.time.LocalTime;

public record CalendarDTO(
        LocalDate date,
        LocalTime time,
        String schedule
) {
    static public CalendarDTO fromEntity(Calendar calendar) {
        return new CalendarDTO(calendar.getDate(), calendar.getTime(), calendar.getSchedule());
    }

    static public CalendarDTO fromEntity(TimeDTO timeDTO){
        return new CalendarDTO(null, timeDTO.time(), null);
    }

    static public CalendarDTO fromEntity(LocalTime localTime){
        return new CalendarDTO(null, localTime, null);
    }
}
