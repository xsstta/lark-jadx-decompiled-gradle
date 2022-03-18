package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.y */
public class C66810y extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66810y> f168545a = new AbstractC12790g<C66810y>() {
        /* class com.tt.miniapp.settings.v2.handler.C66810y.C668111 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66810y mo48227b(Context... contextArr) {
            return new C66810y();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "snapshot_config";
    }

    /* renamed from: a */
    public static final C66810y m260694a() {
        return f168545a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo232718b() {
        return getSettingFromLocal("snapshot_config", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("snapshot_config", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
