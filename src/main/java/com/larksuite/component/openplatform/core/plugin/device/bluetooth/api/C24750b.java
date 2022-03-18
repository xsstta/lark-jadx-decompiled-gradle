package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.bluetooth.le.ScanResult;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.b */
public class C24750b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBluetoothDevices";
    }

    public C24750b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act getBluetoothDevices");
        if (C24758b.m89828a(this, getAppContext())) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, ScanResult> entry : C24737a.m89797a(getAppContext()).mo87742e().entrySet()) {
                ScanResult value = entry.getValue();
                if (value != null) {
                    jSONArray.put(C24758b.m89827a(value));
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("devices", jSONArray);
                callbackOk(jSONObject);
                AppBrandLogger.m52830i("ApiHandler", "getBluetoothDevices result" + jSONObject.toString());
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiHandler", "build json result error: " + e.getMessage(), e);
            }
        }
    }

    public C24750b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
