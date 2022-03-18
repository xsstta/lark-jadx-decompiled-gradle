package com.larksuite.component.openplatform.core.plugin.op.appscope;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.p063a.p064a.p065a.p066a.C1713b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getTenantAppScopes"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.b */
public class C25372b extends AbstractC65797c {
    public C25372b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getTenantAppScopes");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ApiHandler", "params: " + bVar.mo234988d());
        m90874a(mo230473f().getAppId(), C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()), C67043j.m261286g());
    }

    /* renamed from: a */
    public HashMap<String, Object> mo88519a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", optJSONObject.optString("name"));
                    jSONObject.put(UpdateKey.STATUS, optJSONObject.optInt(UpdateKey.STATUS));
                    jSONArray2.put(jSONObject);
                }
            } catch (JSONException unused) {
                AppBrandLogger.m52829e("ApiHandler", "parse callback data failed");
            }
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("scopes", jSONArray2);
        return hashMap;
    }

    public C25372b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m90874a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("AppID", str);
            jSONObject.put("LarkVersion", str2);
            jSONObject.put("Lang", str3);
            C12843b.m53038a(C13047a.C13049b.m53532a() + "/GetTenantAppScopes", new HashMap(), jSONObject, mo230473f()).subscribe(new Consumer<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25372b.C253731 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.m52829e("ApiHandler", "response is empty");
                        C25372b.this.mo230493c("response is empty");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    C1713b.m7632b("ApiHandler", "response:" + str);
                    int optInt = jSONObject.optInt("code");
                    if (optInt != 0) {
                        AppBrandLogger.m52829e("ApiHandler", "Request error");
                        C25372b.this.mo230481a(C25375c.m90881a(optInt));
                        return;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject == null) {
                        AppBrandLogger.m52831w("ApiHandler", "call light service, empty result");
                        C25372b.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                        return;
                    }
                    C25372b.this.mo230487a(C25372b.this.mo88519a(optJSONObject.getJSONArray("scopes")));
                }
            }, new Consumer<Throwable>() {
                /* class com.larksuite.component.openplatform.core.plugin.op.appscope.C25372b.C253742 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C25372b.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
        }
    }
}
