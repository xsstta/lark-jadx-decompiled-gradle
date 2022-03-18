package com.bytedance.ee.webapp.dto;

import java.io.Serializable;

public class SessionInfo implements Serializable {
    private String hostUrl;
    private String session;
    private String sessionName;

    public SessionInfo() {
    }

    public String getHostUrl() {
        return this.hostUrl;
    }

    public String getSession() {
        return this.session;
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public void setHostUrl(String str) {
        this.hostUrl = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSessionName(String str) {
        this.sessionName = str;
    }

    public SessionInfo(String str, String str2) {
        this.hostUrl = str;
        this.session = str2;
    }

    public SessionInfo(String str, String str2, String str3) {
        this.hostUrl = str;
        this.sessionName = str2;
        this.session = str3;
    }
}
