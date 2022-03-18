package com.larksuite.framework.http.response;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Map;

public class BaseResponse implements Serializable {
    private static final long serialVersionUID = 6799379234808041243L;
    private int code;
    private Map<String, String> headers;
    private AbstractC26013a mResponseBody;

    /* renamed from: com.larksuite.framework.http.response.BaseResponse$a */
    public interface AbstractC26013a {
        /* renamed from: a */
        String mo92409a() throws IOException;

        /* renamed from: b */
        InputStream mo92410b();

        /* renamed from: c */
        byte[] mo92411c() throws IOException;
    }

    public BaseResponse() {
    }

    public AbstractC26013a body() {
        return this.mResponseBody;
    }

    public int code() {
        return this.code;
    }

    public Map<String, String> headers() {
        return this.headers;
    }

    public InputStream byteStream() {
        return this.mResponseBody.mo92410b();
    }

    public String message() throws IOException {
        return this.mResponseBody.mo92409a();
    }

    public boolean isSuccessful() {
        int i = this.code;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    public BaseResponse(int i, AbstractC26013a aVar) {
        this.code = i;
        this.mResponseBody = aVar;
    }

    public BaseResponse(int i, Map<String, String> map, AbstractC26013a aVar) {
        this.code = i;
        this.headers = map;
        this.mResponseBody = aVar;
    }
}
