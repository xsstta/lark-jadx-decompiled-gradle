package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.f */
public class C24756f extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "startBluetoothDevicesDiscovery";
    }

    public C24756f() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act startBluetoothDevicesDiscovery");
        if (C24758b.m89828a(this, getAppContext())) {
            try {
                JSONObject jSONObject = new JSONObject(this.mArgs);
                if (C24737a.m89797a(getAppContext()).mo87738a(jSONObject.optJSONArray("services"), jSONObject.optBoolean("allowDuplicatesKey", false), jSONObject.optInt("interval", 0))) {
                    callbackOk(C24758b.m89821a(0, "ok"));
                } else {
                    callbackFail(C24758b.m89821a((int) UpdateDialogStatusCode.DISMISS, "not available"));
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("BluetoothTAG", "parse json error: " + e.getMessage() + ", args: " + this.mArgs, e);
                callbackFail("api args error");
            }
        }
    }

    public C24756f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
