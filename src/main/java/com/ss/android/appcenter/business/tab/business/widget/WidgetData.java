package com.ss.android.appcenter.business.tab.business.widget;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WidgetData implements Serializable {
    @SerializedName("CardID")
    private String cardId;
    @SerializedName("Content")
    private String content;
    @SerializedName("CreateTime")
    private long createTime;
    @SerializedName("Version")
    private String version;

    public String getCardId() {
        return this.cardId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "WidgetData{" + "version='" + this.version + '\'' + ", cardId='" + this.cardId + '\'' + ", createTime=" + this.createTime + '}';
    }

    public boolean isValidCacheData(String str, String str2) {
        if (!TextUtils.equals(this.cardId, str) || !TextUtils.equals(this.version, str2)) {
            return false;
        }
        return true;
    }

    public boolean isValidRemoteData(String str, String str2, long j) {
        if (!TextUtils.equals(this.cardId, str) || !TextUtils.equals(this.version, str2) || this.createTime <= j) {
            return false;
        }
        return true;
    }

    public WidgetData(String str, String str2, String str3, long j) {
        this.content = str;
        this.version = str2;
        this.cardId = str3;
        this.createTime = j;
    }
}
