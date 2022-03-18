package com.larksuite.component.openplatform.core.component.p1115a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.AbstractC24362a;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.core.component.AbstractC24428a;
import com.larksuite.component.openplatform.core.component.C24436d;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.preload.PreloadManager;

/* renamed from: com.larksuite.component.openplatform.core.component.a.b */
public class C24433b extends AbstractC24428a implements AbstractC24432a {

    /* renamed from: g */
    private AppbrandFragment f60294g;

    @Override // com.larksuite.component.openplatform.core.component.p1115a.AbstractC24432a
    public void ac_() {
    }

    @Override // com.larksuite.component.openplatform.core.component.p1115a.AbstractC24432a
    public void ae_() {
    }

    @Override // com.larksuite.component.openplatform.core.component.p1115a.AbstractC24432a
    public void af_() {
    }

    @Override // com.larksuite.component.openplatform.core.component.AbstractC24428a
    /* renamed from: h */
    public AbstractC24364a mo87219h() {
        return null;
    }

    /* renamed from: i */
    public AppbrandFragment mo87228i() {
        m89117j();
        return this.f60294g;
    }

    @Override // com.larksuite.component.openplatform.core.component.p1115a.AbstractC24432a
    public void ad_() {
        if (this.f60284b != null && (this.f60284b.getAppContainer() instanceof AbstractC24469d)) {
            ((AbstractC24469d) this.f60284b.getAppContainer()).mo87287b((AbstractC24362a) this);
        }
    }

    @Override // com.larksuite.component.openplatform.core.component.AbstractC24428a, com.larksuite.component.openplatform.core.component.p1115a.AbstractC24432a, com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: f */
    public void mo87160f() {
        super.mo87160f();
        if (this.f60284b != null && (this.f60284b.getAppContainer() instanceof C24491h)) {
            ((C24491h) this.f60284b.getAppContainer()).mo87355c((AbstractC24362a) this);
        }
    }

    /* renamed from: j */
    private void m89117j() {
        if (this.f60294g == null) {
            AppbrandFragment takePreloadFragment = ((PreloadManager) AppbrandApplicationImpl.getInst(this.f60284b).getService(PreloadManager.class)).takePreloadFragment(this.f60284b.getCurrentActivity(), this.f60287e);
            this.f60294g = takePreloadFragment;
            takePreloadFragment.setLegacyLifecycleListener(this);
        }
    }

    public C24433b(C24436d dVar, IAppContext iAppContext) {
        super(dVar, iAppContext);
    }
}
