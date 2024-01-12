package com.tencent.wxcloudrun.model;


/**
 * @Author: Liuyan
 * @Date: 2024/1/10 上午 10:21
 * @Version 1.0
 */
public class SurveyReceiver {

    private String privacyInformationReceiver;

    private String privacyInformationReceiverAddr;

    private String privacyInformationReceiverContactWay;

    private String privacyInformationReceiverContactPerson;

    private String contactPersonDuty;

    public String getPrivacyInformationReceiver() {
        return privacyInformationReceiver;
    }

    public void setPrivacyInformationReceiver(String privacyInformationReceiver) {
        this.privacyInformationReceiver = privacyInformationReceiver;
    }

    public String getPrivacyInformationReceiverAddr() {
        return privacyInformationReceiverAddr;
    }

    public void setPrivacyInformationReceiverAddr(String privacyInformationReceiverAddr) {
        this.privacyInformationReceiverAddr = privacyInformationReceiverAddr;
    }

    public String getPrivacyInformationReceiverContactWay() {
        return privacyInformationReceiverContactWay;
    }

    public void setPrivacyInformationReceiverContactWay(String privacyInformationReceiverContactWay) {
        this.privacyInformationReceiverContactWay = privacyInformationReceiverContactWay;
    }

    public String getPrivacyInformationReceiverContactPerson() {
        return privacyInformationReceiverContactPerson;
    }

    public void setPrivacyInformationReceiverContactPerson(String privacyInformationReceiverContactPerson) {
        this.privacyInformationReceiverContactPerson = privacyInformationReceiverContactPerson;
    }

    public String getContactPersonDuty() {
        return contactPersonDuty;
    }

    public void setContactPersonDuty(String contactPersonDuty) {
        this.contactPersonDuty = contactPersonDuty;
    }
}
