package com.springMvcPractice.application.service;

import com.springMvcPractice.domain.model.AnswerList;

import java.util.Collections;

public class AnswerService {
    /**
     * 回答結果情報を確認して、◯×を判定する
     **/
    public AnswerList calcResult() {

        return new AnswerList(Collections.emptyList());
    }
}
