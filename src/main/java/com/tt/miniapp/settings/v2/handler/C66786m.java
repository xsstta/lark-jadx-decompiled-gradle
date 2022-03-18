package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.larkbrand.utils.sharedpreference.Sp;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.m */
public class C66786m extends AbstractC12744b {

    /* renamed from: b */
    private static final AbstractC12790g<C66786m> f168527b = new AbstractC12790g<C66786m>() {
        /* class com.tt.miniapp.settings.v2.handler.C66786m.C667871 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66786m mo48227b(Context... contextArr) {
            if (contextArr.length > 0) {
                return new C66786m(contextArr[0]);
            }
            throw new IllegalArgumentException("GrayscaleSettingHandler need context!");
        }
    };

    /* renamed from: a */
    private Context f168528a;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "pList";
    }

    private C66786m(Context context) {
        this.f168528a = context;
    }

    /* renamed from: a */
    public static final C66786m m260648a(Context context) {
        return f168527b.mo48348c(context);
    }

    /* renamed from: a */
    public boolean mo232696a(String str) {
        String settingFromLocal = getSettingFromLocal("key_plist", "");
        if (!TextUtils.isEmpty(settingFromLocal)) {
            try {
                JSONArray jSONArray = new JSONArray(settingFromLocal);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("id");
                        boolean optBoolean = optJSONObject.optBoolean("isTest");
                        if (TextUtils.equals(str, optString)) {
                            return optBoolean;
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        SharedPreferences sharedPreferences = this.f168528a.getSharedPreferences("app_test_list", 0);
        if (!TextUtils.isEmpty(str)) {
            sharedPreferences.edit().putString("key_plist", str).apply();
        } else {
            sharedPreferences.edit().remove("key_plist").apply();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return (String) Sp.m54287b("app_test_list").mo49642a(str, str2);
    }
}
