package com.studyplanner.dto;

import com.studyplanner.domain.Memo;

public record MemoDTO(String memo) {

    public Memo toEntity(){
        return new Memo(this.memo);
    }

    public static MemoDTO fromEntity(Memo memo){
        return new MemoDTO(memo.getMemo());
    }

    @Override
    public String toString() {
        return "Memo Class / " + this.memo;
    }
}
