package com.tt.miniapp.jsbridge;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.jsbridge.c */
public class C66238c extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66238c> f167191a = new AbstractC12790g<C66238c>() {
        /* class com.tt.miniapp.jsbridge.C66238c.C662391 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66238c mo48227b(Context... contextArr) {
            return new C66238c();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "async_api_dispatch_optimize";
    }

    /* renamed from: a */
    public static final C66238c m259236a() {
        return f167191a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("async_api_dispatch_optimize", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b("async_api_dispatch_optimize", "");
    }
}
