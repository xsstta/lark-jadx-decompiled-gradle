package com.ss.android.vc.entity;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class VCNotice implements Serializable {
    public ActionTime actionTime;
    public VcI18nKeyInfo btn_i18n_key;
    public int cmd;
    public Map<String, String> extra;
    public long meetingEndReceiveTime;
    public long meetingEndTime;
    public String meetingId;
    public String message;
    public String messageId;
    public VcI18nKeyInfo msg_i18n_key;
    public String noticeId;
    public int popupType;
    public String pushSid;
    public int statusCode;
    public int timeOut;
    public String title;
    public VcI18nKeyInfo title_i18n_key;
    public int toastDuration;
    public int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PopupType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public String toString() {
        return "VCNotice{statusCode=" + this.statusCode + ", type=" + this.type + ", msg_i18n_key=" + this.msg_i18n_key + ", title_i18n_key=" + this.title_i18n_key + ", btn_i18n_key=" + this.btn_i18n_key + ", message='" + this.message + '\'' + ", title='" + this.title + '\'' + ", noticeId='" + this.noticeId + '\'' + ", cmd=" + this.cmd + ", actionTime=" + this.actionTime + ", timeOut=" + this.timeOut + ", meetingId='" + this.meetingId + '\'' + ", messageId='" + this.messageId + '\'' + ", extra=" + this.extra + ", pushSid='" + this.pushSid + '\'' + ", meetingEndTime='" + this.meetingEndTime + '\'' + ", popupType=" + this.popupType + '}';
    }
}
