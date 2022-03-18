package com.ss.android.lark.integrator.ccm.dependency;

import android.app.Application;
import com.bytedance.ee.bear.basesdk.AbstractC4463c;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4433s;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a */
public final class C39278a implements AbstractC4429o {

    /* renamed from: a */
    private final Application f100614a = LarkContext.getApplication();

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public Application application() {
        return this.f100614a;
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public AbstractC4433s dependency() {
        return new C39348e();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public AbstractC4463c docBaseConfig() {
        return new C39346c();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public DocDynamicConfig docDynamicConfig() {
        return C39347d.m155095a();
    }
}
