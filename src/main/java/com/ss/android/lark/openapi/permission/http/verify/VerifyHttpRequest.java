package com.ss.android.lark.openapi.permission.http.verify;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.okhttp.AbstractC38775a;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.openapi.permission.http.AbstractHttpRequest;
import com.ss.android.lark.openapi.permission.http.C48769a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VerifyHttpRequest extends AbstractHttpRequest<VerifyResponse> {
    private String mBaseUrl;
    private C48772b mRequestModel;
    private String mSession;

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public String getHttpTag() {
        return "RequestPermission";
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public String getPath() {
        return "mina/jssdk/verify";
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public String getBaseUrl() {
        return this.mBaseUrl;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public AbstractC38759a<VerifyResponse> getObjectConverter() {
        return new C48771a();
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public AbstractC38775a getResponseFilter() {
        return new C48769a();
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpRequestBody getRequestBody() {
        JSONObject jSONObject = new JSONObject();
        try {
            C48772b bVar = this.mRequestModel;
            if (bVar != null) {
                if (!TextUtils.isEmpty(bVar.mo170349a())) {
                    jSONObject.put("app_id", this.mRequestModel.mo170349a());
                }
                if (!TextUtils.isEmpty(this.mRequestModel.mo170350b())) {
                    jSONObject.put("timestamp", this.mRequestModel.mo170350b());
                }
                if (!TextUtils.isEmpty(this.mRequestModel.mo170351c())) {
                    jSONObject.put("nonce_str", this.mRequestModel.mo170351c());
                }
                if (!TextUtils.isEmpty(this.mRequestModel.mo170354f())) {
                    jSONObject.put("url", this.mRequestModel.mo170354f());
                }
                if (!TextUtils.isEmpty(this.mRequestModel.mo170352d())) {
                    jSONObject.put("signature", this.mRequestModel.mo170352d());
                }
                List<String> g = this.mRequestModel.mo170355g();
                if (g != null && g.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : g) {
                        jSONArray.put(str);
                    }
                    jSONObject.put("js_api_list", jSONArray);
                }
            }
        } catch (JSONException e) {
            Log.w("VerifyHttpRequest", "getRequestBody", e);
        }
        return new HttpRequestBody("application/json;charset=utf-8", jSONObject.toString());
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest, com.ss.android.lark.http.base.BaseRequest
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        HttpHeaders buildHeaders = super.buildHeaders(httpHeaders);
        buildHeaders.put("X-Session-ID", this.mSession);
        return buildHeaders;
    }

    public VerifyHttpRequest(String str, String str2, C48772b bVar) {
        this.mBaseUrl = str;
        this.mSession = str2;
        this.mRequestModel = bVar;
    }
}
