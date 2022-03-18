package com.larksuite.framework.http.request;

import java.io.Serializable;

public class RequestBody implements Serializable {
    private byte[] mBytesContent;
    private String mContent;
    private String mMediaType;

    public RequestBody() {
    }

    public byte[] getBytesContent() {
        return this.mBytesContent;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getMediaType() {
        return this.mMediaType;
    }

    public RequestBody(String str, String str2) {
        this.mMediaType = str;
        this.mContent = str2;
    }

    public static RequestBody create(String str, String str2) {
        return new RequestBody(str, str2);
    }

    public RequestBody(String str, byte[] bArr) {
        this.mMediaType = str;
        this.mBytesContent = bArr;
    }

    public static RequestBody create(String str, byte[] bArr) {
        return new RequestBody(str, bArr);
    }
}
