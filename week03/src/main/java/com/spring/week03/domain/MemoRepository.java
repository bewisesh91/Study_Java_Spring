package com.spring.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {     //JpaRepository를 상속한다.
    List<Memo> findAllByOrderByModifiedAtDesc();
    // List를 어떻게 받아올 것인지 조건을 정할 수 있다.
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
}