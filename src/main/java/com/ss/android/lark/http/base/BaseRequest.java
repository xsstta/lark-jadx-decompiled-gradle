package com.ss.android.lark.http.base;

import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import java.io.Serializable;

public abstract class BaseRequest<T> implements Serializable {
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        return httpHeaders;
    }

    public HttpParams buildParams(HttpParams httpParams) {
        return httpParams;
    }

    public abstract HttpHeaders getHeaders();

    public abstract HttpParams getHttpParams();

    public abstract AbstractC38759a<T> getObjectConverter();

    public abstract String getPath();

    public abstract HttpRequestBody getRequestBody();

    public abstract String getUrl();

    public abstract void request(AbstractC38765a<T> aVar);

    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}
