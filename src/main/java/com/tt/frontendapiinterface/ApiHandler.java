package com.tt.frontendapiinterface;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.core.utils.ApiMonitorUtil;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.extra.ICrossProcessOperator;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ApiHandler extends ApiCallbackHandler implements ICrossProcessOperator {
    public static final String API_CALLBACK_ERRMSG = "errMsg";
    public static final String API_CALLBACK_ERRSTACK = "errStack";
    public static final String API_CALLBACK_EXCEPTION = "exception";
    public AbstractC67619e mApiHandlerCallback;
    private IAppContext mAppContext;
    public String mArgs;
    public int mCallBackId;

    /* access modifiers changed from: protected */
    public abstract void act();

    public boolean canOverride() {
        return true;
    }

    public abstract String getActionName();

    /* access modifiers changed from: protected */
    public String[] getNeededPermissions() {
        return null;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public final boolean isSwitchProcessOperateAsync() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onApiHandlerCallback() {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    @Override // com.tt.miniapphost.process.extra.ICrossProcessOperator
    public String operateProcessIdentify() {
        return "miniAppProcess";
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return false;
    }

    public ApiHandler() {
    }

    public IAppContext getAppContext() {
        return this.mAppContext;
    }

    public AbstractC67709b.AbstractC67710a getApiDependency() {
        return (AbstractC67709b.AbstractC67710a) getApiService().mo235130i();
    }

    /* access modifiers changed from: protected */
    public AbstractC67709b getApiService() {
        return (AbstractC67709b) getAppContext().findServiceByInterface(AbstractC67709b.class);
    }

    public void unRegesterResultHandler() {
        ApiHandlerManager.getInst(this.mAppContext).unregisterActivityResultApiHandler(this);
        this.mAppContext.unRegisterOnResultPlugin(this);
    }

    public final void doAct() {
        if (shouldHandleActivityResult()) {
            ApiHandlerManager.getInst(this.mAppContext).registerActivityResultApiHandler(this);
        }
        try {
            act();
        } catch (Throwable th) {
            DebugUtil.logOrThrow("ApiHandler", "ApiHandler act", th);
            callbackFail(th);
        }
    }

    public void doCallbackByApiHandler(String str) {
        apiHandlerCallback(str);
    }

    public void setAppContext(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a(getActionName());
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiCallbackHandler
    public void doApiHandlerCallback(ApiCallResult apiCallResult) {
        apiHandlerCallback(apiCallResult.toString());
    }

    private void apiHandlerCallback(String str) {
        AbstractC67619e eVar = this.mApiHandlerCallback;
        if (eVar != null) {
            eVar.callback(this.mCallBackId, str);
        }
        onApiHandlerCallback();
    }

    public void callbackException(Throwable th) {
        doCallbackByApiHandler(makeMsgByResult(false, null, API_CALLBACK_EXCEPTION, th).toString());
    }

    public final void callbackOnOriginProcess(String str) {
        if (str == null) {
            callbackFail("get empty remote process result");
        } else {
            apiHandlerCallback(str);
        }
    }

    /* access modifiers changed from: protected */
    public String paramIllegalMsg(String str) {
        return "param:" + str + " illegal";
    }

    public void pluginDoAct(final LKEvent lKEvent) {
        this.mApiHandlerCallback = new AbstractC67619e() {
            /* class com.tt.frontendapiinterface.ApiHandler.C656832 */

            @Override // com.tt.option.ext.AbstractC67619e
            public void callback(int i, String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int a = C25529d.m91127a(jSONObject, "errCode", 0);
                    if (a == 0) {
                        if (!str.contains("fail")) {
                            lKEvent.mo92127a(jSONObject);
                            return;
                        }
                    }
                    lKEvent.mo92116a(a, jSONObject);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("ApiHandler", "JSONException", e);
                }
            }
        };
        if (lKEvent.mo92147n() != null) {
            this.mArgs = lKEvent.mo92147n().toString();
        }
        this.mCallBackId = lKEvent.mo92144k();
        doAct();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(final LKEvent lKEvent) {
        Object obj;
        String m = lKEvent.mo92146m();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("eventName:");
        sb.append(m);
        sb.append(" paramsLength:");
        if (lKEvent.mo92147n() != null) {
            obj = Integer.valueOf(lKEvent.mo92147n().length());
        } else {
            obj = "";
        }
        sb.append(obj);
        sb.append(" env:");
        sb.append(lKEvent.mo92141h());
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("ApiHandler", objArr);
        AbstractC25891b r = lKEvent.mo92151r();
        if (r instanceof AbstractC24361a) {
            setAppContext(((AbstractC24361a) r).mo87113d());
        } else {
            AppBrandLogger.m52829e("ApiHandler", "core node is not Container, so have not appContext");
            if (lKEvent.mo92138e() instanceof IAppContext) {
                this.mAppContext = (IAppContext) lKEvent.mo92138e();
                AppBrandLogger.m52830i("ApiHandler", "get find ServiceContext");
            } else if (!ProcessUtil.isMainProcess(lKEvent.mo92145l())) {
                C48936b.m192783a("core node is not Container, so have not appContext");
            }
        }
        if (!getActionName().equals(m)) {
            return lKEvent.mo92155v();
        }
        AbstractC25890a i = lKEvent.mo92142i();
        if (i != null) {
            i.executeAsyncApiHandle(m, new Runnable() {
                /* class com.tt.frontendapiinterface.ApiHandler.RunnableC656821 */

                public void run() {
                    OPMonitorUtils.monitorNativeStart(ApiHandler.this.getAppContext(), lKEvent, true);
                    AppBrandLogger.m52830i("ApiHandler", "async handle");
                    long currentTimeMillis = System.currentTimeMillis();
                    ApiHandler.this.pluginDoAct(lKEvent);
                    ApiMonitorUtil.m91099a(ApiMonitorUtil.m91097a(lKEvent), currentTimeMillis);
                }
            });
        } else {
            OPMonitorUtils.monitorNativeStart(getAppContext(), lKEvent, true);
            AppBrandLogger.m52829e("ApiHandler", "no set async executor");
            pluginDoAct(lKEvent);
        }
        return super.handleEvent(lKEvent);
    }

    @Override // com.tt.frontendapiinterface.ApiCallbackHandler
    public final void callbackFail(String str, JSONObject jSONObject) {
        callbackFail(ApiCode.GENERAL_UNKONW_ERROR.code, str, jSONObject);
    }

    @Override // com.tt.frontendapiinterface.ApiCallbackHandler
    public final void callbackOk(String str, JSONObject jSONObject) {
        doApiHandlerCallback(ApiCallResult.Builder.createOk(getActionName()).extraInfo(str).responseData(jSONObject).build());
    }

    public final void operateFinishOnGoalProcess(String str, C67577a aVar) {
        aVar.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("apiExecuteResult", (Object) str).mo234763b(), true);
    }

    public JSONObject makeMsgByResult(boolean z, HashMap<String, Object> hashMap, String str) {
        return makeMsgByResult(z, hashMap, str, null);
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return handleActivityResult(i, i2, intent);
    }

    public ApiHandler(String str, int i, AbstractC67619e eVar) {
        this.mArgs = str;
        this.mCallBackId = i;
        this.mApiHandlerCallback = eVar;
    }

    @Override // com.tt.frontendapiinterface.ApiCallbackHandler
    public void callbackMsg(boolean z, HashMap<String, Object> hashMap, String str) {
        doCallbackByApiHandler(makeMsgByResult(z, hashMap, str).toString());
    }

    @Override // com.tt.frontendapiinterface.ApiCallbackHandler
    public void callbackFail(int i, String str, JSONObject jSONObject) {
        doApiHandlerCallback(ApiCallResult.Builder.createFail(getActionName()).extraInfo(str).errorCode(i).responseData(jSONObject).build());
    }

    @Override // com.tt.frontendapiinterface.ApiCallbackHandler
    public void callbackFail(String str, JSONObject jSONObject, Throwable th) {
        ApiCallResult.Builder createFail = ApiCallResult.Builder.createFail(getActionName());
        if (!TextUtils.isEmpty(str)) {
            createFail.extraInfo(str);
        } else if (th != null) {
            createFail.extraInfo(th);
        }
        createFail.responseData(jSONObject);
        createFail.errorCode(ApiCode.GENERAL_UNKONW_ERROR.code);
        doApiHandlerCallback(createFail.build());
    }

    public JSONObject makeMsgByResult(boolean z, HashMap<String, Object> hashMap, String str, Throwable th) {
        if (z) {
            ApiCallResult.Builder createOk = ApiCallResult.Builder.createOk(getActionName());
            if (!TextUtils.isEmpty(str)) {
                createOk.extraInfo(str);
            } else if (th != null) {
                createOk.extraInfo(th);
            }
            createOk.responseData(hashMap);
            return createOk.build().getJson();
        }
        ApiCallResult.Builder createFail = ApiCallResult.Builder.createFail(getActionName());
        if (!TextUtils.isEmpty(str)) {
            createFail.extraInfo(str);
        } else if (th != null) {
            createFail.extraInfo(th);
        }
        createFail.responseData(hashMap);
        return createFail.build().getJson();
    }
}
