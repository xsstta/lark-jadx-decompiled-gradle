package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import java.util.Collections;
import java.util.List;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"nfcGetAtqa"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.f */
public class C24852f extends AbstractC24847b {
    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b
    /* renamed from: b */
    public String mo87903b() {
        return "NFC-A";
    }

    public C24852f() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcGetAtqa");
    }

    public C24852f(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b
    /* renamed from: a */
    public void mo87902a(AbstractC67731b bVar, C67701b bVar2) {
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] f = bVar.mo87900f();
            String str = null;
            if (f != null && f.length > 0) {
                str = ByteString.of(f).base64();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            jSONObject2.put("base64", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("__nativeBuffers__", jSONArray);
            mo230492b(jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("NfcGetAtqaAsyncHandler", "", e);
            mo230486a(e);
        }
    }
}
