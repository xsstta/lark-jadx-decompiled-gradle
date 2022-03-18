package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"createDownloadTask"}, support = {AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.j */
public class C24940j extends AbstractC65797c {

    /* renamed from: a */
    private C24941k f61067a;

    public C24940j() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("createDownloadTask");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (this.f61067a == null) {
            this.f61067a = new C24941k(mo230473f(), mo230475h());
        }
        this.f61067a.mo88028a(bVar);
    }

    public C24940j(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
