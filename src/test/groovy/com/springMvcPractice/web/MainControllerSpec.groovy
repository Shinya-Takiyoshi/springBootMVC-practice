package com.springMvcPractice.web

import org.springframework.ui.Model
import spock.lang.Specification

class MainControllerSpec extends Specification {
    def "Index"() {
        given:
        MainController mainController = new MainController()
        Model model = Mock(Model)
        model.addAttribute("test","こんにちは")
        expect:
        mainController.index(model) == "こんにちは"
    }
}
