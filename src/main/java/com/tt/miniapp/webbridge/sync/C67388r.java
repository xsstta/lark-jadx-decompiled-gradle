package com.tt.miniapp.webbridge.sync;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "showToast")
/* renamed from: com.tt.miniapp.webbridge.sync.r */
public class C67388r extends AbstractC67320f {

    /* renamed from: a */
    protected long f169978a;

    /* renamed from: b */
    protected String f169979b;

    /* renamed from: c */
    protected String f169980c;

    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showToast";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            AppBrandLogger.m52830i("ShowToastHandler", "show toast:" + this.mArgs);
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f169978a = jSONObject.optLong("duration", 1500);
            this.f169979b = jSONObject.optString("title");
            this.f169980c = jSONObject.optString("icon");
            if (TextUtils.isEmpty(this.f169979b)) {
                callbackFail(ApiErrorCode.INVALID_TITLE.code, ApiErrorCode.INVALID_TITLE.msg);
                AppBrandLogger.m52829e("ShowToastHandler", "title is empty");
                return CharacterUtils.empty();
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67388r.RunnableC673891 */

                public void run() {
                    Context currentActivity = C67388r.this.iAppContext.getCurrentActivity();
                    if (currentActivity == null) {
                        currentActivity = AppbrandContext.getInst().getApplicationContext();
                    }
                    if (currentActivity != null) {
                        C67388r.this.mo234069a(currentActivity);
                        C67388r.this.callbackOk();
                        return;
                    }
                    AppBrandLogger.m52829e("ShowToastHandler", "context is null");
                    C67388r.this.callbackFail(ApiErrorCode.INNER_CONTEXT_ERROR.code, ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                }
            });
            return CharacterUtils.empty();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ShowToastHandler", e);
            callbackFail(ApiErrorCode.INTERNAL_ERROR_JSON.code, ApiErrorCode.INTERNAL_ERROR_JSON.msg);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo234069a(Context context) {
        HostDependManager.getInst().showToast(context, this.mArgs, this.f169979b, this.f169978a, this.f169980c);
    }

    public C67388r(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
