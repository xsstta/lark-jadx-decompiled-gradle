package com.bytedance.ee.webapp.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.webapp.api.bean.AuthCodeInfo;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Map;

public class LarkApiRequestAuthCodePlugin extends OPBaseNetApiPlugin {
    protected AbstractC25897h mCallback;
    private String mParamAppId;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public Map<String, String> addHeaders() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public String getPath() {
        return "/open-platform/api/LoginH5";
    }

    private static class RequestAuthPluginRequest extends C25920a {
        @JSONField(name = "appId")
        public String mAppId;

        private RequestAuthPluginRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class RequestAuthPluginResponse extends C25921b {
        @JSONField(name = "code")
        public String code;

        private RequestAuthPluginResponse() {
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public String getHost() {
        return LarkExtensionManager.getInstance().getExtension().mo49585a(DomainSettings.Alias.OPEN);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public String buildRequestBody() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (Object) this.mParamAppId);
        jSONObject.put("sessionid", (Object) LarkExtensionManager.getInstance().getExtension().mo49565b());
        if (getAppContext() instanceof C67462h) {
            jSONObject.put("url", (Object) ((String) Observable.create(new ObservableOnSubscribe() {
                /* class com.bytedance.ee.webapp.api.$$Lambda$LarkApiRequestAuthCodePlugin$7qvzIG_UFTxq2IkbiV84e29GHhE */

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    LarkApiRequestAuthCodePlugin.this.lambda$buildRequestBody$0$LarkApiRequestAuthCodePlugin(observableEmitter);
                }
            }).subscribeOn(AndroidSchedulers.mainThread()).blockingFirst()));
        }
        return jSONObject.toString();
    }

    public /* synthetic */ void lambda$buildRequestBody$0$LarkApiRequestAuthCodePlugin(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(((C67462h) getAppContext()).mo234201a());
    }

    @Override // com.bytedance.ee.webapp.api.AbstractC13761a
    public void onError(ErrorResult errorResult) {
        AbstractC25897h hVar = this.mCallback;
        if (hVar != null) {
            hVar.callback(createErrorResponse(errorResult));
        } else {
            Log.m165389i("LarkApiRequestAuthCodePlugin", "onError but mCallback is null");
        }
    }

    @Override // com.bytedance.ee.webapp.api.AbstractC13761a
    public void onSuccess(SendHttpResponse sendHttpResponse) {
        AbstractC25897h hVar = this.mCallback;
        if (hVar != null) {
            hVar.callback(createCallbackResponse(sendHttpResponse));
        } else {
            Log.m165389i("LarkApiRequestAuthCodePlugin", "onSuccess but mCallback is null");
        }
    }

    private RequestAuthPluginResponse createErrorResponse(ErrorResult errorResult) {
        Log.m165383e("LarkApiRequestAuthCodePlugin", "requestAuthCode network error " + errorResult);
        RequestAuthPluginResponse requestAuthPluginResponse = new RequestAuthPluginResponse();
        requestAuthPluginResponse.mErrorCode = C25906a.f64079i.f64115H;
        requestAuthPluginResponse.mErrorMessage = errorResult.getDisplayMsg();
        return requestAuthPluginResponse;
    }

    private RequestAuthPluginResponse createCallbackResponse(SendHttpResponse sendHttpResponse) {
        AuthCodeInfo authCodeInfo;
        String str;
        try {
            authCodeInfo = (AuthCodeInfo) JSON.parseObject(sendHttpResponse.json_body, AuthCodeInfo.class);
        } catch (JSONException e) {
            Log.m165384e("LarkApiRequestAuthCodePlugin", "parse object error , ", e);
            authCodeInfo = null;
        }
        if (!isRequestSucceeded(sendHttpResponse)) {
            Log.m165389i("LarkApiRequestAuthCodePlugin", "SendHttpResponse " + sendHttpResponse.http_status_code);
            if (authCodeInfo == null) {
                str = "";
            } else {
                str = authCodeInfo.message;
            }
            return createErrorResponse(C25906a.f64079i, str);
        } else if (authCodeInfo == null) {
            Log.m165389i("LarkApiRequestAuthCodePlugin", "response is empty");
            return createErrorResponse(C25906a.f64079i, "response is null");
        } else {
            RequestAuthPluginResponse requestAuthPluginResponse = new RequestAuthPluginResponse();
            if (authCodeInfo.businessCode != 0) {
                Log.m165389i("LarkApiRequestAuthCodePlugin", "requestAuthCode error , code = " + authCodeInfo.businessCode + " , errMsg = " + authCodeInfo.message);
                requestAuthPluginResponse.mErrorMessage = authCodeInfo.message;
                requestAuthPluginResponse.mErrorCode = authCodeInfo.businessCode;
                return requestAuthPluginResponse;
            } else if (authCodeInfo.data == null) {
                Log.m165389i("LarkApiRequestAuthCodePlugin", "requestAuthCode data is null");
                return createErrorResponse(C25906a.f64079i, "data is null");
            } else {
                Log.m165389i("LarkApiRequestAuthCodePlugin", "requestAuthCode succeeded");
                requestAuthPluginResponse.code = authCodeInfo.data.preAuthorizationCode;
                return requestAuthPluginResponse;
            }
        }
    }

    private RequestAuthPluginResponse createErrorResponse(C25908c cVar, String str) {
        RequestAuthPluginResponse requestAuthPluginResponse = new RequestAuthPluginResponse();
        requestAuthPluginResponse.mErrorCode = cVar.f64115H;
        requestAuthPluginResponse.mErrorMessage = str;
        return requestAuthPluginResponse;
    }

    @LKPluginFunction(async = true, eventName = {"requestAuthCode"})
    public void RequestAuthPluginAsync(LKEvent lKEvent, RequestAuthPluginRequest requestAuthPluginRequest, AbstractC25897h<RequestAuthPluginResponse> hVar) {
        this.mParamAppId = requestAuthPluginRequest.mAppId;
        this.mCallback = hVar;
        Log.m165389i("LarkApiRequestAuthCodePlugin", "requestAuthCode appId = " + this.mParamAppId);
        doHttpRequest();
    }
}
