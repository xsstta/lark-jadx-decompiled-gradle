package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import org.json.JSONException;
import org.json.JSONObject;

public class NfcGetSakAsyncPlugin extends NfcApiAsyncBasePlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public String getNfcTech() {
        return "NFC-A";
    }

    @LKPluginFunction(async = true, eventName = {"nfcGetSak"})
    public void nfcGetSak(LKEvent lKEvent, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel) {
        handleAPI(lKEvent, nfcApiRequestModel);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public void execute(AbstractC67731b bVar, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel, LKEvent lKEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sak", (int) bVar.mo87901g());
            callbackOk(jSONObject, lKEvent);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("NfcGetSakAsyncPlugin", "json error", e);
            callbackFail("json error", lKEvent);
        }
    }
}
