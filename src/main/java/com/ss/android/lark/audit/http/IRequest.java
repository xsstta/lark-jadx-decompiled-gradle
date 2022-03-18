package com.ss.android.lark.audit.http;

import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import java.io.Serializable;
import java.util.Map;

public interface IRequest<T> extends Serializable {
    HttpHeaders buildHeaders(HttpHeaders httpHeaders);

    HttpHeaders getHeaders();

    HttpMethod getMethod();

    HttpRequestBody getRequestBody();

    byte[] getRequestBytes();

    String getUrl();

    void onProcessResponseHeaders(Map<String, String> map);

    void request(AbstractC29334c cVar);
}
