package com.bytedance.ee.bear.drive.module.nativepreview.model;

import com.bytedance.ee.util.io.NonProguard;

public class DrivePreviewOpenModel implements NonProguard {
    private String appId;
    private String authExtra;
    private String fileId;
    private String fileName;
    private String fileType;
    private String mountNodeToken;
    private String mountPoint;
    private String prewiewFrom;

    public String getAppId() {
        return this.appId;
    }

    public String getAuthExtra() {
        return this.authExtra;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMountNodeToken() {
        return this.mountNodeToken;
    }

    public String getMountPoint() {
        return this.mountPoint;
    }

    public String getPrewiewFrom() {
        return this.prewiewFrom;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAuthExtra(String str) {
        this.authExtra = str;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMountNodeToken(String str) {
        this.mountNodeToken = str;
    }

    public void setMountPoint(String str) {
        this.mountPoint = str;
    }

    public void setPrewiewFrom(String str) {
        this.prewiewFrom = str;
    }

    public DrivePreviewOpenModel(String str, String str2, String str3) {
        this.appId = str;
        this.fileId = str2;
        this.fileName = str3;
    }
}
