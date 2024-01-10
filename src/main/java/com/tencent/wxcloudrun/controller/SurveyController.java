package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.service.SurveyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: Liuyan
 * @Date: 2024/1/10 上午 10:24
 * @Version 1.0
 */

@RestController
public class SurveyController {


    final SurveyService surveyService;
    final Logger logger;

    public SurveyController(@Autowired SurveyService surveyService) {
        this.surveyService = surveyService;
        this.logger = LoggerFactory.getLogger(CounterController.class);
    }


    // 可以添加更多的方法来获取调查结果等
}
