package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.data.C67494g;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.option.ext.AbstractC67619e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.q */
public class C25415q extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getRecentAppList";
    }

    public C25415q() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        ContextSingletonInstance.getInstance().getRecentAppsManager().getRecentAppList(new C67494g.AbstractC67496b() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25415q.C254161 */

            @Override // com.tt.miniapphost.data.C67494g.AbstractC67496b
            /* renamed from: a */
            public void mo88546a(boolean z) {
                C25415q qVar = C25415q.this;
                qVar.callbackFail("get recent app fail, isFromLocalDb=" + z);
            }

            @Override // com.tt.miniapphost.data.C67494g.AbstractC67496b
            /* renamed from: a */
            public void mo88545a(List<AppLaunchInfo> list, boolean z) {
                C25415q.this.mo88544a(list);
            }
        }, getAppContext());
    }

    /* renamed from: a */
    public void mo88544a(List<AppLaunchInfo> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (AppLaunchInfo appLaunchInfo : list) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("app_id", appLaunchInfo.appId);
                        jSONObject3.put("icon", appLaunchInfo.icon);
                        jSONObject3.put("min_jssdk", appLaunchInfo.minJssdk);
                        jSONObject3.put("name", appLaunchInfo.appName);
                        jSONObject3.put("orientation", appLaunchInfo.orientation);
                        jSONObject3.put("schema", appLaunchInfo.schema);
                        jSONObject3.put("state", appLaunchInfo.state);
                        jSONObject3.put("summary", appLaunchInfo.summary);
                        jSONObject3.put("ttid", appLaunchInfo.ttid);
                        jSONObject3.put(ShareHitPoint.f121869d, appLaunchInfo.type);
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject2.put("apps", jSONArray);
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiHandler", e);
                callbackFail(e);
                return;
            }
        }
        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
        callbackOk(jSONObject);
    }

    public C25415q(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
