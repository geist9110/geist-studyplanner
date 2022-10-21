package com.studyplanner.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCalendar is a Querydsl query type for Calendar
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalendar extends EntityPathBase<Calendar> {

    private static final long serialVersionUID = 1008574096L;

    public static final QCalendar calendar = new QCalendar("calendar");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final StringPath schedule = createString("schedule");

    public final TimePath<java.time.LocalTime> time = createTime("time", java.time.LocalTime.class);

    public QCalendar(String variable) {
        super(Calendar.class, forVariable(variable));
    }

    public QCalendar(Path<? extends Calendar> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCalendar(PathMetadata metadata) {
        super(Calendar.class, metadata);
    }

}

