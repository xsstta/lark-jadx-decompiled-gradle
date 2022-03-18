package com.bytedance.ee.bear.drive.loader.download.model.imfile;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class SdkSaveToSpaceStatus implements NonProguard {
    private String fileToken;
    private int status = -1;

    public String getFileToken() {
        return this.fileToken;
    }

    public int getStatus() {
        return this.status;
    }

    public SdkSaveToSpaceStatus() {
    }

    public String toString() {
        return "SdkSaveToSpaceStatus{status=" + this.status + ", fileToken='" + C13721c.m55650d(this.fileToken) + '\'' + '}';
    }

    public void setFileToken(String str) {
        this.fileToken = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public SdkSaveToSpaceStatus(int i) {
        this.status = i;
    }

    public SdkSaveToSpaceStatus(int i, String str) {
        this.status = i;
        this.fileToken = str;
    }
}
