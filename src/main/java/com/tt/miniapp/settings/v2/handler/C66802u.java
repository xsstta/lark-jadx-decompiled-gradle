package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.u */
public class C66802u extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66802u> f168541a = new AbstractC12790g<C66802u>() {
        /* class com.tt.miniapp.settings.v2.handler.C66802u.C668031 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66802u mo48227b(Context... contextArr) {
            return new C66802u();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "preload";
    }

    /* renamed from: a */
    public static final C66802u m260678a() {
        return f168541a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232710b() {
        return C66784l.m260644a().mo232694b();
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("preload", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
