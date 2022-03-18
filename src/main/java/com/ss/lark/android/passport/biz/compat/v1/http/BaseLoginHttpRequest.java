package com.ss.lark.android.passport.biz.compat.v1.http;

import android.text.TextUtils;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.http.p1953b.C38762c;
import com.ss.android.lark.http.p1953b.C38763d;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.base.network.TerminalType;
import com.ss.android.lark.passport.infra.base.p2423a.C49011b;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49196k;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49355c;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import java.util.Map;

public abstract class BaseLoginHttpRequest<T> implements IRequest<T> {
    protected AbstractC49354b mHttpExecutor = ServiceFinder.m193752g().getHttpExecutor();
    protected HttpHeaders mHttpHeaders = new HttpHeaders();
    protected HttpParams mHttpParams = new HttpParams();
    protected UniContext mUniContext;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public boolean canLog() {
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public abstract String getHttpTag();

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return null;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public boolean isCancelable() {
        return false;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void onProcessResponseHeaders(Map<String, String> map) {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public HttpHeaders getHeaders() {
        return this.mHttpHeaders;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public UniContext getUniContext() {
        return this.mUniContext;
    }

    public String getBaseUrl() {
        return C49081e.m193470c();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49355c getResponseFilter() {
        return new ResponseFilter(this);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getUrl() {
        return buildUrl();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getName() {
        return getClass().getSimpleName();
    }

    private String buildUrl() {
        return C38763d.m153061a(getBaseUrl() + getPath(), this.mHttpParams.urlParamsMap);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void request(AbstractC49342a<T> aVar) {
        request2((AbstractC49342a) aVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void retryRequest(AbstractC49342a<T> aVar) {
        request2((AbstractC49342a) aVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public synchronized void setUniContext(UniContext uniContext) {
        this.mUniContext = uniContext;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public C49011b<AbstractC49352d<T>> request2(final AbstractC49342a<T> aVar) {
        if (this.mHttpExecutor == null) {
            this.mHttpExecutor = new C64478a();
        }
        this.mHttpExecutor.mo145177a(this, new AbstractC49352d<T>() {
            /* class com.ss.lark.android.passport.biz.compat.v1.http.BaseLoginHttpRequest.C644761 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                AbstractC49342a aVar = aVar;
                if (aVar != null) {
                    aVar.mo171966a(networkErrorResult);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145179a(T t) {
                AbstractC49342a aVar = aVar;
                if (aVar != null) {
                    aVar.mo171968a((Object) t);
                }
            }
        });
        return null;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        String b = C49081e.m193469b();
        if (!TextUtils.isEmpty(b)) {
            C49196k.m193953a(httpHeaders, "Locale", b);
        }
        String a = C49081e.m193468a();
        if (!TextUtils.isEmpty(a)) {
            C49196k.m193953a(httpHeaders, "X-Request-ID", a);
        } else {
            C49196k.m193953a(httpHeaders, "X-Request-ID", C38762c.m153059a());
        }
        C49196k.m193953a(httpHeaders, "X-Terminal-Type", Integer.toString(TerminalType.ANDROID.getValue()));
        C49196k.m193953a(httpHeaders, "X-Api-Version", "1.0.0");
        C49196k.m193953a(httpHeaders, "Content-Type", "application/json");
        if (!ServiceFinder.m193752g().isPrivateKaPkg()) {
            C49196k.m193953a(httpHeaders, "X-Passport-Unit", C48998a.f123026a.mo171069d());
        }
        return httpHeaders;
    }
}
