package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.net.wifi.WifiManager;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.i */
public class C24827i extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getWifiStatus";
    }

    public C24827i() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String str;
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            WifiManager wifiManager = (WifiManager) AppbrandContext.getInst().getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    str = "on";
                } else {
                    str = "off";
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(UpdateKey.STATUS, str);
                callbackOtherExtraMsg(true, hashMap);
                return;
            }
            callbackDefaultMsg(false);
            return;
        }
        callbackDefaultMsg(false);
    }

    public C24827i(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
