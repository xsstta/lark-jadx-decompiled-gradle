package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67732c;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@ApiSupportType(apiName = {"nfcStopDiscovery"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.l */
public class C24862l extends AbstractC65797c {
    public C24862l() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcStopDiscovery");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AbstractC67730a aVar = (AbstractC67730a) mo230473f().findServiceByInterface(AbstractC67730a.class);
        if (aVar == null) {
            AppBrandLogger.m52830i("ApiHandler", "nfc service is null");
            mo230493c("nfc service is null");
            return;
        }
        aVar.mo87908a((AbstractC67732c) null);
        mo230494j();
        mo230475h().mo235028a(C67706e.C67708a.m263377a("nfcFoundDevice", new JSONObject()).mo235009a());
    }

    public C24862l(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
