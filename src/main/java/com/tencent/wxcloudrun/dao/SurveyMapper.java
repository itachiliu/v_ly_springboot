package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.model.SurveyReceiver;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SurveyMapper {
    void saveSurvey(SurveyProcessor surveyProcessor);
    void saveSurveyReceiver(SurveyReceiver surveyReceiver);
}
