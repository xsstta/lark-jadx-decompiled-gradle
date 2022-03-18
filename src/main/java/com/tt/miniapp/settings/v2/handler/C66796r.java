package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.r */
public class C66796r extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66796r> f168535a = new AbstractC12790g<C66796r>() {
        /* class com.tt.miniapp.settings.v2.handler.C66796r.C667971 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66796r mo48227b(Context... contextArr) {
            return new C66796r();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "openSchemaWhiteList";
    }

    /* renamed from: a */
    public static final C66796r m260667a() {
        return f168535a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("openSchemaWhiteList", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
