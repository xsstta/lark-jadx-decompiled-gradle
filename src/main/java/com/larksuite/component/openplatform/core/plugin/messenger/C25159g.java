package com.larksuite.component.openplatform.core.plugin.messenger;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.g */
public class C25159g extends ApiHandler {

    /* renamed from: a */
    protected long f61446a;

    /* renamed from: b */
    protected String f61447b;

    /* renamed from: c */
    protected String f61448c;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showToast";
    }

    public C25159g() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiShowToastCtrl", "show toast: " + this.mArgs);
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f61446a = jSONObject.optLong("duration", 1500);
            this.f61447b = jSONObject.optString("title");
            this.f61448c = jSONObject.optString("icon");
            if (this.f61446a <= 0) {
                this.f61446a = 1500;
            }
            if (TextUtils.isEmpty(this.f61447b)) {
                callbackFail("title不能为空");
                AppBrandLogger.m52829e("tma_ApiShowToastCtrl", "title is empty");
                return;
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25159g.RunnableC251601 */

                public void run() {
                    Context currentActivity = C25159g.this.getAppContext().getCurrentActivity();
                    if (currentActivity == null) {
                        currentActivity = AppbrandContext.getInst().getApplicationContext();
                    }
                    if (currentActivity != null) {
                        C25159g.this.mo88250a(currentActivity);
                        C25159g.this.callbackOk();
                        return;
                    }
                    AppBrandLogger.m52829e("tma_ApiShowToastCtrl", "context is null");
                    C25159g.this.callbackFail(ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                }
            });
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_ApiShowToastCtrl", e.getStackTrace());
            callbackFail(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo88250a(Context context) {
        HostDependManager.getInst().showToast(context, this.mArgs, this.f61447b, this.f61446a, this.f61448c);
    }

    public C25159g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
