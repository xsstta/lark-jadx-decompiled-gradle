package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25907b;

public class LarkApiCloseBluetoothCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiCloseBluetoothCtrlRequest extends C25920a {
        private LarkApiCloseBluetoothCtrlRequest() {
        }
    }

    private static class LarkApiCloseBluetoothCtrlResponse extends C25921b {
        private LarkApiCloseBluetoothCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"closeBluetoothAdapter"})
    public void LarkApiCloseBluetoothCtrlAsync(LKEvent lKEvent, LarkApiCloseBluetoothCtrlRequest larkApiCloseBluetoothCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiCloseBluetoothCtrlResponse> hVar) {
        this.mInvokeCallback = hVar;
        AppBrandLogger.m52830i("BluetoothTAGLarkApiCloseBluetoothCtrlPlugin_BluetoothTAG", "act closeBluetoothAdapter");
        C24737a.m89797a(getAppContext()).mo87739b();
        callbackResponse((LarkApiCloseBluetoothCtrlResponse) fillResponse(new LarkApiCloseBluetoothCtrlResponse(), C25907b.f64095g));
    }
}
