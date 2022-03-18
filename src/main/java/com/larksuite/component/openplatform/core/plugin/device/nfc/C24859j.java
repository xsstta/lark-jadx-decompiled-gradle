package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"nfcSetTimeout"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.j */
public class C24859j extends AbstractC24847b {
    public C24859j() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcSetTimeout");
    }

    public C24859j(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b
    /* renamed from: a */
    public void mo87902a(AbstractC67731b bVar, C67701b bVar2) {
        try {
            bVar.mo87894a(((Integer) bVar2.mo234984a("timeout")).intValue());
            mo230494j();
        } catch (Exception e) {
            AppBrandLogger.m52829e("NfcSetTimeoutAsyncHandler", "", e);
            mo230486a(e);
        }
    }
}
