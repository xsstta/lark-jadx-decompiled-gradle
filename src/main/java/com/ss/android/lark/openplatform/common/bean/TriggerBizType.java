package com.ss.android.lark.openplatform.common.bean;

public enum TriggerBizType {
    CHAT_ACTION("chatAction"),
    MESSAGE_ACTION("messageAction");
    
    private String value;

    public String getValue() {
        return this.value;
    }

    private TriggerBizType(String str) {
        this.value = str;
    }
}
