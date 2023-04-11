package com.springMvcPractice.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class AnswerList {
    private final List<Answer> answerList;
}
