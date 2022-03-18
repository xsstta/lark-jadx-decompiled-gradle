package com.larksuite.component.openplatform.infra.p1140c.p1141a;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.larksuite.component.openplatform.infra.c.a.b */
public class C25536b extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C25536b> f62173a = new AbstractC12790g<C25536b>() {
        /* class com.larksuite.component.openplatform.infra.p1140c.p1141a.C25536b.C255371 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C25536b mo48227b(Context... contextArr) {
            return new C25536b();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "opmonitor_heartbeat_conifg";
    }

    /* renamed from: a */
    public static final C25536b m91184a() {
        return f62173a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo88678b() {
        return getSettingFromLocal("opmonitor_heartbeat_conifg", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("OPHeartBeatSettingHandler", "saveSettingFromRemote:" + str);
        C12782a.m52834a("opmonitor_heartbeat_conifg", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
