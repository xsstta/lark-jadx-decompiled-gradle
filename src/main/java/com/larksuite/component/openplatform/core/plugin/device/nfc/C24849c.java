package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"nfcClose"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.c */
public class C24849c extends AbstractC24847b {
    public C24849c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcClose");
    }

    public C24849c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b
    /* renamed from: a */
    public void mo87902a(AbstractC67731b bVar, C67701b bVar2) {
        if (bVar.mo87897c()) {
            mo230494j();
        } else {
            mo230493c("close error");
        }
    }
}
