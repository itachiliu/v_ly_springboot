package com.tencent.wxcloudrun.service.impl;



import com.tencent.wxcloudrun.dao.SurveyMapper;
import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.model.SurveyReceiver;
import com.tencent.wxcloudrun.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Liuyan
 * @Date: 2024/1/10 上午 11:16
 * @Version 1.0
 */
@Service
public class SurveyServiceImpl implements SurveyService {
    @Autowired
    SurveyMapper surveyMapper;

    @Override
    public void saveSurveyProcessor(SurveyProcessor survey) {
        surveyMapper.saveSurvey(survey);
    }

    @Override
    public void saveSurveyReceiver(SurveyReceiver surveyReceiver) {
        surveyMapper.saveSurveyReceiver(surveyReceiver);
    }
}
