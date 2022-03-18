package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.ab */
public class C66759ab extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66759ab> f168511a = new AbstractC12790g<C66759ab>() {
        /* class com.tt.miniapp.settings.v2.handler.C66759ab.C667601 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66759ab mo48227b(Context... contextArr) {
            return new C66759ab();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "WebAppApiAuthPassList";
    }

    /* renamed from: a */
    public static final C66759ab m260590a() {
        return f168511a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232665b() {
        return getSettingFromLocal("web_app_pass_auth_list", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("WebAppApiAuthPassListSe", "webAppPassAuthList:" + str);
        C12782a.m52834a("web_app_pass_auth_list", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
