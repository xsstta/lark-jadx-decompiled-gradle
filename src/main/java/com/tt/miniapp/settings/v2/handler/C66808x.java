package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.x */
public class C66808x extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66808x> f168544a = new AbstractC12790g<C66808x>() {
        /* class com.tt.miniapp.settings.v2.handler.C66808x.C668091 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66808x mo48227b(Context... contextArr) {
            return new C66808x();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "shareOnlyLinkApps";
    }

    /* renamed from: a */
    public static final C66808x m260690a() {
        return f168544a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232716b() {
        return getSettingFromLocal("shareOnlyLinkApps", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52828d("ShareLinksSettingHandle", "shareOnlyLinkApps request done: " + str);
        C12782a.m52834a("shareOnlyLinkApps", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
