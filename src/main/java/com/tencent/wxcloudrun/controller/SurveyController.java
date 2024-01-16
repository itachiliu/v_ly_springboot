package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.model.SurveyReceiver;
import com.tencent.wxcloudrun.service.SurveyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

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
    @RequestMapping(value = "/api/surveyProcessor",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> submitSurveyProcessor(@RequestBody SurveyProcessor surveyProcessor) {
        // 处理问卷数据，例如保存到数据库
        logger.info("-----------this is survey Processor ---------------");
        logger.info("processor:" + surveyProcessor.getPrivacyInformationProcessor());
        //用时间戳标识问卷ID，用于表查询
        String surveyID = String.valueOf(Calendar.getInstance().getTimeInMillis());
        surveyProcessor.setSurveyID(surveyID);

        try {
            surveyService.saveSurveyProcessor(surveyProcessor);

            return ResponseEntity.ok(surveyID);
        } catch (Exception e) {
            logger.error(e.toString());
            return (ResponseEntity<?>) ResponseEntity.status(400);
        }

    }

    // 可以添加更多的方法来获取调查结果等
    @RequestMapping(value = "/api/surveyReceiver",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> submitSurveyReceiver(@RequestBody SurveyReceiver surveyReceiver) {
        // 处理问卷数据，例如保存到数据库
        logger.info("-----------this is survey receiver---------------");
        //logger.info("processor:" + surveyReceiver.getPrivacyInformationReceiver());
        try {
        surveyService.saveSurveyReceiver(surveyReceiver);


        return ResponseEntity.ok("问卷提交成功");
        } catch (Exception e) {
            logger.error(e.toString());
            return (ResponseEntity<?>) ResponseEntity.status(400);
        }

    }

    @GetMapping("/create")
    public ResponseEntity<String> createPdf(@RequestParam String text) {
        try {
            String src = "E:\\template.pdf";
            String dest = "E:\\output.pdf";
            surveyService.createPdf(src, dest, text);
            return ResponseEntity.ok("PDF created successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating PDF");
        }
    }


}


