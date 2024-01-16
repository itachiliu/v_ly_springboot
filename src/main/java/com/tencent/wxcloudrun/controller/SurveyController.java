package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.model.SurveyReceiver;
import com.tencent.wxcloudrun.service.SurveyService;

import org.springframework.core.env.Environment;
import javax.servlet.http.HttpServletRequest;
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
    final private Environment env;


    public SurveyController(@Autowired SurveyService surveyService, @Autowired Environment env) {
        this.surveyService = surveyService;
        this.logger = LoggerFactory.getLogger(SurveyController.class);
        this.env = env;
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
        logger.info("surveyID:" + surveyReceiver.getSurveyID());
        try {
            surveyService.saveSurveyReceiver(surveyReceiver);
            return ResponseEntity.ok(surveyReceiver.getSurveyID());
        } catch (Exception e) {
            logger.error(e.toString());
            return (ResponseEntity<?>) ResponseEntity.status(400);
        }

    }

    @GetMapping("/create")
    public String createPdf(@RequestParam String surveyID, HttpServletRequest request) {
        try {
            surveyService.createPdf(surveyID);


            String filename = "test.pdf"; // 根据surveyID确定的文件名
            // 构建文件的完整URL
            String fileUrl = request.getScheme() + "://" + request.getServerName() + ":" +
                    env.getProperty("local.server.port") + "/" + filename;
            return fileUrl;
        } catch (Exception e) {
            e.printStackTrace();
            return "Error downloading PDF";
        }
    }


}


