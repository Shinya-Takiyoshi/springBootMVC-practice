package com.springMvcPractice.presentation.controller.thymeleaf.expression;

import org.springframework.stereotype.Component;

@Component
public class HelloExpression {

    public String helloText() {
        return "hello";
    }

}
