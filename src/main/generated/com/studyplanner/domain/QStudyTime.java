package com.studyplanner.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStudyTime is a Querydsl query type for StudyTime
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyTime extends EntityPathBase<StudyTime> {

    private static final long serialVersionUID = 478842660L;

    public static final QStudyTime studyTime = new QStudyTime("studyTime");

    public final NumberPath<Integer> day = createNumber("day", Integer.class);

    public final NumberPath<Integer> hour = createNumber("hour", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> minute = createNumber("minute", Integer.class);

    public final NumberPath<Integer> month = createNumber("month", Integer.class);

    public final NumberPath<Integer> second = createNumber("second", Integer.class);

    public final NumberPath<Integer> year = createNumber("year", Integer.class);

    public QStudyTime(String variable) {
        super(StudyTime.class, forVariable(variable));
    }

    public QStudyTime(Path<? extends StudyTime> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudyTime(PathMetadata metadata) {
        super(StudyTime.class, metadata);
    }

}

