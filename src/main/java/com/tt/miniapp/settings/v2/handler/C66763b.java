package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.b */
public class C66763b extends AbstractC12744b {

    /* renamed from: b */
    private static final AbstractC12790g<C66763b> f168513b = new AbstractC12790g<C66763b>() {
        /* class com.tt.miniapp.settings.v2.handler.C66763b.C667641 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66763b mo48227b(Context... contextArr) {
            return new C66763b();
        }
    };

    /* renamed from: a */
    private List<String> f168514a;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "openplatform_gadget_quick_api";
    }

    /* renamed from: a */
    public static C66763b m260598a() {
        return f168513b.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("openplatform_gadget_quick_api", str);
    }

    /* renamed from: a */
    public List<String> mo232669a(String str) {
        if (this.f168514a == null) {
            this.f168514a = new ArrayList();
            String settingFromLocal = getSettingFromLocal("openplatform_gadget_quick_api", "");
            if (TextUtils.isEmpty(settingFromLocal)) {
                return this.f168514a;
            }
            try {
                JSONObject jSONObject = new JSONObject(settingFromLocal);
                if (jSONObject.has(str)) {
                    JSONArray optJSONArray = jSONObject.optJSONArray(str);
                    if (optJSONArray == null) {
                        return this.f168514a;
                    }
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f168514a.add(optString);
                        }
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiQuickCallbackSettingHandler", e);
            }
        }
        return this.f168514a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
