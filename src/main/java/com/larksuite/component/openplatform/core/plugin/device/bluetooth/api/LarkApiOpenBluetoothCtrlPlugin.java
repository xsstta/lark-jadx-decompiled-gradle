package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKIncludeWithFailData;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

public class LarkApiOpenBluetoothCtrlPlugin extends BluetoothBaseOPPlugin {

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.LarkApiOpenBluetoothCtrlPlugin$a */
    public enum EnumC24746a {
        UNKNOWN,
        RESETTING,
        NOT_SUPPORT,
        UNAUTHORIZED,
        NOT_OPEN,
        OPEN_FAILED
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    private static class LarkApiOpenBluetoothCtrlRequest extends C25920a {
        private LarkApiOpenBluetoothCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    @LKIncludeWithFailData
    public static class LarkApiOpenBluetoothCtrlResponse extends C25921b {
        @JSONField(name = "state")
        public int state;

        private LarkApiOpenBluetoothCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void checkPermission() {
        C12792j.m52871a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.$$Lambda$LarkApiOpenBluetoothCtrlPlugin$vzfRgukINEaPChLROV9SyMkFys8 */

            public final void run() {
                LarkApiOpenBluetoothCtrlPlugin.this.lambda$checkPermission$1$LarkApiOpenBluetoothCtrlPlugin();
            }
        });
    }

    private void returnOk() {
        C24737a.m89797a(getAppContext()).mo87735a();
        callbackResponse((LarkApiOpenBluetoothCtrlResponse) fillResponse(new LarkApiOpenBluetoothCtrlResponse(), C25907b.f64095g));
    }

    private boolean tryOpenBluetooth() {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
            AbstractC12888c i = C25529d.m91168i(getAppContext());
            if (i != null) {
                i.startActivityForResult(intent, 1);
            } else {
                currentActivity.startActivityForResult(intent, 1);
            }
            return true;
        }
        AppBrandLogger.m52829e("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "tryOpenBluetooth, cur activity is null");
        return false;
    }

    public /* synthetic */ void lambda$checkPermission$1$LarkApiOpenBluetoothCtrlPlugin() {
        C51331a aVar = new C51331a(getAppContext().getCurrentActivity());
        new LarkApiOpenBluetoothCtrlResponse();
        if (aVar.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
            initBluetooth();
            return;
        }
        AppBrandLogger.m52830i("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "openBluetoothAdapter, request permission");
        aVar.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer() {
            /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.$$Lambda$LarkApiOpenBluetoothCtrlPlugin$mvJLJ1KrgOwlD4HCURNsPeDS2kU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LarkApiOpenBluetoothCtrlPlugin.this.lambda$null$0$LarkApiOpenBluetoothCtrlPlugin((Boolean) obj);
            }
        });
    }

    private void initBluetooth() {
        AppBrandLogger.m52830i("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "openBluetooth permission allow");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            AppBrandLogger.m52829e("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "initBluetooth, adapter is null");
            returnFailed(EnumC24746a.NOT_SUPPORT);
            return;
        }
        C24737a.m89797a(getAppContext()).mo87743f();
        if (defaultAdapter.isEnabled()) {
            returnOk();
        } else if (!tryOpenBluetooth()) {
            returnFailed(EnumC24746a.NOT_OPEN);
        }
    }

    private void returnFailed(EnumC24746a aVar) {
        LarkApiOpenBluetoothCtrlResponse larkApiOpenBluetoothCtrlResponse = (LarkApiOpenBluetoothCtrlResponse) fillResponse(new LarkApiOpenBluetoothCtrlResponse(), C25907b.f64097i);
        larkApiOpenBluetoothCtrlResponse.state = aVar.ordinal();
        callbackResponse(larkApiOpenBluetoothCtrlResponse);
    }

    public /* synthetic */ void lambda$null$0$LarkApiOpenBluetoothCtrlPlugin(Boolean bool) throws Exception {
        AppBrandLogger.m52830i("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "openBluetooth, permission granted: ", bool);
        if (bool.booleanValue()) {
            initBluetooth();
            return;
        }
        AppBrandLogger.m52831w("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "openBluetoothAdapter, permission denied");
        returnFailed(EnumC24746a.UNAUTHORIZED);
    }

    @LKPluginFunction(async = true, eventName = {"openBluetoothAdapter"})
    public void LarkApiOpenBluetoothCtrlAsync(LKEvent lKEvent, LarkApiOpenBluetoothCtrlRequest larkApiOpenBluetoothCtrlRequest, AbstractC25897h<LarkApiOpenBluetoothCtrlResponse> hVar) {
        AppBrandLogger.m52830i("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "act openBluetoothAdapter");
        this.mInvokeCallback = hVar;
        checkPermission();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.handleActivityResult(i, i2, intent);
        }
        AppBrandLogger.m52830i("LarkApiOpenBluetoothCtrlPlugin_BluetoothTAG", "handleActivityResult, resultCode: ", Integer.valueOf(i2));
        if (i2 == -1) {
            returnOk();
        } else {
            returnFailed(EnumC24746a.OPEN_FAILED);
        }
        return true;
    }
}
