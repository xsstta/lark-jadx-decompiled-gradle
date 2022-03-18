package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.net.Uri;
import android.util.SparseArray;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseRequest<T> implements IRequest<T> {
    protected PassportLog log = PassportLog.f123351c.mo171474a();
    protected final HttpHeaders mHeaders = new HttpHeaders();
    protected HttpMethod mHttpMethod = HttpMethod.POST;
    protected final Map<String, String> mQueryParams = new HashMap();
    protected UniContext mUniContext;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        return httpHeaders;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public boolean canLog() {
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public final HttpHeaders getHeaders() {
        return this.mHeaders;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public final HttpMethod getMethod() {
        return this.mHttpMethod;
    }

    public Map<String, String> getQueryParamsMap() {
        return this.mQueryParams;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public UniContext getUniContext() {
        return this.mUniContext;
    }

    /* access modifiers changed from: protected */
    public String getBaseUrl() {
        return C49081e.m193470c();
    }

    /* access modifiers changed from: protected */
    public SparseArray<Class> onResponseDataClass() {
        return new SparseArray<>();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public HttpRequestBody getRequestBody() {
        return new HttpRequestBody("application/json;charset=utf-8", C38760a.m153057a(mRequestBody));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getHttpTag() {
        return "v2_" + getClass().getSimpleName();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getUrl() {
        String str = getBaseUrl() + getPath();
        if (this.mQueryParams.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : this.mQueryParams.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void retryRequest(AbstractC49342a<T> aVar) {
        request2(aVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public synchronized void setUniContext(UniContext uniContext) {
        this.mUniContext = uniContext;
    }
}
