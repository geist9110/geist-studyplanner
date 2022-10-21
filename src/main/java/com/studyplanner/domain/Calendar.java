package com.studyplanner.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Calendar")
public class Calendar {

    @Id
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "schedule")
    private String schedule;

    public void setSchedule(String schedule){
        this.schedule = schedule;
    }

    public void setTime(LocalTime time){
        this.time = time;
    }
}
