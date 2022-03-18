package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.tt.miniapp.manager.p3302a.C66377a;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.p */
public class C66792p extends AbstractC12744b {

    /* renamed from: b */
    private static final AbstractC12790g<C66792p> f168532b = new AbstractC12790g<C66792p>() {
        /* class com.tt.miniapp.settings.v2.handler.C66792p.C667931 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66792p mo48227b(Context... contextArr) {
            return new C66792p(contextArr[0]);
        }
    };

    /* renamed from: a */
    private Context f168533a;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "js_worker_component";
    }

    private C66792p(Context context) {
        this.f168533a = context;
    }

    /* renamed from: a */
    public static final C66792p m260660a(Context context) {
        return f168532b.mo48348c(context);
    }

    /* renamed from: a */
    public String mo232702a(String str) {
        String settingFromLocal = getSettingFromLocal("js_worker_component", "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            return "";
        }
        try {
            return new JSONObject(settingFromLocal).optString(str);
        } catch (Exception e) {
            AppBrandLogger.m52829e("JSWorkerComponentSettingHandler", "getComponentSettingValueByKey error:", e);
            return "";
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("JSWorkerComponentSettingHandler", "saveSettingFromRemote:" + str);
        C66377a.m259534b(this.f168533a).edit().putString("js_worker_component", str).apply();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C66377a.m259534b(this.f168533a).getString(str, str2);
    }
}
