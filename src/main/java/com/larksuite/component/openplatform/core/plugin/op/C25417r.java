package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.util.C67866g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.r */
public class C25417r extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getShareInfo";
    }

    public C25417r() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("shareTicket");
            JSONArray optJSONArray = jSONObject.optJSONArray("shareTickets");
            String[] strArr = null;
            if (optJSONArray != null) {
                strArr = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    strArr[i] = optJSONArray.optString(i);
                }
            }
            m90931a(optString, strArr);
        } catch (JSONException unused) {
            callbackFail(ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
        }
    }

    /* renamed from: a */
    private String m90930a() {
        String str;
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            str = initParams.mo234510j();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("ApiGetShareInfoCtrl", "host id is empty");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "host id is empty");
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiGetShareInfoCtrl", "getHostId", e);
            }
            C67509b.m262587a("mp_start_error", 2003, jSONObject, getAppContext());
        }
        return str;
    }

    /* renamed from: a */
    private void m90931a(String str, String[] strArr) {
        final C12827e b = m90932b(str, strArr);
        C67866g.m264025a(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25417r.C254181 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    C12830f doPostBody = HostDependManager.getInst().doPostBody(b, C25417r.this.getAppContext());
                    String d = doPostBody.mo48466d();
                    if (TextUtils.isEmpty(d)) {
                        C25417r.this.callbackFail(ApiCallResultHelper.generateTmaNetRequestFailInfo(doPostBody));
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(d);
                    int optInt = jSONObject.optInt("err_no", -1);
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optInt != 0 || optJSONObject == null) {
                        C25417r.this.callbackFail(ApiCallResultHelper.generateInnerNetRequestResultErrorInfo(optInt));
                    } else {
                        C25417r.this.callbackOk(optJSONObject);
                    }
                } catch (Throwable th) {
                    C25417r.this.callbackFail(th);
                }
            }
        }, Schedulers.longIO());
    }

    /* renamed from: b */
    private C12827e m90932b(String str, String[] strArr) {
        C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230145j(), "POST");
        if (!TextUtils.isEmpty(str)) {
            eVar.mo48433a("share_ticket", (Object) str);
        }
        if (strArr != null && strArr.length > 0) {
            try {
                eVar.mo48433a("share_tickets", new JSONArray(strArr));
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiGetShareInfoCtrl", "getOpenGidRequest", e);
            }
        }
        eVar.mo48433a("host_id", Integer.valueOf(Integer.parseInt(m90930a())));
        eVar.mo48433a("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId);
        String a = C66612a.m260219a(C67432a.m262319a(getAppContext()).getAppInfo().appId);
        if (!TextUtils.isEmpty(a)) {
            eVar.mo48433a("session", (Object) a);
        }
        return eVar;
    }

    public C25417r(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
