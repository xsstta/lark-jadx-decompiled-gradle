package com.ss.android.lark.phone.impl.service.entity;

import com.ss.android.lark.phone.impl.common.PhoneControlStatus;
import java.io.Serializable;

public class PhoneQueryControlInfo implements Serializable {
    private String announcement;
    private PhoneControlStatus controlStatus;
    private String errMsg;
    private String leaderId;
    private String phoneNum;
    private String todayCallCount;

    public String getAnnouncement() {
        return this.announcement;
    }

    public PhoneControlStatus getControlStatus() {
        return this.controlStatus;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public String getTodayCallCount() {
        return this.todayCallCount;
    }

    public void setAnnouncement(String str) {
        this.announcement = str;
    }

    public void setControlStatus(PhoneControlStatus phoneControlStatus) {
        this.controlStatus = phoneControlStatus;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setLeaderId(String str) {
        this.leaderId = str;
    }

    public void setPhoneNum(String str) {
        this.phoneNum = str;
    }

    public void setTodayCallCount(String str) {
        this.todayCallCount = str;
    }
}
