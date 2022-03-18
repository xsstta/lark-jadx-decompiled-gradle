package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.config.mina.v2.C12752g;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.tt.miniapphost.util.C67587d;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.z */
public class C66812z extends AbstractC12744b {

    /* renamed from: b */
    private static final AbstractC12790g<C66812z> f168546b = new AbstractC12790g<C66812z>() {
        /* class com.tt.miniapp.settings.v2.handler.C66812z.C668131 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66812z mo48227b(Context... contextArr) {
            if (contextArr.length > 0) {
                return new C66812z(contextArr[0]);
            }
            throw new IllegalArgumentException("TTConfigSettingHandler need context!");
        }
    };

    /* renamed from: a */
    private Context f168547a;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "ttConfig";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return "";
    }

    private C66812z(Context context) {
        this.f168547a = context;
    }

    /* renamed from: a */
    public static final C66812z m260698a(Context context) {
        return f168546b.mo48348c(context);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            AppBrandLogger.m52829e("TTConfigSettingHandler", "saveSettingFromRemote ttconfig json error:", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject3 = new C67587d().mo234783a("morePanel", 1).mo234784a();
            jSONObject2 = null;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("tt_tma_switch");
            if (optJSONObject == null) {
                jSONObject3 = new C67587d().mo234783a("morePanel", 1).mo234784a();
            } else {
                jSONObject3 = optJSONObject;
            }
            jSONObject4 = jSONObject.optJSONObject("bdp_meta_config");
            jSONObject2 = jSONObject.optJSONObject("pre_render_config");
        }
        C67587d a = new C67587d().mo234783a("tt_tma_switch", jSONObject3);
        if (jSONObject4 != null) {
            a.mo234783a("bdp_meta_config", jSONObject4);
        }
        if (jSONObject2 != null) {
            a.mo234783a("pre_render_config", jSONObject2);
        }
        JSONObject a2 = a.mo234784a();
        JSONObject a3 = C12738a.m52725a(this.f168547a);
        if (a3 == null) {
            C12738a.m52726a(this.f168547a, a2);
        } else {
            C12738a.m52726a(this.f168547a, C12752g.m52754a(a2, a3));
        }
    }
}
