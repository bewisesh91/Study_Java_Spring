package com.spring.week02.service;

import com.spring.week02.domain.Person;
import com.spring.week02.domain.PersonRepository;
import com.spring.week02.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service

public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public long update(Long id, PersonRequestDto requestDto) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("해당 id가 존재하지 않습니다.")
        );
        person.update(requestDto);
        return person.getId();
    }
}
