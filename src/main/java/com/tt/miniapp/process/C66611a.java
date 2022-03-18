package com.tt.miniapp.process;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.p3322g.AbstractC66642a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tt.miniapp.process.a */
public class C66611a implements AbstractC66642a {

    /* renamed from: a */
    private static final List<String> f168181a = Arrays.asList("getUserInfo", "getLoginCookie", "getPlatformSession", "getNetCommonParams");

    /* renamed from: b */
    private HashMap<String, CrossProcessDataEntity> f168182b = new HashMap<>();

    /* renamed from: a */
    private boolean m260216a(String str) {
        return f168181a.contains(str);
    }

    @Override // com.tt.miniapp.process.p3322g.AbstractC66642a
    /* renamed from: a */
    public CrossProcessDataEntity mo232243a(String str, CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        if (m260216a(str)) {
            AppBrandLogger.m52828d("CacheCrossProcessDataInterceptor", "isEnableCacheCrossProcessData callType:", str, "crossProcessCallSuccess:", Boolean.valueOf(z));
            synchronized (this) {
                if (z) {
                    this.f168182b.put(str, crossProcessDataEntity);
                } else {
                    return this.f168182b.get(str);
                }
            }
        }
        return crossProcessDataEntity;
    }
}
