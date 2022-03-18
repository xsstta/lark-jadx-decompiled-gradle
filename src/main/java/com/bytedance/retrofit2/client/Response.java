package com.bytedance.retrofit2.client;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Response {
    private final TypedInput body;
    private Object extraInfo;
    private final List<Header> headers;
    private final String reason;
    private final int status;
    private final String url;

    public TypedInput getBody() {
        return this.body;
    }

    public Object getExtraInfo() {
        return this.extraInfo;
    }

    public List<Header> getHeaders() {
        return this.headers;
    }

    public String getReason() {
        return this.reason;
    }

    public int getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isSuccessful() {
        int i = this.status;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    public void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public Header getFirstHeader(String str) {
        List<Header> list;
        if (!(str == null || (list = this.headers) == null)) {
            for (Header header : list) {
                if (str.equalsIgnoreCase(header.getName())) {
                    return header;
                }
            }
        }
        return null;
    }

    public List<Header> headers(String str) {
        List<Header> list;
        ArrayList arrayList = null;
        if (!(str == null || (list = this.headers) == null)) {
            for (Header header : list) {
                if (str.equalsIgnoreCase(header.getName())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(header);
                }
            }
        }
        return arrayList;
    }

    public Response(String str, int i, String str2, List<Header> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i < 200) {
            throw new IllegalArgumentException("Invalid status code: " + i);
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list != null) {
            this.url = str;
            this.status = i;
            this.reason = str2;
            this.headers = Collections.unmodifiableList(new ArrayList(list));
            this.body = typedInput;
        } else {
            throw new IllegalArgumentException("headers == null");
        }
    }
}
