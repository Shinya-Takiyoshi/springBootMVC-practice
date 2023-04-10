package com.springMvcPractice.presentation.controller;

import com.springMvcPractice.domain.model.CreateDrillService;
import com.springMvcPractice.domain.model.Drill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index(Model model) {
        //TODO:リクエストパラメータはFormクラスにまとめる
        int plusCnt = (int)model.getAttribute("plusCnt");
        int minusCnt = (int)model.getAttribute("minusCnt");
        //計算ドリル情報
        CreateDrillService createDrillService = new CreateDrillService();
        List<Drill> drillList = createDrillService.execute(plusCnt, minusCnt);
        model.addAttribute("drillList", drillList);
        model.addAttribute("welcome", "こんにちは");
        return "index";
    }
}
