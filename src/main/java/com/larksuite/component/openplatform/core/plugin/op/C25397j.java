package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.j */
public class C25397j extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getAppInfoSync";
    }

    public C25397j() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC67538f a = C67432a.m262319a(mo232455f());
            jSONObject.put("schema", a.getSchema());
            String str = a.getAppInfo().appId;
            jSONObject.put("appId", str);
            String g = mo232454e().mo235054g(str);
            if (!TextUtils.isEmpty(g)) {
                jSONObject.put("session", g);
            } else {
                jSONObject.put("session", C66612a.m260219a(str));
            }
            jSONObject.put("whiteList", C66236a.m259229d(mo232455f()));
            jSONObject.put("blackList", C66236a.m259231e(mo232455f()));
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiGetAppInfoSync", "act", e.getStackTrace());
        }
        return mo232446a(jSONObject);
    }

    public C25397j(String str) {
        super(str);
    }
}
