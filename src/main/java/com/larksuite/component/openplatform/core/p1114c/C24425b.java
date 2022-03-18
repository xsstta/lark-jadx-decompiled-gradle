package com.larksuite.component.openplatform.core.p1114c;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@ApiSupportType(apiName = {"invokeCustomApiAsync"}, support = {AppType.CardAPP}, testSupport = {AppType.GadgetAPP, AppType.WebGadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.c.b */
public class C24425b extends AbstractC65797c {
    public C24425b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("invokeCustomApiAsync");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52828d("ApiHandler", "invokeCustom mArgs:", bVar.mo234988d());
        String str = (String) bVar.mo234984a("api");
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("ApiHandler", "invalid params. api is empty!");
            mo230481a(ApiCode.GENERAL_PARAM);
            return;
        }
        mo230473f().sendEvent(str, (JSONObject) bVar.mo234985a("params", new JSONObject()), new AbstractC25894e() {
            /* class com.larksuite.component.openplatform.core.p1114c.C24425b.C244261 */

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48104a(int i, JSONObject jSONObject) {
                AppBrandLogger.m52830i("ApiHandler", "success");
                C24425b.this.mo230492b(jSONObject);
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48103a(int i, int i2, JSONObject jSONObject) {
                String str;
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                sb.append(i2);
                sb.append(" params:");
                if (jSONObject != null) {
                    str = jSONObject.toString();
                } else {
                    str = "empty";
                }
                sb.append(str);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("ApiHandler", objArr);
                C24425b.this.mo230485a((String) null, jSONObject, i2);
            }
        });
    }

    public C24425b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
