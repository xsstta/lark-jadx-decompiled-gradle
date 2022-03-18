package com.tt.option.share;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3301m.C66339i;
import com.tt.option.AbstractC67593a;
import com.tt.option.share.AbstractC67678b;

/* renamed from: com.tt.option.share.a */
public class C67677a extends AbstractC67593a<AbstractC67678b> implements AbstractC67678b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67678b mo232057b() {
        return new C66339i();
    }

    @Override // com.tt.option.share.AbstractC67678b
    public ShareInfoModel obtainShareInfo() {
        if (mo234790c()) {
            return ((AbstractC67678b) this.f170423a).obtainShareInfo();
        }
        return null;
    }

    @Override // com.tt.option.share.AbstractC67678b
    public AbstractC67678b.AbstractC67679a obtainShareInfoCallback() {
        if (mo234790c()) {
            return ((AbstractC67678b) this.f170423a).obtainShareInfoCallback();
        }
        return null;
    }

    @Override // com.tt.option.share.AbstractC67678b
    public void getShareToken(ShareInfoModel shareInfoModel, AbstractC67682e eVar) {
        if (mo234790c()) {
            ((AbstractC67678b) this.f170423a).getShareToken(shareInfoModel, eVar);
        }
    }

    @Override // com.tt.option.share.AbstractC67678b
    public void getShareBaseInfo(String str, AbstractC67681d dVar, IAppContext iAppContext) {
        if (mo234790c()) {
            ((AbstractC67678b) this.f170423a).getShareBaseInfo(str, dVar, iAppContext);
        }
    }
}
