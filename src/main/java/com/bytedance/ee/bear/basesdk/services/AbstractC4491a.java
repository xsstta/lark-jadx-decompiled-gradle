package com.bytedance.ee.bear.basesdk.services;

import android.app.Application;
import com.bytedance.ee.bear.service.AbstractC10933f;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

/* renamed from: com.bytedance.ee.bear.basesdk.services.a */
public abstract class AbstractC4491a implements AbstractC4501b, AbstractC10933f, AbstractC10957d {
    @Override // com.bytedance.ee.bear.service.AbstractC10933f
    /* renamed from: b */
    public Class<?>[] mo16351b() {
        return new Class[0];
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10933f
    /* renamed from: a */
    public Class<?>[] mo16350a() {
        return new Class[]{AbstractC4501b.class, DocsProcessServiceLinker.class, DocsProcessServiceProxy.class};
    }
}
