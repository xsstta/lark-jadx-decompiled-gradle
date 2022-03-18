package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.w */
public class C66806w extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66806w> f168543a = new AbstractC12790g<C66806w>() {
        /* class com.tt.miniapp.settings.v2.handler.C66806w.C668071 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66806w mo48227b(Context... contextArr) {
            return new C66806w();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "setCustomUserAgent";
    }

    /* renamed from: a */
    public static final C66806w m260686a() {
        return f168543a.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public String mo232714a(String str) {
        return getSettingFromLocal("key_set_custom_user_agent", str);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("key_set_custom_user_agent", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
