package com.larksuite.component.openplatform.core.plugin.infra;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"getSystemInfoSync"}, support = {AppType.WebAPP, AppType.CardAPP}, testSupport = {AppType.GadgetAPP, AppType.WebGadgetAPP, AppType.CardAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.d */
public class C24887d extends AbstractC65802d {
    public C24887d() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getSystemInfoSync");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        try {
            return mo230501a(C24888e.m90070a(mo230473f()));
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", "getSystemInfo fail:", e.getMessage());
            return mo230500a(e);
        }
    }

    public C24887d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
