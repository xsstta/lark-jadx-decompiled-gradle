package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.ad */
public class C25338ad extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getHostLaunchQuerySync";
    }

    public C25338ad() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        String b = mo232454e().mo235039b();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("launchQuery", b);
        AppBrandLogger.m52830i("GetHostLaunchQuerySync", "getHostLaunchQuerySync " + hashMap);
        return mo232448a(true, hashMap, (String) null, (Throwable) null);
    }

    public C25338ad(String str) {
        super(str);
    }
}
