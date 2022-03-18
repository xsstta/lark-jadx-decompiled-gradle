package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.e */
public class C66769e extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66769e> f168517a = new AbstractC12790g<C66769e>() {
        /* class com.tt.miniapp.settings.v2.handler.C66769e.C667701 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66769e mo48227b(Context... contextArr) {
            return new C66769e();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "componentFeatureWhiteList";
    }

    /* renamed from: a */
    public static final C66769e m260610a() {
        return f168517a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232675b() {
        return getSettingFromLocal("switchableTextarea", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        JSONArray optJSONArray;
        AppBrandLogger.m52830i("ComponentFeatureWhiteLi", "KEY_COMPONENT_FEATURE_WHITELIST: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("switchableTextarea") && (optJSONArray = jSONObject.optJSONArray("switchableTextarea")) != null) {
                C12782a.m52834a("switchableTextarea", optJSONArray.toString());
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ComponentFeatureWhiteLi", "saveSettingFromRemote error:", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
