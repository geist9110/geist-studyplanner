package com.studyplanner.repository;

import com.studyplanner.domain.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface CalendarRepository extends JpaRepository<Calendar, LocalDate>, CalendarCustomRepository {

    Calendar getCalendarsByDate(LocalDate localDate);

}
