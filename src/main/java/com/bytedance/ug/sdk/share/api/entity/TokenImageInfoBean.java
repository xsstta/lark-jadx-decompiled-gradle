package com.bytedance.ug.sdk.share.api.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class TokenImageInfoBean implements Serializable {
    @SerializedName("height")
    private int mHeight;
    @SerializedName("uri")
    private String mUri;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("url_list")
    private List<Object> mUrlList;
    @SerializedName("width")
    private int mWidth;

    public int getHeight() {
        return this.mHeight;
    }

    public String getUri() {
        return this.mUri;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public List<Object> getUrlList() {
        return this.mUrlList;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setUri(String str) {
        this.mUri = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setUrlList(List<Object> list) {
        this.mUrlList = list;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }
}
