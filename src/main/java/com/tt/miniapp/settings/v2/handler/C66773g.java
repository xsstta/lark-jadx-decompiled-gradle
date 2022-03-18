package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.g */
public class C66773g extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66773g> f168519a = new AbstractC12790g<C66773g>() {
        /* class com.tt.miniapp.settings.v2.handler.C66773g.C667741 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66773g mo48227b(Context... contextArr) {
            return new C66773g();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "cookieUrlBlackList";
    }

    /* renamed from: a */
    public static final C66773g m260618a() {
        return f168519a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("key_cookie_black_list", str);
    }

    /* renamed from: a */
    public ArrayList<String> mo232679a(String str) {
        String settingFromLocal = getSettingFromLocal("key_cookie_black_list", "");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(settingFromLocal)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(settingFromLocal);
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null || !TextUtils.equals(str, optJSONObject.optString("app_id"))) {
                    i++;
                } else if (optJSONObject.has("urls")) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("urls");
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        arrayList.add(optJSONArray.optString(i2));
                    }
                }
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CookieBlackListSettingH", e);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
