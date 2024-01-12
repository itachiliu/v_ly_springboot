package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.service.SurveyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping(value = "/api/survey",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> submitSurvey(@RequestBody SurveyProcessor surveyProcessor) {
        // 处理问卷数据，例如保存到数据库
        logger.info("-----------this is survey---------------");
        logger.info("processor:" + surveyProcessor.getPrivacyInformationProcessor());

        surveyService.saveSurveyProcessor(surveyProcessor);
        return ResponseEntity.ok("问卷提交成功");
    }

}


