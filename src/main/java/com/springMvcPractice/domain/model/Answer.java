package com.springMvcPractice.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Answer {
    private final Integer position;
    private final String operand;
    private final Integer calcResult;
}
