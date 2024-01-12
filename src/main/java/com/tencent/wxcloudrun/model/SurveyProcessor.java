package com.tencent.wxcloudrun.model;


import java.io.Serializable;

/**
 * @Author: Liuyan
 * @Date: 2024/1/10 上午 10:21
 * @Version 1.0
 */
public class SurveyProcessor {

    private String privacyInformationProcessor;

    private String privacyInformationProcessorAddr;

    private String privacyInformationProcessorContactWay;

    private String privacyInformationProcessorContactPerson;

    private String contactPersonDuty;

    public String getPrivacyInformationProcessor() {
        return privacyInformationProcessor;
    }

    public void setPrivacyInformationProcessor(String privacyInformationProcessor) {
        this.privacyInformationProcessor = privacyInformationProcessor;
    }

    public String getPrivacyInformationProcessorAddr() {
        return privacyInformationProcessorAddr;
    }

    public void setPrivacyInformationProcessorAddr(String privacyInformationProcessorAddr) {
        this.privacyInformationProcessorAddr = privacyInformationProcessorAddr;
    }

    public String getPrivacyInformationProcessorContactWay() {
        return privacyInformationProcessorContactWay;
    }

    public void setPrivacyInformationProcessorContactWay(String privacyInformationProcessorContactWay) {
        this.privacyInformationProcessorContactWay = privacyInformationProcessorContactWay;
    }

    public String getPrivacyInformationProcessorContactPerson() {
        return privacyInformationProcessorContactPerson;
    }

    public void setPrivacyInformationProcessorContactPerson(String privacyInformationProcessorContactPerson) {
        this.privacyInformationProcessorContactPerson = privacyInformationProcessorContactPerson;
    }

    public String getContactPersonDuty() {
        return contactPersonDuty;
    }

    public void setContactPersonDuty(String contactPersonDuty) {
        this.contactPersonDuty = contactPersonDuty;
    }

}
