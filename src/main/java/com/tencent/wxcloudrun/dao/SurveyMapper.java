package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Survey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SurveyMapper {

    Survey getSurvey(@Param("id") Integer id);


}
