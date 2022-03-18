package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"setStorage"}, support = {AppType.WebAPP, AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.storage.i */
public class C24983i extends AbstractC65797c {
    public C24983i() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("setStorage");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        mo230480a(new C24984j(mo230472e(), mo230473f()).mo87217a(bVar));
    }

    public C24983i(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
