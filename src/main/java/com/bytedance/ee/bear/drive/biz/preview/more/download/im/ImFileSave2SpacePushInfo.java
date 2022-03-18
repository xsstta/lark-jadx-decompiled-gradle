package com.bytedance.ee.bear.drive.biz.preview.more.download.im;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;

public class ImFileSave2SpacePushInfo implements NonProguard {
    @JSONField(name = "app_file_id")
    private String appFileId;
    @JSONField(name = "app_id")
    private String appId;
    @JSONField(name = "file_token")
    private String fileToken;
    private String operation;

    public String getAppFileId() {
        return this.appFileId;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public String getOperation() {
        return this.operation;
    }

    public String toString() {
        return "SdkFilePushInfo{operation='" + this.operation + '\'' + ", appId='" + this.appId + '\'' + ", appFileId='" + C13598b.m55200g(this.appFileId) + '\'' + ", fileToken='" + C13721c.m55650d(this.fileToken) + '\'' + '}';
    }

    public void setAppFileId(String str) {
        this.appFileId = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setFileToken(String str) {
        this.fileToken = str;
    }

    public void setOperation(String str) {
        this.operation = str;
    }
}
