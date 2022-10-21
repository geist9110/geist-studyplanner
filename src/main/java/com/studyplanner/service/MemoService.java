package com.studyplanner.service;

import com.studyplanner.domain.Memo;
import com.studyplanner.dto.MemoDTO;
import com.studyplanner.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;

    public Memo createMemo(MemoDTO memoDTO){
        if(hasAnotherMemo()){
            memoRepository.deleteAll();
        }
        return memoRepository.save(memoDTO.toEntity());
    }

    public MemoDTO getMemo(){
        return MemoDTO.fromEntity(memoRepository.findTopByOrderById());
    }

    private boolean hasAnotherMemo(){
        return memoRepository.count() > 0;
    }
}
