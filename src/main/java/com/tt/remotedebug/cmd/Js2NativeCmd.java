package com.tt.remotedebug.cmd;

public class Js2NativeCmd {
    private int callbackId;
    private String event;
    private String name;
    private String params = "";
    private long time;
    private int timerId;
    private String timerType;
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

    public long getTime() {
        return this.time;
    }

    public int getTimerId() {
        return this.timerId;
    }

    public String getTimerType() {
        return this.timerType;
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

    public void setTime(long j) {
        this.time = j;
    }

    public void setTimerId(int i) {
        this.timerId = i;
    }

    public void setTimerType(String str) {
        this.timerType = str;
    }

    public void setWebviewIds(String str) {
        this.webviewIds = str;
    }
}
