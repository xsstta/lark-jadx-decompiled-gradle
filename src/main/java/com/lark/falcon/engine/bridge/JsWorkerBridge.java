package com.lark.falcon.engine.bridge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lark.falcon.engine.p1057a.AbstractC23947a;
import com.lark.falcon.engine.plugin.WorkerGetUserInfoPlugin;
import com.larksuite.component.openplatform.core.plugin.applink.OpenSchemaAsyncHandlerPlugin;
import com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.EnterProfileAsyncHandlerPlugin;
import com.larksuite.component.openplatform.core.utils.C25528c;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.component.openplatform.plugins.container.C25577b;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25567g;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25928e;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.sdk.C53241h;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.jsbridge.Jscore;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class JsWorkerBridge implements AbstractC23947a {
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    public IAppContext mAppContext;
    private AbstractC23966a mInvokeCallbackListener;
    private AbstractC25576a mPluginManagerContainer;
    public final String mWorkerName;

    /* renamed from: com.lark.falcon.engine.bridge.JsWorkerBridge$a */
    public interface AbstractC23966a {
        void execJs(String str, AbstractC25567g<String> gVar);
    }

    @Override // com.lark.falcon.engine.p1057a.AbstractC23947a
    public AbstractC25576a getPluginManagerContainer() {
        return this.mPluginManagerContainer;
    }

    @Override // com.lark.falcon.engine.p1057a.AbstractC23947a
    public void onRelease() {
        this.mAppContext = null;
        this.mPluginManagerContainer = null;
        this.mInvokeCallbackListener = null;
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25562e
    public AbstractC25905b getBridgeContext() {
        AbstractC25905b v = this.mPluginManagerContainer.mo92184v();
        if (v instanceof AbstractC25928e) {
            ((AbstractC25928e) v).mo92221a(this.mAppContext);
        }
        return v;
    }

    @Override // com.lark.falcon.engine.p1057a.AbstractC23947a
    public AbstractC25904o getPluginManager() {
        AbstractC25576a aVar = this.mPluginManagerContainer;
        if (aVar != null) {
            return aVar.mo92183u();
        }
        C53241h.m205894a("JsWorkerBridge", "mPluginManagerContainer is null");
        return null;
    }

    private void addInnerPlugin() {
        AbstractC25904o u = this.mPluginManagerContainer.mo92183u();
        u.mo92199a(new WorkerGetUserInfoPlugin());
        u.mo92199a(new OpenSchemaAsyncHandlerPlugin());
        u.mo92199a(new ApiMonitorReportHandlerPlugin());
        u.mo92199a(new EnterProfileAsyncHandlerPlugin());
    }

    @Jscore(jsfunctionname = "invokeNative")
    public String invokeNative(String str) {
        boolean z;
        final OPTrace oPTrace;
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String optString = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
            String str2 = "";
            if (optJSONObject != null) {
                str2 = optJSONObject.toString();
            }
            final Object opt = jSONObject.opt("callbackID");
            String str3 = null;
            if (optJSONObject2 != null) {
                str3 = optJSONObject2.optString("api_trace");
            }
            if (!TextUtils.isEmpty(str3)) {
                oPTrace = OPTrace.deserialize(str3, optString).subTrace();
                z = false;
            } else {
                AppBrandLogger.m52829e("JsWorkerBridge", "get empty trace id from jssdk");
                if (ProcessUtil.isMiniappProcess()) {
                    oPTrace = AppbrandContext.getInst().getTracing().subTrace(optString);
                } else {
                    oPTrace = this.mAppContext.getTracingSpan().subTrace(optString);
                }
                z = true;
            }
            OPMonitorUtils.monitorNativeInvoke(this.mAppContext, oPTrace, optString, str2, String.valueOf(opt), null, z, this.mWorkerName);
            final long currentTimeMillis = System.currentTimeMillis();
            final LKEvent a = new LKEvent.C25888a().mo92168a(optString).mo92169a(new C67704c(str2).mo235000b()).mo92162a(this.mAppContext.getCurrentActivity()).mo92171a();
            C25529d.m91143a(a, this.mAppContext);
            a.mo92119a((AbstractC25890a) new AbstractC25890a(a) {
                /* class com.lark.falcon.engine.bridge.$$Lambda$JsWorkerBridge$FLmU457SzzC3qBc9l0hAPEIuBw */
                public final /* synthetic */ LKEvent f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
                public final void executeAsyncApiHandle(String str, Runnable runnable) {
                    JsWorkerBridge.this.lambda$invokeNative$0$JsWorkerBridge(this.f$1, str, runnable);
                }
            });
            a.mo92122a((AbstractC25894e) new AbstractC25894e() {
                /* class com.lark.falcon.engine.bridge.JsWorkerBridge.C239651 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48104a(int i, JSONObject jSONObject) {
                    OPMonitorUtils.monitorPMResult(JsWorkerBridge.this.mAppContext, a, currentTimeMillis, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false, JsWorkerBridge.this.mWorkerName);
                    JsWorkerBridge.this.asyncCallback(opt, jSONObject, true);
                    OPMonitorUtils.monitorResultCallback(JsWorkerBridge.this.mAppContext, optString, oPTrace, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false, JsWorkerBridge.this.mWorkerName);
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48103a(int i, int i2, JSONObject jSONObject) {
                    int a = C25529d.m91125a(i2, jSONObject);
                    String optString = jSONObject.optString(ApiHandler.API_CALLBACK_ERRMSG);
                    String a2 = C25529d.m91141a(jSONObject);
                    OPMonitorUtils.monitorPMResult(JsWorkerBridge.this.mAppContext, a, currentTimeMillis, "fail", i2, a, optString, a2, false, JsWorkerBridge.this.mWorkerName);
                    JsWorkerBridge.this.asyncCallback(opt, jSONObject, false);
                    OPMonitorUtils.monitorResultCallback(JsWorkerBridge.this.mAppContext, optString, oPTrace, "fail", i2, a, optString, a2, false, JsWorkerBridge.this.mWorkerName);
                }
            });
            LKBasePluginResult b = this.mPluginManagerContainer.mo92179b(a);
            if (b == null || !b.mo92268d()) {
                return ApiCallResult.Builder.createFail(optString, ApiCode.GENERAL_UNABLE.msg, ApiCode.GENERAL_UNABLE.code).build().toString();
            }
            if (b.mo92270e() != null) {
                monitorSyncResult(b, a, currentTimeMillis, oPTrace);
            }
            return C25528c.m91124a(b, optString);
        } catch (Throwable th) {
            C53241h.m205895a("JsWorkerBridge", "Exception", th);
            C53241h.m205894a("JsWorkerBridge", "not handle this api");
            return CharacterUtils.empty();
        }
    }

    public void sendMsgToJs(String str, JSONObject jSONObject, AbstractC25567g<String> gVar) {
        callback(str, jSONObject, "continued", gVar);
    }

    public void asyncCallback(Object obj, Object obj2, boolean z) {
        String str;
        if (z) {
            str = "success";
        } else {
            str = "failure";
        }
        callback(obj, obj2, str, new AbstractC25567g(obj) {
            /* class com.lark.falcon.engine.bridge.$$Lambda$JsWorkerBridge$BaQB_sTfZQgskQzuUKCcczpC04 */
            public final /* synthetic */ Object f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25567g
            public final void onReceiveValue(Object obj) {
                JsWorkerBridge.lambda$asyncCallback$1(this.f$0, (String) obj);
            }
        });
    }

    public /* synthetic */ void lambda$invokeNative$0$JsWorkerBridge(LKEvent lKEvent, String str, Runnable runnable) {
        this.executorService.execute(runnable);
        OPMonitorUtils.monitorNativeStart(this.mAppContext, lKEvent, true, this.mWorkerName);
    }

    public JsWorkerBridge(IAppContext iAppContext, String str, AbstractC23966a aVar) {
        this.mAppContext = iAppContext;
        this.mWorkerName = str;
        this.mInvokeCallbackListener = aVar;
        this.mPluginManagerContainer = C25577b.m91292a(iAppContext.getCurrentActivity(), null);
        addInnerPlugin();
    }

    private void callback(Object obj, Object obj2, String str, AbstractC25567g<String> gVar) {
        if (this.mInvokeCallbackListener == null) {
            C53241h.m205894a("JsWorkerBridge", "mInvokeCallbackListener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callbackID", obj);
            if (obj2 != null) {
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj2);
            }
            jSONObject.put("callbackType", str);
            this.mInvokeCallbackListener.execJs(String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s)", jSONObject.toString()), gVar);
        } catch (JSONException e) {
            C53241h.m205895a("JsWorkerBridge", "JSONException", e);
        }
    }

    private void monitorSyncResult(LKBasePluginResult lKBasePluginResult, LKEvent lKEvent, long j, OPTrace oPTrace) {
        String str;
        JSONObject e = lKBasePluginResult.mo92270e();
        int c = lKBasePluginResult.mo92267c();
        if (c == Integer.MIN_VALUE) {
            str = "ok";
        } else {
            str = "fail";
        }
        int a = C25529d.m91125a(c, e);
        String optString = e.optString(ApiHandler.API_CALLBACK_ERRMSG);
        String a2 = C25529d.m91141a(e);
        OPMonitorUtils.monitorPMResult(this.mAppContext, lKEvent, j, str, c, a, optString, a2, true, this.mWorkerName);
        OPMonitorUtils.monitorResultCallback(this.mAppContext, lKEvent.mo92146m(), oPTrace, str, c, a, optString, a2, true, this.mWorkerName);
    }
}
