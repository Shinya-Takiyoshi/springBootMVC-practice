package com.springMvcPractice.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ドリルのモデリングクラス
 **/
@RequiredArgsConstructor
@Getter
public class Drill {

    private final String operand;
}
