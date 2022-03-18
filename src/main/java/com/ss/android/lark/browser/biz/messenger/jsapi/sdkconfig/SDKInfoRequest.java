package com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.okhttp.AbstractC38775a;
import com.ss.android.lark.http.okhttp.BaseOkHttpRequest;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.log.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class SDKInfoRequest extends BaseOkHttpRequest<SDKInfoResponse> {
    private C29860a mSDKInfoParams;

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public String getHttpTag() {
        return "SDKInfoRequest";
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public String getPath() {
        return "/config/get";
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpRequestBody getRequestBody() {
        return null;
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public AbstractC38775a getResponseFilter() {
        return null;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public AbstractC38759a<SDKInfoResponse> getObjectConverter() {
        return new AbstractC38759a<SDKInfoResponse>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig.SDKInfoRequest.C298591 */

            /* renamed from: a */
            public SDKInfoResponse mo107503b(String str) {
                return (SDKInfoResponse) super.mo107503b(str);
            }
        };
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public String getBaseUrl() {
        return "https://" + C29638a.m109622a().getManisDependency().mo107691a(DomainSettings.Alias.MP_CONFIG);
    }

    public SDKInfoRequest(C29860a aVar) {
        this.mSDKInfoParams = aVar;
        HttpParams httpParams = super.getHttpParams();
        httpParams.put("appId", 27, new boolean[0]);
        httpParams.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, 1, new boolean[0]);
        C29860a aVar2 = this.mSDKInfoParams;
        if (aVar2 != null) {
            httpParams.put("userId", aVar2.mo107508a(), new boolean[0]);
            httpParams.put("tenantId", this.mSDKInfoParams.mo107510b(), new boolean[0]);
            httpParams.put("deviceId", this.mSDKInfoParams.mo107518f(), new boolean[0]);
            httpParams.put("larkVersion", this.mSDKInfoParams.mo107516e(), new boolean[0]);
            httpParams.put("platform", this.mSDKInfoParams.mo107512c(), new boolean[0]);
            httpParams.put("platformVersion", this.mSDKInfoParams.mo107514d(), new boolean[0]);
            try {
                httpParams.put("url", URLEncoder.encode(this.mSDKInfoParams.mo107520g(), "utf-8"), new boolean[0]);
                httpParams.put("params", URLEncoder.encode(this.mSDKInfoParams.mo107522h(), "utf-8"), new boolean[0]);
            } catch (UnsupportedEncodingException e) {
                Log.m165383e("SDKInfoRequest", "encode error! " + e.getMessage());
                e.printStackTrace();
            } catch (NullPointerException e2) {
                Log.m165383e("SDKInfoRequest", "encode error! " + e2.getMessage());
                e2.printStackTrace();
            }
        }
    }
}
