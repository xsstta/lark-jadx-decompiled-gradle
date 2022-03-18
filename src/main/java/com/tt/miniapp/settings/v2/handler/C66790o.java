package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.config.mina.v2.C12752g;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.tt.miniapp.manager.p3302a.C66377a;
import com.tt.miniapphost.util.C67587d;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.o */
public class C66790o extends AbstractC12744b {

    /* renamed from: b */
    private static final AbstractC12790g<C66790o> f168530b = new AbstractC12790g<C66790o>() {
        /* class com.tt.miniapp.settings.v2.handler.C66790o.C667911 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66790o mo48227b(Context... contextArr) {
            if (contextArr.length > 0) {
                return new C66790o(contextArr[0]);
            }
            throw new IllegalArgumentException("GrayscaleSettingHandler need context!");
        }
    };

    /* renamed from: a */
    private Context f168531a;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "jssdk";
    }

    private C66790o(Context context) {
        this.f168531a = context;
    }

    /* renamed from: a */
    public String mo232700a(String str) {
        return getSettingFromLocal(str, "");
    }

    /* renamed from: a */
    public static final C66790o m260656a(Context context) {
        return f168530b.mo48348c(context);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("setting_fetcher_jssdk", "saveSettingFromRemote:" + str);
        try {
            JSONObject a = new C67587d().mo234783a("tt_tma_sdk_config", new JSONObject(str)).mo234784a();
            JSONObject a2 = C12738a.m52725a(this.f168531a);
            if (a2 == null) {
                C12738a.m52726a(this.f168531a, a);
            } else {
                C12738a.m52726a(this.f168531a, C12752g.m52754a(a, a2));
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("setting_fetcher_jssdk", "saveSettingFromRemote error:", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C66377a.m259531a(this.f168531a).getString(str, str2);
    }
}
