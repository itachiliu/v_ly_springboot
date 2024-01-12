package com.tencent.wxcloudrun.service.impl;



import com.tencent.wxcloudrun.dao.SurveyMapper;
import com.tencent.wxcloudrun.model.SurveyProcessor;
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
    public SurveyProcessor saveSurveyProcessor(SurveyProcessor survey) {

        surveyMapper.saveSurvey(survey);
        return null;
    }
}
