package com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.p1127a;

import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24526a;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24541e;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a.a.a */
public class C24515a extends AbstractC24526a {

    /* renamed from: a */
    private IAppContext f60456a;

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24526a
    /* renamed from: a */
    public AbstractC24541e mo87377a() {
        return new C24519d();
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24526a
    /* renamed from: b */
    public AbstractC24527b mo87378b() {
        return new C24516b(this.f60456a);
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24526a
    /* renamed from: c */
    public AbstractC24537c mo87379c() {
        return new C24517c(this.f60456a);
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24526a
    /* renamed from: d */
    public IMonitorCreator mo87380d() {
        return new GadgetMonitorCreator(this.f60456a);
    }

    public C24515a(IAppContext iAppContext) {
        this.f60456a = iAppContext;
    }
}
