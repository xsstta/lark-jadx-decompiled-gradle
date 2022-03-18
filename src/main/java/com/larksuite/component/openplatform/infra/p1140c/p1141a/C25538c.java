package com.larksuite.component.openplatform.infra.p1140c.p1141a;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.larksuite.component.openplatform.infra.c.a.c */
public class C25538c extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C25538c> f62174a = new AbstractC12790g<C25538c>() {
        /* class com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c.C255391 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C25538c mo48227b(Context... contextArr) {
            return new C25538c();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "optrace_batch_config";
    }

    /* renamed from: a */
    public static final C25538c m91188a() {
        return f62174a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public String mo88680b() {
        return getSettingFromLocal("optrace_batch_config", "");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("OPTraceSettingHandler", "saveSettingFromRemote:" + str);
        C12782a.m52834a("optrace_batch_config", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
