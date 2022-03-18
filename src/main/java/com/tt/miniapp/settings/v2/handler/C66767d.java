package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.d */
public class C66767d extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66767d> f168516a = new AbstractC12790g<C66767d>() {
        /* class com.tt.miniapp.settings.v2.handler.C66767d.C667681 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66767d mo48227b(Context... contextArr) {
            return new C66767d();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "checkDomains";
    }

    /* renamed from: a */
    public static final C66767d m260606a() {
        return f168516a.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public String mo232673a(String str) {
        return getSettingFromLocal("safeDomainCheckData", str);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("safeDomainCheckData", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
