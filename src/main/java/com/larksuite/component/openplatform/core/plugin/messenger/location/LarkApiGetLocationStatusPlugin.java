package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.content.Context;
import android.location.LocationManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;

public class LarkApiGetLocationStatusPlugin extends OPPlugin {

    private static class LarkApiGetLocationStatusResponse extends C25921b {
        @JSONField(name = "gpsStatus")
        public String gpsStatus;

        private LarkApiGetLocationStatusResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private boolean checkGPSIsOpen(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps");
        }
        return false;
    }

    @LKPluginFunction(async = true, eventName = {"getLocationStatus"})
    public void getLocationStatusAsync(AbstractC25895f fVar, AbstractC25897h<LarkApiGetLocationStatusResponse> hVar) {
        boolean z;
        LarkApiGetLocationStatusResponse larkApiGetLocationStatusResponse = new LarkApiGetLocationStatusResponse();
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            boolean checkGPSIsOpen = checkGPSIsOpen(AppbrandContext.getInst().getApplicationContext());
            if (!C66588h.m260183a().mo232195a(AppbrandContext.getInst().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") || !C66588h.m260183a().mo232195a(AppbrandContext.getInst().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z = false;
            } else {
                z = true;
            }
            boolean a = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50179a(12, false);
            if (!checkGPSIsOpen || !z || !a) {
                larkApiGetLocationStatusResponse.gpsStatus = "off";
            } else {
                larkApiGetLocationStatusResponse.gpsStatus = "on";
            }
            hVar.callback(larkApiGetLocationStatusResponse);
            ILogger b = fVar.mo92190b();
            b.mo92224i("LarkApiGetLocationStatus", "gps state:" + larkApiGetLocationStatusResponse.gpsStatus, "system permission:" + z, "app permission:" + a, "gps is open:" + checkGPSIsOpen);
            return;
        }
        larkApiGetLocationStatusResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
        larkApiGetLocationStatusResponse.mErrorMessage = "context is null";
        hVar.callback(larkApiGetLocationStatusResponse);
        fVar.mo92190b().mo92223e("LarkApiGetLocationStatus", "GetLocationStatus:", "context is null");
    }
}
