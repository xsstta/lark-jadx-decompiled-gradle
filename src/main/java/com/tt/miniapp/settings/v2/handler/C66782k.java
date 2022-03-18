package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.k */
public class C66782k extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66782k> f168525a = new AbstractC12790g<C66782k>() {
        /* class com.tt.miniapp.settings.v2.handler.C66782k.C667831 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66782k mo48227b(Context... contextArr) {
            return new C66782k();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "gadget_fg_config";
    }

    /* renamed from: a */
    public static final C66782k m260640a() {
        return f168525a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public JSONObject mo232692b() {
        JSONObject jSONObject;
        String settingFromLocal = getSettingFromLocal("gadget_fg_config", "");
        if (!TextUtils.isEmpty(settingFromLocal)) {
            try {
                jSONObject = new JSONObject(settingFromLocal);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("GadgetFGSettingHandler", e);
            }
            AppBrandLogger.m52830i("GadgetFGSettingHandler", "getGadgetFGFilterConfig:", settingFromLocal);
            return jSONObject;
        }
        jSONObject = null;
        AppBrandLogger.m52830i("GadgetFGSettingHandler", "getGadgetFGFilterConfig:", settingFromLocal);
        return jSONObject;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("GadgetFGSettingHandler", "save fg settings from remote:", str);
        C12782a.m52834a("gadget_fg_config", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
