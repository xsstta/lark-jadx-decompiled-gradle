package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import android.os.BatteryManager;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.h */
public class C24837h extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getBatteryInfoSync";
    }

    public C24837h() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        Activity currentActivity = mo232455f().getCurrentActivity();
        if (currentActivity == null) {
            return mo232451b(ApiCallResultHelper.generateDataNullExtraInfo("activity"));
        }
        BatteryManager batteryManager = (BatteryManager) currentActivity.getSystemService("batterymanager");
        if (batteryManager == null) {
            return mo232451b(ApiCallResultHelper.generateDataNullExtraInfo("batteryManager"));
        }
        int intProperty = batteryManager.getIntProperty(4);
        HashMap hashMap = new HashMap();
        hashMap.put("level", String.valueOf(intProperty));
        return mo232446a(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    public C24837h(String str) {
        super(str);
    }
}
