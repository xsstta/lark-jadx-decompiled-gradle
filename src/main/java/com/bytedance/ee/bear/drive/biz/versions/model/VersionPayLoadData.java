package com.bytedance.ee.bear.drive.biz.versions.model;

import java.io.Serializable;

public class VersionPayLoadData implements Serializable {
    private String editUserId;
    private int operation;
    private int source;
    private String token;
    private String version;

    public String getEditUserId() {
        return this.editUserId;
    }

    public int getOperation() {
        return this.operation;
    }

    public int getSource() {
        return this.source;
    }

    public String getToken() {
        return this.token;
    }

    public String getVersion() {
        return this.version;
    }

    public void setEditUserId(String str) {
        this.editUserId = str;
    }

    public void setOperation(int i) {
        this.operation = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
