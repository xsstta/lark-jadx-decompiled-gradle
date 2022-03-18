package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.h */
public class C66775h extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66775h> f168520a = new AbstractC12790g<C66775h>() {
        /* class com.tt.miniapp.settings.v2.handler.C66775h.C667761 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66775h mo48227b(Context... contextArr) {
            return new C66775h();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "debug";
    }

    /* renamed from: a */
    public static final C66775h m260622a() {
        return f168520a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        try {
            C12782a.m52835a("key_debug", Boolean.parseBoolean(str));
        } catch (Exception e) {
            AppBrandLogger.m52829e("DebugSettingHandler", "saveSettingFromRemote:", "debug", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return String.valueOf(C12782a.m52839b(str, Boolean.parseBoolean(str2)));
    }
}
