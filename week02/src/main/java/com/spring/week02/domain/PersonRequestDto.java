package com.spring.week02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class PersonRequestDto {
    private String name;
    private String job;
    private int age;
    private String address;

    public PersonRequestDto(String name, String job, int age, String address){
        this.name = name;
        this.job = job;
        this.age = age;
        this.address = address;
    }
}
