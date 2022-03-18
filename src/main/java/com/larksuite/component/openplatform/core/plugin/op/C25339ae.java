package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.ae */
public class C25339ae extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getLaunchOptionsSync";
    }

    public C25339ae() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        JSONObject jSONObject;
        try {
            C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(mo232455f()).getRouteEventCtrl();
            if (routeEventCtrl == null) {
                jSONObject = new JSONObject();
            } else {
                JSONObject i = routeEventCtrl.mo232880i();
                AppBrandLogger.m52830i("GetLaunchOptionsSync", "GetLaunchOptionsSync exec " + routeEventCtrl.mo232880i());
                jSONObject = i;
            }
            jSONObject.put("isSticky", true);
            AppInfoEntity appInfo = C67432a.m262319a(mo232455f()).getAppInfo();
            if (appInfo != null) {
                jSONObject.put("shareTicket", appInfo.shareTicket);
                jSONObject.put("scene", appInfo.scene);
            }
            return mo232446a(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "GetLaunchOptionsSync", e.getStackTrace());
            return mo232445a(e);
        }
    }

    public C25339ae(String str) {
        super(str);
    }
}
