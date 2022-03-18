package com.bytedance.ee.bear.basesdk.apiimpl;

import com.bytedance.ee.bear.basesdk.api.AbstractC4389m;
import com.bytedance.ee.bear.contract.leanmode.CCMConfig;
import com.bytedance.ee.bear.leanmode.C8132a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.n */
public final class C4410n implements AbstractC4389m {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4389m
    /* renamed from: a */
    public void mo17073a(String str) {
        C13479a.m54764b("LeanModeImpl", "setCCMConfigLiveData()...");
        C8132a.m32450a().mo31328a(CCMConfig.m21211a(str));
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4389m
    /* renamed from: a */
    public void mo17072a(long j) {
        C13479a.m54764b("LeanModeImpl", "timingCleanData()...cacheDataTimeInMills = " + j);
        C8132a.m32450a().mo31327a(j * 1000);
    }
}
