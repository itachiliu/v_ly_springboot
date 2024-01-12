package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.model.SurveyReceiver;

/**
 * @Author: Liuyan
 * @Date: 2024/1/10 上午 11:29
 * @Version 1.0
 */
public interface SurveyService {
    void saveSurveyProcessor(SurveyProcessor survey);


    void saveSurveyReceiver(SurveyReceiver surveyReceiver);
}
