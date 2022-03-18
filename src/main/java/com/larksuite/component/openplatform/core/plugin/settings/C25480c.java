package com.larksuite.component.openplatform.core.plugin.settings;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getSetting"}, support = {AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.settings.c */
public class C25480c extends AbstractC65797c {
    public C25480c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getSetting");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ApiHandler", "invoke api");
        JSONObject jSONObject = new JSONObject();
        try {
            HostDependManager.getInst().getLocalScope(jSONObject, mo230473f());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("authSetting", jSONObject);
            mo230492b(jSONObject2);
        } catch (JSONException e) {
            mo230481a(ApiCode.GENERAL_JSON_ERROR);
            AppBrandLogger.m52829e("ApiHandler", e);
        }
    }

    public C25480c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
