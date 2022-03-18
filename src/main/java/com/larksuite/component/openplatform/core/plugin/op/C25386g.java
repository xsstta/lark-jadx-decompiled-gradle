package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallbackHandler;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.g */
public class C25386g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "dealUserRelation";
    }

    public C25386g() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67556a.m262941a("handleUserRelation")) {
            AppBrandLogger.m52829e("tma_DealUserRelationCtrl", "dataHandler handleUserRelation is not exist!");
            callbackAppUnSupportFeature();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("action");
            String optString2 = jSONObject.optString("userId");
            if (!TextUtils.isEmpty(optString2)) {
                if (!TextUtils.equals(optString2, "null")) {
                    if (TextUtils.equals(optString, "follow") || TextUtils.equals(optString, "unfollow")) {
                        C67556a.m262935a(this.mArgs, C67432a.m262319a(getAppContext()).getAppInfo().ttId, new AbstractC67565b() {
                            /* class com.larksuite.component.openplatform.core.plugin.op.C25386g.C253871 */

                            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                            /* renamed from: a */
                            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                                AppBrandLogger.m52830i("tma_DealUserRelationCtrl", "handleUserRelation ipc success!");
                                JSONObject jSONObject = new JSONObject();
                                String str = "fail";
                                if (crossProcessDataEntity != null) {
                                    try {
                                        str = crossProcessDataEntity.mo234740a("userRelationHandleResult", str);
                                    } catch (JSONException e) {
                                        AppBrandLogger.m52829e("tma_DealUserRelationCtrl", e);
                                    }
                                }
                                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, ApiCallbackHandler.buildErrorMsg("dealUserRelation", str));
                                C25386g.this.doCallbackByApiHandler(jSONObject.toString());
                                mo234711d();
                            }
                        });
                        return;
                    }
                    AppBrandLogger.m52829e("tma_DealUserRelationCtrl", "action is invalid!");
                    callbackFail("action is invalid");
                    return;
                }
            }
            AppBrandLogger.m52829e("tma_DealUserRelationCtrl", "userId is invalid!");
            callbackFail("userId is invalid");
        } catch (JSONException e) {
            callbackFail(e);
            AppBrandLogger.m52829e("tma_DealUserRelationCtrl", e);
        }
    }

    public C25386g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
