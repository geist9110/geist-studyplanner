package com.studyplanner.dto;

public record StudyTimeDTO(
        int year,
        int month,
        int day,
        int hour,
        int minute,
        int second
) {
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof StudyTimeDTO compare)){
            return false;
        } else{
            if(this.year != compare.year){return false;}
            if(this.month != compare.month){return false;}
            return this.day == compare.day;
        }
    }
}