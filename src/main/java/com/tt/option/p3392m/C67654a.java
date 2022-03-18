package com.tt.option.p3392m;

import com.bytedance.ee.lark.infra.network.p628c.p629a.C12824b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12825c;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3301m.C66332d;
import com.tt.option.AbstractC67593a;
import com.tt.option.p3392m.AbstractC67655b;

/* renamed from: com.tt.option.m.a */
public class C67654a extends AbstractC67593a<AbstractC67655b> implements AbstractC67655b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67655b mo232057b() {
        return new C66332d();
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12827e convertMetaRequest(C12827e eVar) {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).convertMetaRequest(eVar);
        }
        return eVar;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doGet(C12827e eVar, IAppContext iAppContext) throws Exception {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).doGet(eVar, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostBody(C12827e eVar, IAppContext iAppContext) throws Exception {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).doPostBody(eVar, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doPostUrlEncoded(C12827e eVar, IAppContext iAppContext) throws Exception {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).doPostUrlEncoded(eVar, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f doRequest(C12827e eVar, IAppContext iAppContext) throws Exception {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).doRequest(eVar, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12830f postMultiPart(C12827e eVar, IAppContext iAppContext) throws Exception {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).postMultiPart(eVar, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3392m.AbstractC67655b
    public C12825c downloadFile(C12824b bVar, AbstractC67655b.AbstractC67656a aVar, IAppContext iAppContext) throws Exception {
        if (mo234790c()) {
            return ((AbstractC67655b) this.f170423a).downloadFile(bVar, aVar, iAppContext);
        }
        return null;
    }
}
