package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.bluetooth.BluetoothAdapter;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.c */
public class C24751c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getBluetoothAdapterState";
    }

    public C24751c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act getBluetoothAdapterState");
        if (C24758b.m89828a(this, getAppContext())) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                AppBrandLogger.m52829e("ApiHandler", "getBluetoothAdapterState, adapter is null");
                callbackFail(C24758b.m89822a(UpdateDialogStatusCode.DISMISS, "not available", 2));
                return;
            }
            callbackOk(C24758b.m89826a(defaultAdapter, getAppContext()));
        }
    }

    public C24751c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
