package com.springMvcPractice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Operator {
    PLUS("+"),
    MINUS("-");

    private String operator;
}
