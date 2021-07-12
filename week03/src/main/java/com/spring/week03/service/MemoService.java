package com.spring.week03.service;

import com.spring.week03.domain.Memo;
import com.spring.week03.domain.MemoRepository;
import com.spring.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class MemoService {

    // update를 하려면 우선 데이터를 찾아와야한다. DB에 접근 할 수 있게 Repository를 불러오자.
    private final MemoRepository memoRepository;

    // DB에 반영해야 한다는 표시를 해주어야 한다.
    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto);
        return id;
    }
}