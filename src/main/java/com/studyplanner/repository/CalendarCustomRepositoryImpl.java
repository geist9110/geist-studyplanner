package com.studyplanner.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.studyplanner.dto.DateDTO;
import com.studyplanner.dto.TimeDTO;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;

import static com.studyplanner.domain.QCalendar.calendar;

@RequiredArgsConstructor
public class CalendarCustomRepositoryImpl implements CalendarCustomRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public LocalTime getTime(DateDTO dateDTO) {
        return queryFactory
                .select(calendar.time)
                .from(calendar)
                .where(eqDate(dateDTO))
                .fetchOne();
    }

    private BooleanExpression eqTime(TimeDTO timeDTO) {
        if (timeDTO == null) {
            return null;
        }
        return calendar.time.eq(timeDTO.time());
    }

    private BooleanExpression eqDate(DateDTO dateDTO){
        if(dateDTO == null){
            return null;
        }
        return calendar.date.eq(dateDTO.date());
    }
}
