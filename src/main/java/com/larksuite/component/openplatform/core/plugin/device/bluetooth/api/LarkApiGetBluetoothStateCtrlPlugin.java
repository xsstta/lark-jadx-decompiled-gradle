package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import android.bluetooth.BluetoothAdapter;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24759c;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25907b;

public class LarkApiGetBluetoothStateCtrlPlugin extends BluetoothBaseOPPlugin {

    private static class LarkApiGetBluetoothStateCtrlRequest extends C25920a {
        private LarkApiGetBluetoothStateCtrlRequest() {
        }
    }

    private static class LarkApiGetBluetoothStateCtrlResponse extends C25921b {
        @JSONField(name = "available")
        public boolean available;
        @JSONField(name = "discovering")
        public boolean discovering;
        @JSONField(name = "state")
        public int state;

        private LarkApiGetBluetoothStateCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.component.openplatform.core.plugin.device.bluetooth.api.BluetoothBaseOPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getBluetoothAdapterState"})
    public void LarkApiGetBluetoothStateCtrlAsync(LKEvent lKEvent, LarkApiGetBluetoothStateCtrlRequest larkApiGetBluetoothStateCtrlRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiGetBluetoothStateCtrlResponse> hVar) {
        this.mInvokeCallback = hVar;
        LarkApiGetBluetoothStateCtrlResponse larkApiGetBluetoothStateCtrlResponse = new LarkApiGetBluetoothStateCtrlResponse();
        AppBrandLogger.m52830i("LarkApiGetBluetoothStateCtrlPlugin_BluetoothTAG", "act getBluetoothAdapterState");
        if (!C24759c.m89831a(getAppContext())) {
            callbackResponse(fillResponse(larkApiGetBluetoothStateCtrlResponse, C25907b.f64096h));
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            AppBrandLogger.m52829e("LarkApiGetBluetoothStateCtrlPlugin_BluetoothTAG", "getBluetoothAdapterState, adapter is null");
            LarkApiGetBluetoothStateCtrlResponse larkApiGetBluetoothStateCtrlResponse2 = (LarkApiGetBluetoothStateCtrlResponse) fillResponse(larkApiGetBluetoothStateCtrlResponse, C25907b.f64097i);
            larkApiGetBluetoothStateCtrlResponse2.state = 2;
            callbackResponse(larkApiGetBluetoothStateCtrlResponse2);
            return;
        }
        LarkApiGetBluetoothStateCtrlResponse larkApiGetBluetoothStateCtrlResponse3 = (LarkApiGetBluetoothStateCtrlResponse) fillResponse(larkApiGetBluetoothStateCtrlResponse, C25907b.f64095g);
        larkApiGetBluetoothStateCtrlResponse3.available = defaultAdapter.isEnabled();
        larkApiGetBluetoothStateCtrlResponse3.discovering = C24737a.m89797a(getAppContext()).mo87741d();
        callbackResponse(larkApiGetBluetoothStateCtrlResponse3);
    }
}
