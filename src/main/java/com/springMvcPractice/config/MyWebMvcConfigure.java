package com.springMvcPractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class MyWebMvcConfigure implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        //addArgmentで起動時にAnswerFilterArgumentResolverが登録されて有効となる
        resolvers.add(new AnswerFilterArgumentResolver());
    }

}
