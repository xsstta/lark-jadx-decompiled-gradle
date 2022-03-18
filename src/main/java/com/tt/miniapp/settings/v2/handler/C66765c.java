package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.c */
public class C66765c extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66765c> f168515a = new AbstractC12790g<C66765c>() {
        /* class com.tt.miniapp.settings.v2.handler.C66765c.C667661 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66765c mo48227b(Context... contextArr) {
            return new C66765c();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "blank_detect";
    }

    /* renamed from: a */
    public static final C66765c m260602a() {
        return f168515a.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public String mo232671a(String str) {
        return getSettingFromLocal("strategy_json_new", str);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("strategy");
            AppBrandLogger.m52830i("BlackDetectSettingHandler", "strategy = " + jSONObject);
            C12782a.m52834a("strategy_json_new", jSONObject.toString());
        } catch (Exception e) {
            AppBrandLogger.m52829e("BlackDetectSettingHandler", "parse strategy config error : " + e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
