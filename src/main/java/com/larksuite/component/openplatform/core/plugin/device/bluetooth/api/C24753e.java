package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import io.reactivex.functions.Consumer;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.e */
public class C24753e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openBluetoothAdapter";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C24753e() {
    }

    /* renamed from: b */
    private void m89816b() {
        C12792j.m52871a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24753e.RunnableC247541 */

            public void run() {
                C51331a aVar = new C51331a(C24753e.this.getAppContext().getCurrentActivity());
                if (aVar.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
                    C24753e.this.mo87766a();
                    return;
                }
                AppBrandLogger.m52830i("ApiHandler", "openBluetoothAdapter, request permission");
                aVar.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer<Boolean>() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.C24753e.RunnableC247541.C247551 */

                    /* renamed from: a */
                    public void accept(Boolean bool) throws Exception {
                        AppBrandLogger.m52830i("ApiHandler", "openBluetooth, permission granted: ", bool);
                        if (bool.booleanValue()) {
                            C24753e.this.mo87766a();
                            return;
                        }
                        AppBrandLogger.m52831w("ApiHandler", "openBluetoothAdapter, permission denied");
                        C24753e.this.callbackFail(C24758b.m89822a(UpdateDialogStatusCode.DISMISS, "not available", 3));
                    }
                });
            }
        });
    }

    /* renamed from: d */
    private void m89818d() {
        C24737a.m89797a(getAppContext()).mo87735a();
        callbackOk(C24758b.m89823a(BluetoothError.BLUETOOTH_API_NO_ERROR));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("BluetoothTAG", "act openBluetoothAdapter");
        m89816b();
    }

    /* renamed from: c */
    private boolean m89817c() {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
            return true;
        }
        AppBrandLogger.m52829e("ApiHandler", "tryOpenBluetooth, cur activity is null");
        return false;
    }

    /* renamed from: a */
    public void mo87766a() {
        AppBrandLogger.m52830i("BluetoothTAG", "openBluetooth permission allow");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            AppBrandLogger.m52829e("ApiHandler", "initBluetooth, adapter is null");
            m89815a(2);
            return;
        }
        C24737a.m89797a(getAppContext()).mo87743f();
        if (defaultAdapter.isEnabled()) {
            m89818d();
        } else if (!m89817c()) {
            m89815a(4);
        }
    }

    /* renamed from: a */
    private void m89815a(int i) {
        callbackFail(C24758b.m89824a(BluetoothError.BLUETOOTH_API_DEVICE_NOT_AVAILABLE, i));
    }

    public C24753e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.handleActivityResult(i, i2, intent);
        }
        AppBrandLogger.m52830i("ApiHandler", "handleActivityResult, resultCode: ", Integer.valueOf(i2));
        if (i2 == -1) {
            m89818d();
        } else {
            m89815a(5);
        }
        return true;
    }
}
