package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.SurveyProcessor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SurveyMapper {


    public void saveSurvey(SurveyProcessor surveyProcessor);


}
