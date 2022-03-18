package com.bytedance.ee.bear.document.offline.file;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class FileResultModel implements NonProguard {
    private int code = 1;
    private Data data;
    private String message = "";
    private boolean showQuotaAlert;
    private String uuid = "";

    public static class Data implements NonProguard {
        private String pencilKitToken;
        private String token;
        private int uploadType;
        private String url;

        public Data() {
        }

        public String getPencilKitToken() {
            return this.pencilKitToken;
        }

        public String getToken() {
            return this.token;
        }

        public int getUploadType() {
            return this.uploadType;
        }

        public String getUrl() {
            return this.url;
        }

        public String toString() {
            return "Data{url='" + C13721c.m55650d(this.url) + '\'' + ", token='" + C13721c.m55650d(this.token) + '\'' + ", pencilKitToken='" + C13721c.m55650d(this.pencilKitToken) + '\'' + ", uploadType=" + this.uploadType + '}';
        }

        public void setPencilKitToken(String str) {
            this.pencilKitToken = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setUploadType(int i) {
            this.uploadType = i;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public Data(String str, String str2, int i) {
            this.url = str;
            this.token = str2;
            this.uploadType = i;
        }
    }

    public int getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isShowQuotaAlert() {
        return this.showQuotaAlert;
    }

    public String toString() {
        return "FileResultModel{code=" + this.code + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setShowQuotaAlert(boolean z) {
        this.showQuotaAlert = z;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
