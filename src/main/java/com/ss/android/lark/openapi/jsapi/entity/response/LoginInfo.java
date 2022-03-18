package com.ss.android.lark.openapi.jsapi.entity.response;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.List;

public class LoginInfo implements BaseJSModel {
    private int appId;
    private String deviceModel;
    private String deviceName;
    private String deviceOs;
    private String locale;
    private List<Sessions> sessions;
    private String stagingFeatureId;
    private int terminalType;
    private String xldcFlowControl;

    public static class Sessions implements BaseJSModel {
        private String contactPoint;
        private List<String> session;

        public Sessions() {
        }

        public String getContactPoint() {
            return this.contactPoint;
        }

        public List<String> getSession() {
            return this.session;
        }

        public void setContactPoint(String str) {
            this.contactPoint = str;
        }

        public void setSession(List<String> list) {
            this.session = list;
        }

        public Sessions(String str, List<String> list) {
            this.contactPoint = str;
            this.session = list;
        }
    }

    public LoginInfo() {
    }

    public int getAppId() {
        return this.appId;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceOs() {
        return this.deviceOs;
    }

    public String getLocale() {
        return this.locale;
    }

    public List<Sessions> getSessions() {
        return this.sessions;
    }

    public String getStagingFeatureId() {
        return this.stagingFeatureId;
    }

    public int getTerminalType() {
        return this.terminalType;
    }

    public String getXldcFlowControl() {
        return this.xldcFlowControl;
    }

    public void setAppId(int i) {
        this.appId = i;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceOs(String str) {
        this.deviceOs = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setSessions(List<Sessions> list) {
        this.sessions = list;
    }

    public void setStagingFeatureId(String str) {
        this.stagingFeatureId = str;
    }

    public void setTerminalType(int i) {
        this.terminalType = i;
    }

    public void setXldcFlowControl(String str) {
        this.xldcFlowControl = str;
    }

    public LoginInfo(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6) {
        this.terminalType = i;
        this.deviceName = str;
        this.deviceOs = str2;
        this.deviceModel = str3;
        this.appId = i2;
        this.locale = str4;
        this.stagingFeatureId = str5;
        this.xldcFlowControl = str6;
    }
}
