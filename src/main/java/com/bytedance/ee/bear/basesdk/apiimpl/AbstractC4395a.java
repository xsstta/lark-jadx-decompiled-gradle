package com.bytedance.ee.bear.basesdk.apiimpl;

import com.bytedance.ee.bear.basesdk.IDocInit;
import com.bytedance.ee.bear.basesdk.api.AbstractC4375a;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.service.C10929e;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.a */
public abstract class AbstractC4395a implements AbstractC4375a {

    /* renamed from: a */
    protected C10929e f13003a;

    /* renamed from: b */
    protected IDocInit f13004b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4375a
    /* renamed from: a */
    public void mo17019a(String str) {
        this.f13004b.mo16961a(str);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4375a
    /* renamed from: a */
    public void mo17018a(DocDynamicConfig docDynamicConfig) {
        this.f13004b.mo16960a(docDynamicConfig);
        C7745a.m31021a(docDynamicConfig.mo20227d().mo20246a());
    }

    public AbstractC4395a(C10929e eVar, IDocInit iDocInit) {
        this.f13003a = eVar;
        this.f13004b = iDocInit;
    }
}
