package com.tencent.wxcloudrun.service.impl;



import com.tencent.wxcloudrun.dao.SurveyMapper;
import com.tencent.wxcloudrun.model.Survey;
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

    final SurveyMapper surveyMapper;

    public SurveyServiceImpl(@Autowired SurveyMapper surveyMapper) {
        this.surveyMapper = surveyMapper;
    }



    @Override
    public Survey saveSurvey(Survey survey) {
        return survey;
    }

}
