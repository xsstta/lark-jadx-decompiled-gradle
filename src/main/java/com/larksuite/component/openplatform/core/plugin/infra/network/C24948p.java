package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.NetworkUtil;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@ApiSupportType(apiName = {"getNetworkType"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.p */
public class C24948p extends AbstractC65797c {
    public C24948p() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getNetworkType");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", NetworkUtil.m264004a(mo230473f().getApplicationContext()));
        mo230492b(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    public C24948p(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
