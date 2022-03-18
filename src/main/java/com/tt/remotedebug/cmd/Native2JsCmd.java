package com.tt.remotedebug.cmd;

public class Native2JsCmd {
    private float argc;
    private float callbackId;
    private String data;
    private String event;
    private String name;
    private int webviewId;

    public float getArgc() {
        return this.argc;
    }

    public float getCallbackId() {
        return this.callbackId;
    }

    public String getData() {
        return this.data;
    }

    public String getEvent() {
        return this.event;
    }

    public String getName() {
        return this.name;
    }

    public int getWebviewId() {
        return this.webviewId;
    }

    public void setArgc(float f) {
        this.argc = f;
    }

    public void setCallbackId(float f) {
        this.callbackId = f;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWebviewId(int i) {
        this.webviewId = i;
    }
}
