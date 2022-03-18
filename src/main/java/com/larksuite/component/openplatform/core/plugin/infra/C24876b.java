package com.larksuite.component.openplatform.core.plugin.infra;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"getSystemInfo"}, support = {AppType.WebAPP, AppType.CardAPP}, testSupport = {AppType.GadgetAPP, AppType.WebGadgetAPP, AppType.CardAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.b */
public class C24876b extends AbstractC65797c {
    public C24876b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getSystemInfo");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        try {
            mo230492b(C24888e.m90070a(mo230473f()));
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", "getSystemInfo fail:", e.getMessage());
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
        }
    }

    public C24876b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
