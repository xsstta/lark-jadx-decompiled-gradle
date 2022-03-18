package com.ss.android.lark.passport.signinsdk_api.base.http;

import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public interface IRequest<T> extends Serializable {
    public static final Map<String, Object> mRequestBody = new HashMap();

    HttpHeaders buildHeaders(HttpHeaders httpHeaders);

    boolean canLog();

    HttpHeaders getHeaders();

    String getHttpTag();

    HttpMethod getMethod();

    AbstractC49348a getMonitorCodeCreator();

    String getName();

    AbstractC38759a<T> getObjectConverter();

    String getPath();

    HttpRequestBody getRequestBody();

    AbstractC49355c getResponseFilter();

    UniContext getUniContext();

    String getUrl();

    boolean isCancelable();

    void onProcessResponseHeaders(Map<String, String> map);

    void request(AbstractC49342a<T> aVar);

    AbstractC49347c request2(AbstractC49342a<T> aVar);

    void retryRequest(AbstractC49342a<T> aVar);

    void setUniContext(UniContext uniContext);
}
