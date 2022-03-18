package com.larksuite.component.openplatform.plugins.device;

import android.content.Context;
import android.os.BatteryManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;

public class GetBatteryInfoPlugin extends AbstractC25889a {

    public static class GetBatteryInfoResponse extends C25921b {
        @JSONField(name = "level")
        public String level;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private GetBatteryInfoResponse makeSuccessResponse(String str) {
        GetBatteryInfoResponse getBatteryInfoResponse = new GetBatteryInfoResponse();
        getBatteryInfoResponse.level = str;
        return getBatteryInfoResponse;
    }

    @LKPluginFunction(eventName = {"getBatteryInfoSync"})
    public GetBatteryInfoResponse getBatteryInfo(AbstractC25905b bVar) {
        try {
            return getBatteryInfo(bVar, (AbstractC25897h<GetBatteryInfoResponse>) null);
        } catch (Exception e) {
            GetBatteryInfoResponse getBatteryInfoResponse = new GetBatteryInfoResponse();
            fillFailedResponse(getBatteryInfoResponse, C25906a.f64080j, C25611a.m91379a(e));
            return getBatteryInfoResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getBatteryInfo"})
    public void getBatteryInfo(AbstractC25897h<GetBatteryInfoResponse> hVar, AbstractC25905b bVar) {
        try {
            getBatteryInfo(bVar, hVar);
        } catch (Exception e) {
            GetBatteryInfoResponse getBatteryInfoResponse = new GetBatteryInfoResponse();
            fillFailedResponse(getBatteryInfoResponse, C25906a.f64080j, C25611a.m91379a(e));
            hVar.callback(getBatteryInfoResponse);
        }
    }

    private GetBatteryInfoResponse getBatteryInfo(AbstractC25905b bVar, AbstractC25897h<GetBatteryInfoResponse> hVar) {
        Context a = bVar.mo92207a();
        GetBatteryInfoResponse getBatteryInfoResponse = new GetBatteryInfoResponse();
        if (a != null) {
            BatteryManager batteryManager = (BatteryManager) a.getSystemService("batterymanager");
            if (batteryManager != null) {
                int intProperty = batteryManager.getIntProperty(4);
                if (hVar != null) {
                    hVar.callback(makeSuccessResponse(String.valueOf(intProperty)));
                }
                return makeSuccessResponse(String.valueOf(intProperty));
            }
            if (hVar != null) {
                fillFailedResponse(getBatteryInfoResponse, C25906a.f64080j, String.format("%s is null", "context"));
                hVar.callback(getBatteryInfoResponse);
            }
            return getBatteryInfoResponse;
        }
        if (hVar != null) {
            fillFailedResponse(getBatteryInfoResponse, C25906a.f64080j, String.format("%s is null", "batteryManager"));
            hVar.callback(getBatteryInfoResponse);
        }
        return getBatteryInfoResponse;
    }
}
