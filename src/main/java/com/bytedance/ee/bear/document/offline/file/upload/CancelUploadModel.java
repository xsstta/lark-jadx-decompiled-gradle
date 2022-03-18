package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.util.io.NonProguard;

/* access modifiers changed from: package-private */
public class CancelUploadModel implements NonProguard {
    private String contentType;
    private String fileName;
    private String fileUrl;
    private String token;
    private String uuid;

    CancelUploadModel() {
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getToken() {
        return this.token;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
