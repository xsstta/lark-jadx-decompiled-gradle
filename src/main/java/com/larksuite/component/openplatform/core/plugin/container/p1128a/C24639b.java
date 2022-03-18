package com.larksuite.component.openplatform.core.plugin.container.p1128a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.aa.C65722b;
import com.tt.miniapp.p3298k.C66273g;
import com.tt.miniapp.p3298k.C66282h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.util.C67866g;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.a.b */
public class C24639b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "addToUserFavorites";
    }

    public C24639b() {
    }

    /* renamed from: c */
    private void m89717c() {
        C67866g.m264025a(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24639b.C246401 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                if (C24639b.this.mo87637a()) {
                    C67866g.m264027a(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24639b.C246401.RunnableC246411 */

                        public void run() {
                            C66273g.m259315a(C24639b.this.getAppContext());
                        }
                    });
                }
            }
        }, Schedulers.longIO());
    }

    /* renamed from: b */
    public Context mo87638b() {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        return AppbrandContext.getInst().getApplicationContext();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        ApiResult a = C66282h.m259342a(getAppContext());
        if (!a.success) {
            callbackFail(a.message);
        } else if (!C65722b.m257660a(getAppContext()).mo230313a()) {
            callbackFail("Client NOT login");
        } else {
            m89717c();
        }
    }

    /* renamed from: a */
    public boolean mo87637a() {
        boolean z;
        boolean z2;
        String a = C24636a.m89711a(AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appId, getAppContext());
        try {
            JSONObject jSONObject = new JSONObject(a);
            int optInt = jSONObject.optInt("error", 1);
            AppBrandLogger.m52828d("ApiHandler", "addMiniAppToFavoriteList", "error == ", Integer.valueOf(optInt));
            if (optInt == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    z2 = optJSONObject.optBoolean("isFirst", false);
                } else {
                    z2 = false;
                }
                m89716a(z2);
                return true;
            }
            AppBrandLogger.m52828d("ApiHandler", "addMiniAppToFavoriteList", jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "not errMsg"));
            m89715a(a);
            return false;
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", e);
        }
    }

    /* renamed from: a */
    private void m89716a(final boolean z) {
        callbackOk();
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24639b.RunnableC246422 */

            public void run() {
                if (z) {
                    AppBrandLogger.m52828d("ApiHandler", "addMiniAppToFavoriteList", "firstFavorite");
                    HostDependManager.getInst().firstFavoriteAction();
                    return;
                }
                HostDependManager.getInst().showToast(C24639b.this.mo87638b(), null, C24639b.this.mo87638b().getString(R.string.microapp_m_favorite_success), 0, "success");
            }
        });
    }

    /* renamed from: a */
    private void m89715a(String str) {
        callbackExtraInfoMsg(false, "add to user favorites failed: " + str);
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.p1128a.C24639b.RunnableC246433 */

            public void run() {
                HostDependManager.getInst().showToast(C24639b.this.mo87638b(), null, C24639b.this.mo87638b().getString(R.string.microapp_m_favorite_fail), 0, null);
            }
        });
    }

    public C24639b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
