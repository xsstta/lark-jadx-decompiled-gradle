package com.tt.frontendapiinterface;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.tt.miniapp.errorcode.ApiCode;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class ApiCallbackHandler extends AbstractC25937e {
    public abstract void callbackFail(int i, String str, JSONObject jSONObject);

    public abstract void callbackFail(String str, JSONObject jSONObject);

    public abstract void callbackFail(String str, JSONObject jSONObject, Throwable th);

    /* access modifiers changed from: protected */
    public abstract void callbackMsg(boolean z, HashMap<String, Object> hashMap, String str);

    public abstract void callbackOk(String str, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void doApiHandlerCallback(ApiCallResult apiCallResult);

    public final void callbackAppUnSupportFeature() {
        callbackFail("feature is not supported in app");
    }

    public final void callbackOk() {
        callbackOk(null, null);
    }

    public void callbackDefaultMsg(boolean z) {
        callbackMsg(z, null, null);
    }

    public final void callbackIllegalParam(String str) {
        callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo(str));
    }

    public final void callbackFail(ApiCode apiCode) {
        callbackFail(apiCode.code, apiCode.msg, (JSONObject) null);
    }

    public final void callbackOk(String str) {
        callbackOk(str, null);
    }

    public final void callbackFail(String str) {
        callbackFail(str, (JSONObject) null);
    }

    public final void callbackOk(HashMap<String, Object> hashMap) {
        callbackOk(null, ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    public final void callbackOk(JSONObject jSONObject) {
        callbackOk(null, jSONObject);
    }

    public final void callbackFail(Throwable th) {
        AppBrandLogger.m52828d("ApiCallbackHandler", "callbackFail", th);
        callbackFail(ApiCallResultHelper.generateThrowableExtraInfo(th), (JSONObject) null);
    }

    public void callbackExtraInfoMsg(boolean z, String str) {
        callbackMsg(z, null, str);
    }

    public final void callbackFail(ApiCode apiCode, String str) {
        callbackFail(apiCode.code, str, (JSONObject) null);
    }

    public void callbackOtherExtraMsg(boolean z, HashMap<String, Object> hashMap) {
        callbackMsg(z, hashMap, null);
    }

    public static String buildErrorMsg(String str, String str2) {
        return str + ":" + str2;
    }
}
