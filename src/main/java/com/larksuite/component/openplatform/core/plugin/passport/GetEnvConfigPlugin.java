package com.larksuite.component.openplatform.core.plugin.passport;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public class GetEnvConfigPlugin extends OPPlugin {
    public AbstractC25897h<GetEnvConfigResponse> invokeCallback;
    public LKEvent lkEvent;
    public IAppContext mAppContext;
    public GetEnvConfigResponse response;

    /* access modifiers changed from: private */
    public static class GetEnvConfigResponse extends C25921b {
        @JSONField(name = "config")
        public JSONObject mConfig = new JSONObject();
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private static class GetEnvConfigRequest extends C25920a {
        private GetEnvConfigRequest() {
        }
    }

    private void getEnvConfigFromService() {
        C66467o.C66470b bVar;
        if (AppbrandApplicationImpl.getInst(this.mAppContext).getAppInfo() == null || TextUtils.isEmpty(AppbrandApplicationImpl.getInst(this.mAppContext).getAppInfo().appId)) {
            GetEnvConfigResponse getEnvConfigResponse = new GetEnvConfigResponse();
            fillFailedResponse(getEnvConfigResponse, C25906a.f64080j, "appinfo is error");
            this.invokeCallback.callback(getEnvConfigResponse);
            this.lkEvent.mo92134c().mo92190b().mo92223e("LarkApiGetEnvConfig", "appinfo is error");
            return;
        }
        CrossProcessDataEntity f = C67556a.m262949f();
        TracingCoreSpan tracingCoreSpan = null;
        if (f != null) {
            bVar = new C66467o.C66470b(f);
        } else {
            bVar = null;
        }
        if (bVar == null || TextUtils.isEmpty(bVar.f167782h)) {
            this.response.mErrorCode = C25906a.f64080j.f64115H;
            this.response.mErrorMessage = "not login";
            this.invokeCallback.callback(this.response);
            this.lkEvent.mo92134c().mo92190b().mo92223e("LarkApiGetEnvConfig", "session is empty");
            return;
        }
        String str = C13047a.C13049b.m53532a() + "/getEnvConfig";
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, C67432a.m262319a(this.mAppContext).getAppInfo().appId);
        hashMap.put("session", bVar.f167782h);
        if (!(getAppContext() == null || getAppContext().getTracingSpan() == null)) {
            tracingCoreSpan = C12805d.m52895a((TracingCoreSpan) getAppContext().getTracingSpan(), true, getAppContext());
        }
        C12843b.m53040a(str, null, new org.json.JSONObject(hashMap), tracingCoreSpan, this.mAppContext, false).subscribe(new Consumer<C12830f>() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.GetEnvConfigPlugin.C254391 */

            /* renamed from: a */
            public void accept(C12830f fVar) throws Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject(fVar.mo48466d());
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                int optInt = jSONObject.optInt("code", -1);
                if (optJSONObject == null || optInt != 0) {
                    GetEnvConfigPlugin.this.response.mErrorCode = ApiCode.GETENVVARIABLE_GET_CONFIG_FAIL.code;
                    GetEnvConfigPlugin.this.response.mErrorMessage = ApiCode.GETENVVARIABLE_GET_CONFIG_FAIL.msg;
                    GetEnvConfigPlugin.this.invokeCallback.callback(GetEnvConfigPlugin.this.response);
                    ILogger b = GetEnvConfigPlugin.this.lkEvent.mo92134c().mo92190b();
                    b.mo92223e("LarkApiGetEnvConfig", "config from service is fail, code:" + optInt);
                    return;
                }
                String optString = optJSONObject.optString("config");
                ((AbstractC12910a) GetEnvConfigPlugin.this.mAppContext.findServiceByInterface(AbstractC12910a.class)).mo48692a("key_env_config", optString, 600);
                if (!TextUtils.isEmpty(optString)) {
                    GetEnvConfigPlugin.this.response.mConfig = JSON.parseObject(optString);
                }
                GetEnvConfigPlugin.this.invokeCallback.callback(GetEnvConfigPlugin.this.response);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.GetEnvConfigPlugin.C254402 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                GetEnvConfigPlugin getEnvConfigPlugin = GetEnvConfigPlugin.this;
                getEnvConfigPlugin.fillFailedResponse(getEnvConfigPlugin.response, C25906a.f64080j, th.getMessage());
                GetEnvConfigPlugin.this.invokeCallback.callback(GetEnvConfigPlugin.this.response);
                GetEnvConfigPlugin.this.lkEvent.mo92134c().mo92190b().mo92223e("LarkApiGetEnvConfig", "get config from service fail", th);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"getEnvVariable"})
    public void LarkApiGetEnvConfig(LKEvent lKEvent, GetEnvConfigRequest getEnvConfigRequest, AbstractC25905b bVar, AbstractC25897h<GetEnvConfigResponse> hVar) {
        this.mAppContext = getEventContext(lKEvent);
        this.response = new GetEnvConfigResponse();
        IAppContext iAppContext = this.mAppContext;
        if (iAppContext == null) {
            lKEvent.mo92134c().mo92190b().mo92223e("LarkApiGetEnvConfig", "appContext is null");
            fillFailedResponse(this.response, C25906a.f64080j, "appContext is null");
            hVar.callback(this.response);
            return;
        }
        this.invokeCallback = hVar;
        this.lkEvent = lKEvent;
        String a = ((AbstractC12910a) iAppContext.findServiceByInterface(AbstractC12910a.class)).mo48688a("key_env_config");
        if (a != null) {
            if (!TextUtils.isEmpty(a)) {
                this.response.mConfig = JSON.parseObject(a);
            }
            hVar.callback(this.response);
            return;
        }
        getEnvConfigFromService();
    }
}
