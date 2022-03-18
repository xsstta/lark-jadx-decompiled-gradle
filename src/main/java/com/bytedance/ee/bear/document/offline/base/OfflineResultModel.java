package com.bytedance.ee.bear.document.offline.base;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;

public class OfflineResultModel implements Serializable {
    private int code;
    private String data;
    private boolean isDataJsonInvalid;
    private String message;
    private String url;

    public OfflineResultModel() {
    }

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isDataJsonInvalid() {
        return this.isDataJsonInvalid;
    }

    public String toString() {
        String str;
        if (this.isDataJsonInvalid) {
            return JSON.toJSONString(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\": ");
        sb.append(this.code);
        sb.append(",\"message\": \"");
        sb.append(this.message);
        sb.append("\",\"url\": \"");
        sb.append(this.url);
        sb.append("\",\"data\": ");
        if (TextUtils.isEmpty(this.data)) {
            str = "\"\"";
        } else {
            str = this.data;
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDataJsonInvalid(boolean z) {
        this.isDataJsonInvalid = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public OfflineResultModel(int i, String str, String str2) {
        this.code = i;
        this.message = str;
        this.data = str2;
    }

    public OfflineResultModel(boolean z, String str, String str2) {
        this.code = !z ? 1 : 0;
        this.message = str;
        this.data = str2;
    }
}
