package com.tencent.wxcloudrun.service.impl;




import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import com.tencent.wxcloudrun.dao.SurveyMapper;
import com.tencent.wxcloudrun.model.SurveyProcessor;
import com.tencent.wxcloudrun.model.SurveyReceiver;
import com.tencent.wxcloudrun.service.SurveyService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tencent.wxcloudrun.util.PdfGenerate;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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



    @Override
    public void createPdf(String surveyID) throws IOException {

        //surveyMapper.selectSurveyByID(surveyID);
        PdfGenerate.fillTextDemo();
        //PdfGenerate.fillImageDemo();





    }
}
