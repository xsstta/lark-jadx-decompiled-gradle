package com.larksuite.component.openplatform.core.component.worker.bridge;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25528c;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class BlockBridgeModule extends LynxContextModule {
    public IAppContext mAppContext;
    public Executor mExecutor = Executors.newSingleThreadExecutor();

    public BlockBridgeModule(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
        if (obj instanceof IAppContext) {
            this.mAppContext = (IAppContext) obj;
        }
    }

    @LynxMethod
    public String invoke(final String str, ReadableMap readableMap, final Callback callback) {
        char c;
        int i;
        final OPTrace subTrace = this.mAppContext.getTracingSpan().subTrace(str);
        final long currentTimeMillis = System.currentTimeMillis();
        C67704c cVar = new C67704c(readableMap);
        OPMonitorUtils.monitorNativeInvoke(this.mAppContext, subTrace, str, cVar.mo234999a(), null, "", false);
        if (!C25529d.m91155b(str) || this.mAppContext == null) {
            AppBrandLogger.m52830i("OP_SDK_BlockBridgeModule", String.format("invoke apiName: %s", str));
            try {
                final LKEvent a = new LKEvent.C25888a().mo92168a(str).mo92169a(cVar.mo235000b()).mo92162a(this.mAppContext.getCurrentActivity()).mo92171a();
                a.mo92119a((AbstractC25890a) new AbstractC25890a() {
                    /* class com.larksuite.component.openplatform.core.component.worker.bridge.BlockBridgeModule.C244561 */

                    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
                    public void executeAsyncApiHandle(String str, Runnable runnable) {
                        OPMonitorUtils.monitorNativeStart(BlockBridgeModule.this.mAppContext, a, true);
                        BlockBridgeModule.this.mExecutor.execute(runnable);
                    }
                });
                a.mo92122a((AbstractC25894e) new AbstractC25894e() {
                    /* class com.larksuite.component.openplatform.core.component.worker.bridge.BlockBridgeModule.C244572 */

                    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                    /* renamed from: a */
                    public void mo48104a(int i, JSONObject jSONObject) {
                        if (callback != null) {
                            OPMonitorUtils.monitorPMResult(BlockBridgeModule.this.mAppContext, a, currentTimeMillis, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                            callback.invoke(ApiCallResult.Builder.createOk(str).responseData(jSONObject).build().toString());
                            OPMonitorUtils.monitorResultCallback(BlockBridgeModule.this.mAppContext, str, subTrace, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                        }
                    }

                    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                    /* renamed from: a */
                    public void mo48103a(int i, int i2, JSONObject jSONObject) {
                        if (callback != null) {
                            int a = C25529d.m91125a(i2, jSONObject);
                            String optString = jSONObject.optString(ApiHandler.API_CALLBACK_ERRMSG);
                            String a2 = C25529d.m91141a(jSONObject);
                            OPMonitorUtils.monitorPMResult(BlockBridgeModule.this.mAppContext, a, currentTimeMillis, "fail", i2, a, optString, a2, false);
                            callback.invoke(ApiCallResult.Builder.createFail(str).responseData(jSONObject).errorCode(i2).build().toString());
                            OPMonitorUtils.monitorResultCallback(BlockBridgeModule.this.mAppContext, str, subTrace, "fail", i2, a, optString, a2, false);
                        }
                    }
                });
                LKBasePluginResult sendEvent = this.mAppContext.sendEvent(a);
                if (sendEvent != null) {
                    if (sendEvent.mo92270e() != null) {
                        monitorSyncResult(sendEvent, a, currentTimeMillis, subTrace);
                    }
                    if (sendEvent.mo92268d()) {
                        return C25528c.m91124a(sendEvent, str);
                    }
                }
                i = 1;
                c = 0;
            } catch (Throwable th) {
                c = 0;
                i = 1;
                AppBrandLogger.m52829e("OP_SDK_BlockBridgeModule", "JSONException", th);
            }
            Object[] objArr = new Object[i];
            Object[] objArr2 = new Object[i];
            objArr2[c] = str;
            objArr[c] = String.format("api %s is not support", objArr2);
            AppBrandLogger.m52829e("OP_SDK_BlockBridgeModule", objArr);
            return ApiCallResult.Builder.createFail(str, ApiCode.GENERAL_UNABLE.msg, ApiCode.GENERAL_UNABLE.code).build().toString();
        }
        AppBrandLogger.m52830i("OP_SDK_BlockBridgeModule", String.format("invoke router event: %s", str));
        LKBasePluginResult sendEvent2 = this.mAppContext.sendEvent(str, cVar.mo235000b(), null);
        if (callback != null) {
            if (sendEvent2 == null) {
                callback.invoke("no_callback_response");
            } else if (sendEvent2.mo92270e() != null) {
                callback.invoke(sendEvent2.mo92270e().toString());
            } else {
                callback.invoke(Integer.valueOf(sendEvent2.mo92267c()));
            }
        }
        return ApiCallResult.Builder.createOk(str).build().toString();
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
        OPMonitorUtils.monitorPMResult(this.mAppContext, lKEvent, j, str, c, a, optString, a2, true);
        OPMonitorUtils.monitorResultCallback(this.mAppContext, lKEvent.mo92146m(), oPTrace, str, c, a, optString, a2, true);
    }
}
