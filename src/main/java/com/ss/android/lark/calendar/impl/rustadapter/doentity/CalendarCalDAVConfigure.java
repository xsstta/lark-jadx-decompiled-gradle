package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class CalendarCalDAVConfigure implements Serializable {
    private String mPassword;
    private String mServerAddress;
    private String mServerPort;
    private String mUsername;

    public String getPassword() {
        return this.mPassword;
    }

    public String getServerAddress() {
        return this.mServerAddress;
    }

    public String getServerPort() {
        return this.mServerPort;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public void setPassword(String str) {
        this.mPassword = str;
    }

    public void setServerAddress(String str) {
        this.mServerAddress = str;
    }

    public void setServerPort(String str) {
        this.mServerPort = str;
    }

    public void setUsername(String str) {
        this.mUsername = str;
    }
}
