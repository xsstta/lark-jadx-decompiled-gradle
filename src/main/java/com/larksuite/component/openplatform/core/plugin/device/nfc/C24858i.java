package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"nfcMaxTransceiveLength"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.i */
public class C24858i extends AbstractC24847b {
    public C24858i() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcMaxTransceiveLength");
    }

    public C24858i(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b
    /* renamed from: a */
    public void mo87902a(AbstractC67731b bVar, C67701b bVar2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("length", bVar.mo87898d());
            mo230492b(jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("NfcMaxTransAsyncHandler", "", e);
            mo230486a(e);
        }
    }
}
