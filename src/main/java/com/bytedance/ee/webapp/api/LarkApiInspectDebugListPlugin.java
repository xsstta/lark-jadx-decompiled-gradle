package com.bytedance.ee.webapp.api;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.webapp.api.bean.InspectedAppListInfo;
import com.bytedance.ee.webapp.api.bean.InspectedDebugInfo;
import com.bytedance.ee.webapp.utils.IWebAppHostService;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.debug.InspectDebugHelper;
import com.tt.miniapphost.util.ProcessUtil;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011H\u0016J6\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/webapp/api/LarkApiInspectDebugListPlugin;", "Lcom/bytedance/ee/webapp/api/OPBaseNetApiPlugin;", "()V", "PARAMS_USER_ID", "", "REQUEST_PATH", "TAG", "callback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/bytedance/ee/webapp/api/InspectDebugPluginResponse;", "logger", "Lcom/ss/android/lark/optrace/api/ILogger;", "addHeaders", "", "buildRequestBody", "createCallbackResponse", "httpResponse", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "createErrorResponse", "apiErrorCode", "Lcom/larksuite/framework/apiplugin/enums/ApiErrCode;", ApiHandler.API_CALLBACK_ERRMSG, "getHost", "getPath", "getRequestMethodType", "Lcom/bytedance/lark/pb/basic/v1/SendHttpRequest$Method;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "requestInspectDebugPluginAsync", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "request", "Lcom/bytedance/ee/webapp/api/InspectDebugPluginRequest;", "iLogger", "lkCallback", "tryOpenInspectMode", "debugInfo", "Lcom/bytedance/ee/webapp/api/bean/InspectedDebugInfo;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LarkApiInspectDebugListPlugin extends OPBaseNetApiPlugin {
    private final String PARAMS_USER_ID = "userID";
    private final String REQUEST_PATH = "/oapi/app_interface/api/debug_apps";
    private final String TAG = "LarkApiInspectDebugListPlugin";
    private AbstractC25897h<InspectDebugPluginResponse> callback;
    private ILogger logger;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public Map<String, String> addHeaders() {
        return null;
    }

    @Override // com.bytedance.ee.webapp.api.AbstractC13761a
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public String getPath() {
        return this.REQUEST_PATH;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public SendHttpRequest.Method getRequestMethodType() {
        return SendHttpRequest.Method.GET;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public String getHost() {
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        String a = instance.getExtension().mo49585a(DomainSettings.Alias.INTERNAL_API);
        Intrinsics.checkExpressionValueIsNotNull(a, "LarkExtensionManager.get…namicDomain(INTERNAL_API)");
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.api.OPBaseNetApiPlugin
    public String buildRequestBody() {
        JSONObject jSONObject = new JSONObject();
        String str = this.PARAMS_USER_ID;
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        ExtensionWrapper extension = instance.getExtension();
        Intrinsics.checkExpressionValueIsNotNull(extension, "LarkExtensionManager.getInstance().extension");
        jSONObject.put(str, (Object) extension.mo49565b());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "JSONObject().apply {\n   …ion)\n        }.toString()");
        return jSONObject2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/webapp/api/LarkApiInspectDebugListPlugin$tryOpenInspectMode$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.api.LarkApiInspectDebugListPlugin$a */
    public static final class RunnableC13758a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f35984a;

        /* renamed from: b */
        final /* synthetic */ InspectedDebugInfo f35985b;

        RunnableC13758a(Activity activity, InspectedDebugInfo inspectedDebugInfo) {
            this.f35984a = activity;
            this.f35985b = inspectedDebugInfo;
        }

        public final void run() {
            ArrayList<String> appIDList;
            ArrayList<String> arrayList = null;
            if (ProcessUtil.isMainProcess(this.f35984a)) {
                InspectDebugHelper bVar = InspectDebugHelper.f166565a;
                InspectedAppListInfo data = this.f35985b.getData();
                if (data != null) {
                    arrayList = data.getAppIDList();
                }
                bVar.mo230981a(arrayList);
                InspectDebugHelper.f166565a.mo230984b();
            } else {
                IWebAppHostService iWebAppHostService = (IWebAppHostService) C68183b.m264839a().mo237086a(this.f35984a, IWebAppHostService.class);
                if (iWebAppHostService != null) {
                    InspectedAppListInfo data2 = this.f35985b.getData();
                    if (data2 != null) {
                        arrayList = data2.getAppIDList();
                    }
                    iWebAppHostService.setInspectDebugList(arrayList);
                }
                IWebAppHostService iWebAppHostService2 = (IWebAppHostService) C68183b.m264839a().mo237086a(this.f35984a, IWebAppHostService.class);
                if (iWebAppHostService2 != null) {
                    iWebAppHostService2.tryKillAllBrandProcess();
                }
            }
            InspectedAppListInfo data3 = this.f35985b.getData();
            if (data3 != null && (appIDList = data3.getAppIDList()) != null && (!appIDList.isEmpty())) {
                InspectDebugHelper.f166565a.mo230980a(this.f35984a);
            }
        }
    }

    @Override // com.bytedance.ee.webapp.api.AbstractC13761a
    public void onSuccess(SendHttpResponse sendHttpResponse) {
        AbstractC25897h<InspectDebugPluginResponse> hVar = this.callback;
        if (hVar != null) {
            hVar.callback(createCallbackResponse(sendHttpResponse));
        }
    }

    private final void tryOpenInspectMode(InspectedDebugInfo inspectedDebugInfo) {
        Activity currentActivity;
        IAppContext appContext = getAppContext();
        if (appContext == null || (currentActivity = appContext.getCurrentActivity()) == null) {
            LarkApiInspectDebugListPlugin larkApiInspectDebugListPlugin = this;
            ILogger aVar = larkApiInspectDebugListPlugin.logger;
            if (aVar != null) {
                aVar.mo92223e(larkApiInspectDebugListPlugin.TAG, "appContext?.currentActivity is null");
                return;
            }
            return;
        }
        currentActivity.runOnUiThread(new RunnableC13758a(currentActivity, inspectedDebugInfo));
    }

    private final InspectDebugPluginResponse createCallbackResponse(SendHttpResponse sendHttpResponse) {
        ArrayList<String> appIDList;
        String arrayList;
        if (sendHttpResponse == null) {
            C25906a aVar = C25906a.f64079i;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "ApiCommonErrCode.GENERAL_NETWORK_ERROR");
            return createErrorResponse(aVar, "httpResponse is null");
        }
        InspectedDebugInfo inspectedDebugInfo = null;
        try {
            inspectedDebugInfo = (InspectedDebugInfo) JSON.parseObject(sendHttpResponse.json_body, InspectedDebugInfo.class);
        } catch (JSONException e) {
            ILogger aVar2 = this.logger;
            if (aVar2 != null) {
                aVar2.mo92223e(this.TAG, "parse object error , ", e);
            }
        }
        String str = "";
        if (!isRequestSucceeded(sendHttpResponse)) {
            ILogger aVar3 = this.logger;
            if (aVar3 != null) {
                aVar3.mo92224i(this.TAG, "SendHttpResponse " + sendHttpResponse.http_status_code);
            }
            if (inspectedDebugInfo != null) {
                str = inspectedDebugInfo.getMessage();
            }
            C25906a aVar4 = C25906a.f64079i;
            Intrinsics.checkExpressionValueIsNotNull(aVar4, "ApiCommonErrCode.GENERAL_NETWORK_ERROR");
            return createErrorResponse(aVar4, str);
        } else if (inspectedDebugInfo == null) {
            ILogger aVar5 = this.logger;
            if (aVar5 != null) {
                aVar5.mo92224i(this.TAG, "response is empty");
            }
            C25906a aVar6 = C25906a.f64079i;
            Intrinsics.checkExpressionValueIsNotNull(aVar6, "ApiCommonErrCode.GENERAL_NETWORK_ERROR");
            return createErrorResponse(aVar6, "response is null");
        } else {
            InspectDebugPluginResponse inspectDebugPluginResponse = new InspectDebugPluginResponse();
            if (inspectedDebugInfo.getBusinessCode() != 0) {
                ILogger aVar7 = this.logger;
                if (aVar7 != null) {
                    aVar7.mo92224i(this.TAG, "error--code = " + inspectedDebugInfo.getBusinessCode() + " , errMsg = " + inspectedDebugInfo.getMessage());
                }
                inspectDebugPluginResponse.mErrorMessage = inspectedDebugInfo.getMessage();
                inspectDebugPluginResponse.mErrorCode = inspectedDebugInfo.getBusinessCode();
                return inspectDebugPluginResponse;
            } else if (inspectedDebugInfo.getData() == null) {
                ILogger aVar8 = this.logger;
                if (aVar8 != null) {
                    aVar8.mo92224i(this.TAG, "inspectedDebugList data is null");
                }
                C25906a aVar9 = C25906a.f64079i;
                Intrinsics.checkExpressionValueIsNotNull(aVar9, "ApiCommonErrCode.GENERAL_NETWORK_ERROR");
                return createErrorResponse(aVar9, "data is null");
            } else {
                ILogger aVar10 = this.logger;
                if (aVar10 != null) {
                    aVar10.mo92224i(this.TAG, "inspectedDebugList succeeded");
                }
                tryOpenInspectMode(inspectedDebugInfo);
                InspectedAppListInfo data = inspectedDebugInfo.getData();
                if (!(data == null || (appIDList = data.getAppIDList()) == null || (arrayList = appIDList.toString()) == null)) {
                    str = arrayList;
                }
                inspectDebugPluginResponse.setAppList(str);
                return inspectDebugPluginResponse;
            }
        }
    }

    private final InspectDebugPluginResponse createErrorResponse(C25908c cVar, String str) {
        InspectDebugPluginResponse inspectDebugPluginResponse = new InspectDebugPluginResponse();
        inspectDebugPluginResponse.mErrorCode = cVar.f64115H;
        if (str == null) {
            str = "";
        }
        inspectDebugPluginResponse.mErrorMessage = str;
        return inspectDebugPluginResponse;
    }

    @LKPluginFunction(async = true, eventName = {"getInspectDebugList"})
    public final void requestInspectDebugPluginAsync(LKEvent lKEvent, InspectDebugPluginRequest inspectDebugPluginRequest, ILogger aVar, AbstractC25897h<InspectDebugPluginResponse> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "lkCallback");
        this.logger = aVar;
        this.callback = hVar;
        if (aVar != null) {
            aVar.mo92224i(this.TAG, "requestInspectDebugPluginAsync----called");
        }
        doHttpRequest();
    }
}
