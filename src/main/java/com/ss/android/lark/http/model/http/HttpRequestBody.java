package com.ss.android.lark.http.model.http;

import java.io.Serializable;

public class HttpRequestBody implements Serializable {
    private String mContent;
    private String mMediaType;

    public HttpRequestBody() {
    }

    public String getContent() {
        return this.mContent;
    }

    public String getMediaType() {
        return this.mMediaType;
    }

    public HttpRequestBody(String str, String str2) {
        this.mMediaType = str;
        this.mContent = str2;
    }
}
