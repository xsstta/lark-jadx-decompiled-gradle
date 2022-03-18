package com.bytedance.ee.bear.attachment.filereader;

import com.bytedance.ee.util.p700c.C13598b;
import java.io.Serializable;

public class FileDownloadModel implements Serializable {
    private String downloadPath;
    private String fileDriverKey;
    private String mountNodeToken;
    private String mountPoint;
    private String saveName;
    private String token;
    private int type;

    public FileDownloadModel() {
    }

    public String getDownloadPath() {
        return this.downloadPath;
    }

    public String getFileDriverKey() {
        return this.fileDriverKey;
    }

    public String getMountNodeToken() {
        return this.mountNodeToken;
    }

    public String getMountPoint() {
        return this.mountPoint;
    }

    public String getSaveName() {
        return this.saveName;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "NutFileDownloadModel{token='" + C13598b.m55197d(this.token) + '\'' + ", type=" + this.type + ", mountNodeToken='" + C13598b.m55197d(this.mountNodeToken) + '\'' + ", mountPoint='" + this.mountPoint + '\'' + '}';
    }

    public void setDownloadPath(String str) {
        this.downloadPath = str;
    }

    public void setFileDriverKey(String str) {
        this.fileDriverKey = str;
    }

    public void setMountNodeToken(String str) {
        this.mountNodeToken = str;
    }

    public void setMountPoint(String str) {
        this.mountPoint = str;
    }

    public void setSaveName(String str) {
        this.saveName = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public FileDownloadModel(String str, String str2, String str3, int i) {
        this.fileDriverKey = str;
        this.downloadPath = str2;
        this.saveName = str3;
        this.type = i;
    }
}
