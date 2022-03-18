package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.a */
public class C66755a extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66755a> f168508a = new AbstractC12790g<C66755a>() {
        /* class com.tt.miniapp.settings.v2.handler.C66755a.C667561 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66755a mo48227b(Context... contextArr) {
            return new C66755a();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "ABTestConfig";
    }

    /* renamed from: a */
    public static final C66755a m260582a() {
        return f168508a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232661b() {
        return getSettingFromLocal("key_abtest_config", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("key_abtest_config", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
