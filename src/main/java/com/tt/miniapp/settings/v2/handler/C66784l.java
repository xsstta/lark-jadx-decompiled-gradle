package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.l */
public class C66784l extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66784l> f168526a = new AbstractC12790g<C66784l>() {
        /* class com.tt.miniapp.settings.v2.handler.C66784l.C667851 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66784l mo48227b(Context... contextArr) {
            return new C66784l();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "openplatform_gadget_preload";
    }

    /* renamed from: a */
    public static final C66784l m260644a() {
        return f168526a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232694b() {
        return getSettingFromLocal("openplatform_gadget_preload", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("openplatform_gadget_preload", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
