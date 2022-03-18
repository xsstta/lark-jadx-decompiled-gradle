package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import android.os.BatteryManager;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.a */
public class C24724a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBatteryInfo";
    }

    public C24724a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("activity"));
            return;
        }
        BatteryManager batteryManager = (BatteryManager) currentActivity.getSystemService("batterymanager");
        if (batteryManager != null) {
            int intProperty = batteryManager.getIntProperty(4);
            HashMap hashMap = new HashMap();
            hashMap.put("level", String.valueOf(intProperty));
            callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
            return;
        }
        callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("batteryManager"));
    }

    public C24724a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
