package com.studyplanner.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@Entity
@Table(name = "Memo")
public class Memo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String memo;

    public Memo(String memo){
        this.memo = memo;
    }

}
