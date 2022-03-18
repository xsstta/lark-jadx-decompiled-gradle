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

/* renamed from: com.tt.miniapp.settings.v2.handler.j */
public class C66780j extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66780j> f168524a = new AbstractC12790g<C66780j>() {
        /* class com.tt.miniapp.settings.v2.handler.C66780j.C667811 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66780j mo48227b(Context... contextArr) {
            return new C66780j();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "op_feedback_config";
    }

    /* renamed from: a */
    public static final C66780j m260633a() {
        return f168524a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232688b() {
        return getSettingFromLocal("op_feedback_config", "");
    }

    /* renamed from: c */
    public String mo232689c() {
        if (TextUtils.isEmpty(mo232688b())) {
            return "";
        }
        try {
            return new JSONObject(mo232688b()).getString("feedback_applink");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("FeedBackV2SettingsHandler", "getFeedBackAppLink parse config is exception", e);
            return "";
        }
    }

    /* renamed from: d */
    public boolean mo232690d() {
        if (!TextUtils.isEmpty(mo232688b())) {
            try {
                return new JSONObject(mo232688b()).getBoolean("open_to_all");
            } catch (JSONException e) {
                AppBrandLogger.m52829e("FeedBackV2SettingsHandler", "getFeedBackAppLink parse config is exception", e);
            }
        }
        return true;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("FeedBackV2SettingsHandler", "saveSettingFromRemote:" + str);
        C12782a.m52834a("op_feedback_config", str);
    }

    /* renamed from: a */
    public boolean mo232687a(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(mo232688b())) {
            try {
                JSONArray jSONArray = new JSONObject(mo232688b()).getJSONArray("app_white_list");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ((jSONArray.get(i) instanceof String) && str.equals((String) jSONArray.get(i))) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("FeedBackV2SettingsHandler", "appIdIsInWhiteList parse config is exception", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
