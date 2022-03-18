package com.ss.android.lark.chat.entity.sticker;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Archive implements Serializable {
    private String mCheckSum;
    private String mKey;
    private String mMime;
    private Map<String, String> mParams;
    private long mSize;
    private List<String> mUrls;

    public String getCheckSum() {
        return this.mCheckSum;
    }

    public String getKey() {
        return this.mKey;
    }

    public String getMime() {
        return this.mMime;
    }

    public Map<String, String> getParams() {
        return this.mParams;
    }

    public long getSize() {
        return this.mSize;
    }

    public List<String> getUrls() {
        return this.mUrls;
    }

    public void setCheckSum(String str) {
        this.mCheckSum = str;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setMime(String str) {
        this.mMime = str;
    }

    public void setParams(Map<String, String> map) {
        this.mParams = map;
    }

    public void setSize(long j) {
        this.mSize = j;
    }

    public void setUrls(List<String> list) {
        this.mUrls = list;
    }
}
