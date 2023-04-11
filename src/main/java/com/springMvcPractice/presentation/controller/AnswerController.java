package com.springMvcPractice.presentation.controller;

import com.springMvcPractice.domain.model.Answer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
    @GetMapping("/answer")
    public Answer answer(@RequestParam String operand,
                         @RequestParam Integer answerInput) {
        System.out.println("問題:" + operand);
        System.out.println("回答:" + answerInput);
        String calcResult = "OK";
        //計算ドリル情報
        /*CreateDrillService createDrillService = new CreateDrillService();
        List<Drill> drillList = createDrillService.execute(plusCnt, minusCnt);
        model.addAttribute("drillList", drillList);*/
        return new Answer(calcResult);
    }
}
