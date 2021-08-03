package com.spring.week03.domain;

import lombok.Getter;

//데이터를 옮기는 역할을 담당한다
@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
}
