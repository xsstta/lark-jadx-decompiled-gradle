package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"onGetWifiList"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.k */
public class C24829k extends AbstractC65797c {
    public C24829k() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("onGetWifiList");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        C24819e.m89919a().mo87856a(mo230473f(), mo230474g());
        mo230494j();
    }

    public C24829k(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
