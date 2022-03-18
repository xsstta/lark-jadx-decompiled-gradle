package com.larksuite.component.openplatform.infra.p1140c.p1141a;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.larksuite.component.openplatform.infra.c.a.a */
public class C25534a extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C25534a> f62172a = new AbstractC12790g<C25534a>() {
        /* class com.larksuite.component.openplatform.infra.p1140c.p1141a.C25534a.C255351 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C25534a mo48227b(Context... contextArr) {
            return new C25534a();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "getLocation_api_downgrade_config";
    }

    /* renamed from: a */
    public static final C25534a m91180a() {
        return f62172a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo88676b() {
        return getSettingFromLocal("getLocation_api_downgrade_config", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("LocationAPISettingHandler", "saveSettingFromRemote:" + str);
        C12782a.m52834a("getLocation_api_downgrade_config", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
