package com.bytedance.ee.webapp.api.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;

public class AuthCodeInfo {
    @JSONField(name = "code")
    public int businessCode;
    @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    public DataCodeInfo data;
    @JSONField(name = "msg")
    public String message;

    public String toString() {
        return "AuthCodeInfo{code=" + this.businessCode + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }
}
