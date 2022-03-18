package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import android.app.Application;
import com.bytedance.ee.bear.service.AbstractC10933f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.a */
public abstract class AbstractC12447a implements AbstractC10933f, AbstractC10957d, AbstractC12448b {

    /* renamed from: a */
    private C10917c f33385a = new C10917c(new C10929e());

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
        return new Class[]{AbstractC12448b.class, WikiDataServiceLinker.class, WikiDataServiceProxy.class};
    }
}
