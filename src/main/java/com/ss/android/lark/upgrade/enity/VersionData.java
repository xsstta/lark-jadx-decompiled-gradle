package com.ss.android.lark.upgrade.enity;

import java.io.Serializable;

public class VersionData implements Serializable {
    private String downloadMd5 = "";
    private String downloadUrl = "";
    private String releaseNotes = "";
    private String releaseTime = "";
    private String version = "";

    public String getDownloadMd5() {
        return this.downloadMd5;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getReleaseNotes() {
        return this.releaseNotes;
    }

    public String getReleaseTime() {
        return this.releaseTime;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDownloadMd5(String str) {
        this.downloadMd5 = str;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setReleaseNotes(String str) {
        this.releaseNotes = str;
    }

    public void setReleaseTime(String str) {
        this.releaseTime = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
