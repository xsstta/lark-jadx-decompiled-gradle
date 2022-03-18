package com.tt.remotedebug.cmd;

public class Result2JsCmd {
    private int callbackId;
    private String event;
    private String name;
    private String params;
    private String result;
    private String webviewIds;

    public int getCallbackId() {
        return this.callbackId;
    }

    public String getEvent() {
        return this.event;
    }

    public String getName() {
        return this.name;
    }

    public String getParams() {
        return this.params;
    }

    public String getResult() {
        return this.result;
    }

    public String getWebviewIds() {
        return this.webviewIds;
    }

    public void setCallbackId(int i) {
        this.callbackId = i;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setWebviewIds(String str) {
        this.webviewIds = str;
    }
}
