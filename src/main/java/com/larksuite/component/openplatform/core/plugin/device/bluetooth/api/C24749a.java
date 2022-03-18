package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.a */
public class C24749a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "closeBluetoothAdapter";
    }

    public C24749a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act closeBluetoothAdapter");
        C24737a.m89797a(getAppContext()).mo87739b();
        callbackOk(C24758b.m89821a(0, "ok"));
    }

    public C24749a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
