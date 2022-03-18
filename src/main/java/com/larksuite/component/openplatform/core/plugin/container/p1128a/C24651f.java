package com.larksuite.component.openplatform.core.plugin.container.p1128a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.miniapp.p3298k.C66266d;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a.f */
public class C24651f extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showFavoriteGuide";
    }

    public C24651f() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final C66266d dVar = new C66266d(jSONObject.optString(ShareHitPoint.f121869d, "bar"), jSONObject.optString("content", ""), jSONObject.optString("position", "bottom"));
            final MiniappHostBase miniappHostBase = (MiniappHostBase) getAppContext().getCurrentActivity();
            if (miniappHostBase != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24651f.RunnableC246521 */

                    public void run() {
                        AbstractC67497e activityProxy = miniappHostBase.getActivityProxy();
                        if (activityProxy != null) {
                            ApiResult a = activityProxy.mo230994a(dVar);
                            C24651f.this.callbackExtraInfoMsg(a.success, a.message);
                            return;
                        }
                        C24651f.this.callbackExtraInfoMsg(false, "common env error");
                    }
                });
            } else {
                callbackExtraInfoMsg(false, "common env error");
            }
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("ApiShowFavoriteGuide", "showFavoriteGuide", e);
            callbackExtraInfoMsg(false, "json params error");
        }
    }

    public C24651f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
