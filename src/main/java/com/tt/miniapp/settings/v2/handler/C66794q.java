package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.tt.miniapp.settings.v2.handler.q */
public class C66794q extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66794q> f168534a = new AbstractC12790g<C66794q>() {
        /* class com.tt.miniapp.settings.v2.handler.C66794q.C667951 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66794q mo48227b(Context... contextArr) {
            return new C66794q();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "loggerDebug";
    }

    /* renamed from: a */
    public static final C66794q m260664a() {
        return f168534a.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        try {
            boolean parseBoolean = Boolean.parseBoolean(str);
            C12782a.m52835a("loggerDebug", parseBoolean);
            AppBrandLogger.m52830i("LoggerDebugSettingHandl", "log debug :" + parseBoolean);
        } catch (Exception e) {
            AppBrandLogger.m52829e("LoggerDebugSettingHandl", "saveSettingFromRemote->", "loggerDebug", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return String.valueOf(C12782a.m52839b(str, Boolean.parseBoolean(str2)));
    }
}
