package com.larksuite.component.openplatform.core.plugin.applink;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.applink.a */
public class C24579a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openSchema";
    }

    public C24579a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52828d("ApiOpenSchemaCtrl", "openSchema mArgs:", this.mArgs);
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail("activity is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("schema");
            if (TextUtils.isEmpty(optString)) {
                callbackFail("schema is invalid");
            } else if (!C67053q.m261326a("schema_host", optString, getAppContext())) {
                callbackFail("not in valid domains");
            } else {
                Uri parse = Uri.parse(optString);
                String host = parse.getHost();
                boolean equals = TextUtils.equals("microapp", host);
                boolean equals2 = TextUtils.equals("microgame", host);
                if (!equals && !equals2) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    String queryParameter = parse.getQueryParameter("launchflag");
                    ProcessUtil.fillCrossProcessCallbackUri(buildUpon, new AbstractC67565b("hostProcess") {
                        /* class com.larksuite.component.openplatform.core.plugin.applink.C24579a.C245801 */

                        @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                        /* renamed from: a */
                        public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                            String str;
                            AppBrandLogger.m52828d("ApiOpenSchemaCtrl", "onIpcCallback ", crossProcessDataEntity);
                            if (crossProcessDataEntity != null) {
                                str = crossProcessDataEntity.mo234744b("openSchemaResult");
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str) || !str.contains("openSchema")) {
                                C24579a.this.callbackFail("open schema fail");
                            } else {
                                C24579a.this.doCallbackByApiHandler(str);
                            }
                            mo234711d();
                        }
                    });
                    if (currentActivity instanceof MiniappHostBase) {
                        C67018a.m261203a((MiniappHostBase) currentActivity, buildUpon.toString(), queryParameter, this.mArgs, getAppContext());
                    } else {
                        C67018a.m261200a(currentActivity, buildUpon.toString(), queryParameter, this.mArgs, true, getAppContext());
                    }
                } else if (C67432a.m262319a(getAppContext()).getAppInfo().isWhite() || C67053q.m261326a("appids", optString, getAppContext())) {
                    C66612a.m260228a(optString, equals2, AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appId, jSONObject.optBoolean("killCurrentProcess", false), getAppContext());
                    AppbrandApplicationImpl.getInst(getAppContext()).getForeBackgroundManager().mo231968j();
                    callbackOk();
                } else {
                    callbackFail("not in valid domains");
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiOpenSchemaCtrl", "ApiOpenSchemaCtrl act error", e);
            callbackFail(e);
        }
    }

    public C24579a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
