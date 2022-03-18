package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class UploadResult implements NonProguard {
    private String cdn_url = "";
    private int code = -1;
    private String decrypt_key = "";
    private String fileToken;
    private String file_key = "";
    private String message = "";
    private String thumbnail_url = "";
    private String url = "";

    public String getCdn_url() {
        return this.cdn_url;
    }

    public int getCode() {
        return this.code;
    }

    public String getDecrypt_key() {
        return this.decrypt_key;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public String getFile_key() {
        return this.file_key;
    }

    public String getMessage() {
        return this.message;
    }

    public String getThumbnail_url() {
        return this.thumbnail_url;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "UploadResult{code=" + this.code + ", message='" + this.message + '\'' + ", file_token='" + C13721c.m55650d(this.fileToken) + '\'' + ", url='" + C13721c.m55650d(this.url) + '\'' + ", file_key='" + C13721c.m55650d(this.file_key) + '\'' + ", decrypt_key='" + this.decrypt_key + '\'' + ", cdn_url='" + C13721c.m55650d(this.cdn_url) + '\'' + ", thumbnail_url='" + C13721c.m55650d(this.thumbnail_url) + '\'' + '}';
    }

    public void setCdn_url(String str) {
        this.cdn_url = str;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setDecrypt_key(String str) {
        this.decrypt_key = str;
    }

    public void setFileToken(String str) {
        this.fileToken = str;
    }

    public void setFile_key(String str) {
        this.file_key = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setThumbnail_url(String str) {
        this.thumbnail_url = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
