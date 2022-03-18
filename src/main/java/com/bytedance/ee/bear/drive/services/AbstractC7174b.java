package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import com.bytedance.ee.bear.service.AbstractC10933f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

/* renamed from: com.bytedance.ee.bear.drive.services.b */
public abstract class AbstractC7174b implements AbstractC7184l, AbstractC10933f, AbstractC10957d {

    /* renamed from: a */
    private C10917c f19298a = new C10917c(new C10929e());

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

    /* renamed from: c */
    public C10917c mo28168c() {
        return this.f19298a;
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10933f
    /* renamed from: a */
    public Class<?>[] mo16350a() {
        return new Class[]{AbstractC7184l.class, DriveServiceLinker.class, DriveServiceProxy.class};
    }
}
