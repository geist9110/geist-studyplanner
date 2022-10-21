package com.studyplanner.repository;

import com.studyplanner.dto.DateDTO;

import java.time.LocalTime;

public interface CalendarCustomRepository {
    LocalTime getTime(DateDTO dateDTO);
}