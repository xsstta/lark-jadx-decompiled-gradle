package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import okio.ByteString;
import org.json.JSONException;

public class NfcTransceiveAsyncPlugin extends NfcApiAsyncBasePlugin {
    @LKPluginFunction(async = true, eventName = {"nfcTransceive"})
    public void nfcTransceive(LKEvent lKEvent, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel) {
        handleAPI(lKEvent, nfcApiRequestModel);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public void execute(AbstractC67731b bVar, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel, LKEvent lKEvent) {
        JSONArray jSONArray = nfcApiRequestModel.mNativeBuffers;
        if (jSONArray == null) {
            AppBrandLogger.m52830i("NfcTransceiveAsyncPlugin", "data is null");
            callbackFail("data is null", lKEvent);
            return;
        }
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject == null) {
                AppBrandLogger.m52830i("NfcTransceiveAsyncPlugin", "arraybuffer is empty");
                callbackFail("arraybuffer is empty", lKEvent);
                return;
            }
            byte[] decode = Base64.decode(jSONObject.getString("base64"), 0);
            if (decode == null) {
                AppBrandLogger.m52830i("NfcTransceiveAsyncPlugin", "key or data is empty");
                callbackFail("key or data is empty", lKEvent);
                return;
            }
            byte[] a = bVar.mo87895a(decode);
            if (a != null) {
                String str = null;
                if (a != null && a.length > 0) {
                    str = ByteString.of(a).base64();
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                jSONObject3.put("base64", str);
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                jSONArray2.put(jSONObject3);
                jSONObject2.put("__nativeBuffers__", jSONArray2);
                callbackOk(jSONObject2, lKEvent);
            } else if (!bVar.mo87899e()) {
                AppBrandLogger.m52830i("NfcTransceiveAsyncPlugin", "call connect first");
                callbackFail("call connect first", lKEvent);
            } else {
                AppBrandLogger.m52830i("NfcTransceiveAsyncPlugin", "resultData is null");
                callbackFail("resultData is null", lKEvent);
            }
        } catch (JSONException e) {
            callbackFail("data is error", lKEvent);
            AppBrandLogger.m52829e("NfcTransceiveAsyncPlugin", "data is error", e);
        }
    }
}
