package com.studyplanner.repository;

import com.studyplanner.domain.StudyTime;
import com.studyplanner.dto.StudyTimeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudyTimeRepository extends JpaRepository<StudyTime, Long> {

    StudyTimeDTO findByYearAndMonthAndDay(int year, int month, int day);

}
