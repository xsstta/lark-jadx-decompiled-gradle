package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.v */
public class C66804v extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66804v> f168542a = new AbstractC12790g<C66804v>() {
        /* class com.tt.miniapp.settings.v2.handler.C66804v.C668051 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66804v mo48227b(Context... contextArr) {
            return new C66804v();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "appRouteConfigList";
    }

    /* renamed from: a */
    public static final C66804v m260682a() {
        return f168542a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232712b() {
        return getSettingFromLocal("appRouteConfigList", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("appRouteConfigList", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
