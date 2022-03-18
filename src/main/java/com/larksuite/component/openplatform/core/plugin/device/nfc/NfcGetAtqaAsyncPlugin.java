package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NfcGetAtqaAsyncPlugin extends NfcApiAsyncBasePlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public String getNfcTech() {
        return "NFC-A";
    }

    @LKPluginFunction(async = true, eventName = {"nfcGetAtqa"})
    public void nfcGetAtqa(LKEvent lKEvent, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel) {
        handleAPI(lKEvent, nfcApiRequestModel);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public void execute(AbstractC67731b bVar, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel, LKEvent lKEvent) {
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
            callbackOk(jSONObject, lKEvent);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("NfcGetAtqaAsyncPlugin", "", e);
            callbackFail(e.getMessage(), lKEvent);
        }
    }
}
