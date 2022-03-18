package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.config.mina.v2.C12752g;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.ac */
public class C66761ac extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66761ac> f168512a = new AbstractC12790g<C66761ac>() {
        /* class com.tt.miniapp.settings.v2.handler.C66761ac.C667621 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66761ac mo48227b(Context... contextArr) {
            return new C66761ac();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "webStorageWhiteList";
    }

    /* renamed from: a */
    public static final C66761ac m260594a() {
        return f168512a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("key_local_storage", str);
    }

    /* renamed from: a */
    public boolean mo232667a(String str) {
        return C12752g.m52755a(str, getSettingFromLocal("key_local_storage", ""), false);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
