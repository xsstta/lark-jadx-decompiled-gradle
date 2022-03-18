package com.tt.option.ext;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.C67587d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.option.ext.l */
public abstract class AbstractC67628l implements WebEventCallback {
    public IAppContext iAppContext;
    public String mArgs;
    public int mCallBackId;
    public IBaseRender mIBaseRender;

    public abstract String act();

    public boolean canOverride() {
        return true;
    }

    public abstract String getApiName();

    public void callbackAppUnSupportFeature() {
        callbackFail("feature is not supported in app");
    }

    public void callbackOk() {
        invokeHandler(makeOkMsg());
    }

    public String makeOkMsg() {
        return ApiCallResult.Builder.createOk(getApiName()).build().toString();
    }

    public void setAppContext(IAppContext iAppContext2) {
        this.iAppContext = iAppContext2;
    }

    public void callbackFail(String str) {
        invokeHandler(makeFailMsg(str));
    }

    public void callbackAppUnSupportFeature(int i) {
        callbackFail(i, "feature is not supported in app");
    }

    public void callbackFail(Throwable th) {
        invokeHandler(makeFailMsg(th));
    }

    public void callbackOk(JSONObject jSONObject) {
        invokeHandler(makeOkMsg(jSONObject));
    }

    @Override // com.tt.option.ext.WebEventCallback
    public void invokeHandler(String str) {
        if (this.mIBaseRender != null) {
            C67432a.m262319a(this.iAppContext).invokeHandler(this.mIBaseRender.getRenderViewId(), this.mCallBackId, str);
        }
    }

    public String makeFailMsg(String str) {
        return ApiCallResult.Builder.createFail(getApiName()).extraInfo(str).build().toString();
    }

    @Override // com.tt.option.ext.WebEventCallback
    public JSONObject buildErrorMsg(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getApiName(), str));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String makeFailMsg(Throwable th) {
        return ApiCallResult.Builder.createFail(getApiName()).extraInfo(th).build().toString();
    }

    public String makeOkMsg(JSONObject jSONObject) {
        return ApiCallResult.Builder.createOk(getApiName()).responseData(jSONObject).build().toString();
    }

    public String makeFailMsg(JSONObject jSONObject) {
        return ApiCallResult.Builder.createFail(getApiName()).responseData(jSONObject).build().toString();
    }

    public String buildErrorMsg(String str, String str2) {
        return str + ":" + str2;
    }

    public void callbackFail(int i, String str) {
        invokeHandler(makeFailMsg(new C67587d().mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new C67587d().mo234783a("errCode", Integer.valueOf(i)).mo234783a(ApiHandler.API_CALLBACK_ERRMSG, str).mo234784a()).mo234784a()));
    }

    public AbstractC67628l(IBaseRender iBaseRender, String str, int i) {
        this.mArgs = str;
        this.mCallBackId = i;
        this.mIBaseRender = iBaseRender;
    }

    public String makeMsg(boolean z, JSONObject jSONObject, String str, Throwable th) {
        if (z) {
            ApiCallResult.Builder createOk = ApiCallResult.Builder.createOk(getApiName());
            if (!TextUtils.isEmpty(str)) {
                createOk.extraInfo(str);
            } else if (th != null) {
                createOk.extraInfo(th);
            }
            createOk.responseData(jSONObject);
            return createOk.build().toString();
        }
        ApiCallResult.Builder createFail = ApiCallResult.Builder.createFail(getApiName());
        if (!TextUtils.isEmpty(str)) {
            createFail.extraInfo(str);
        } else if (th != null) {
            createFail.extraInfo(th);
        }
        createFail.responseData(jSONObject);
        return createFail.build().toString();
    }
}
