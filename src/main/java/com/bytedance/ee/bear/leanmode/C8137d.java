package com.bytedance.ee.bear.leanmode;

import android.app.Application;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5196a;
import com.bytedance.ee.bear.contract.leanmode.CCMConfig;

/* renamed from: com.bytedance.ee.bear.leanmode.d */
public class C8137d extends AbstractC5196a {
    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.leanmode.AbstractC5196a, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
        super.lazyInit(application);
    }

    @Override // com.bytedance.ee.bear.contract.leanmode.AbstractC5198c
    public void syncCCMConfig(CCMConfig cCMConfig) {
        C8132a.m32450a().mo31328a(cCMConfig);
    }
}
