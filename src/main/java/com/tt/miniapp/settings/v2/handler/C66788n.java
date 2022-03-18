package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.n */
public class C66788n extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66788n> f168529a = new AbstractC12790g<C66788n>() {
        /* class com.tt.miniapp.settings.v2.handler.C66788n.C667891 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66788n mo48227b(Context... contextArr) {
            return new C66788n();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "internalapiWhiteList";
    }

    /* renamed from: a */
    public static final C66788n m260652a() {
        return f168529a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("InternalApiWhiteListSet", "internalApiConfig request done: " + str);
        C12782a.m52834a("internalapiWhiteList", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }

    /* renamed from: a */
    public boolean mo232698a(String str, String str2) {
        String settingFromLocal = getSettingFromLocal("internalapiWhiteList", "");
        if (!TextUtils.isEmpty(settingFromLocal)) {
            AppBrandLogger.m52830i("InternalApiWhiteListSet", "internalApiConfig: " + settingFromLocal);
            try {
                JSONObject jSONObject = new JSONObject(settingFromLocal);
                if (jSONObject.has(str)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if (TextUtils.equals((CharSequence) jSONArray.get(i), str2)) {
                            AppBrandLogger.m52830i("InternalApiWhiteListSet", "checkInternalApi:" + str + ": " + str2 + " true");
                            return true;
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            AppBrandLogger.m52829e("InternalApiWhiteListSet", "internalApiConfig is empty");
        }
        return false;
    }
}
