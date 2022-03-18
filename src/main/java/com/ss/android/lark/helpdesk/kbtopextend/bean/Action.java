package com.ss.android.lark.helpdesk.kbtopextend.bean;

public class Action {
    private MultiUrl multi_url;
    private String value;

    public MultiUrl getMulti_url() {
        return this.multi_url;
    }

    public String getValue() {
        return this.value;
    }

    public void setMulti_url(MultiUrl multiUrl) {
        this.multi_url = multiUrl;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
