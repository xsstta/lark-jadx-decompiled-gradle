package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.util.Base64;
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

@ApiSupportType(apiName = {"nfcTransceive"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.m */
public class C24863m extends AbstractC24847b {
    public C24863m() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("nfcTransceive");
    }

    public C24863m(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.AbstractC24847b
    /* renamed from: a */
    public void mo87902a(AbstractC67731b bVar, C67701b bVar2) {
        JSONArray jSONArray = (JSONArray) bVar2.mo234984a("__nativeBuffers__");
        if (jSONArray == null) {
            AppBrandLogger.m52830i("NfcMaxTransAsyncHandler", "data is null");
            mo230493c("data is null");
            return;
        }
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject == null) {
                AppBrandLogger.m52830i("NfcMaxTransAsyncHandler", "arraybuffer is empty");
                mo230493c("arraybuffer is empty");
                return;
            }
            byte[] decode = Base64.decode(jSONObject.optString("base64"), 0);
            if (decode == null) {
                AppBrandLogger.m52830i("NfcMaxTransAsyncHandler", "key or data is empty");
                mo230493c("key or data is empty");
                return;
            }
            byte[] a = bVar.mo87895a(decode);
            if (a != null) {
                String str = null;
                if (a != null && a.length > 0) {
                    str = ByteString.of(a).base64();
                }
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                jSONObject3.put("base64", str);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject3);
                jSONObject2.put("__nativeBuffers__", jSONArray2);
                mo230492b(jSONObject2);
            } else if (!bVar.mo87899e()) {
                AppBrandLogger.m52830i("NfcMaxTransAsyncHandler", "call connect first");
                mo230493c("call connect first");
            } else {
                AppBrandLogger.m52830i("NfcMaxTransAsyncHandler", "resultData is null");
                mo230493c("resultData is null");
            }
        } catch (JSONException e) {
            mo230493c("data is error");
            AppBrandLogger.m52829e("NfcMaxTransAsyncHandler", "data is error", e);
        }
    }
}
