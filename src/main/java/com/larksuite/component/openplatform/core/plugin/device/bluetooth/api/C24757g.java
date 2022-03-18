package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.g */
public class C24757g extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "stopBluetoothDevicesDiscovery";
    }

    public C24757g() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act stopBluetoothDevicesDiscovery");
        if (C24758b.m89828a(this, getAppContext())) {
            if (C24737a.m89797a(getAppContext()).mo87745h()) {
                callbackOk(C24758b.m89821a(0, "ok"));
            } else {
                callbackFail(C24758b.m89821a((int) UpdateDialogStatusCode.DISMISS, "not available"));
            }
        }
    }

    public C24757g(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
