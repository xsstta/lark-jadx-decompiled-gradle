package com.larksuite.component.openplatform.core.plugin.op;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

public class GetTimingSettingPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private static class GetTimingSettingRequest extends C25920a {
        private GetTimingSettingRequest() {
        }
    }

    private static class GetTimingSettingResponse extends C25921b {
        @JSONField(name = "interval")
        public int mInterval;
        @JSONField(name = "switch")
        public boolean mSwitch;
        @JSONField(name = "url")
        public String mUrl;

        private GetTimingSettingResponse() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"getTimingSettings"})
    public void getTimingSetting(LKEvent lKEvent, GetTimingSettingRequest getTimingSettingRequest, AbstractC25897h<GetTimingSettingResponse> hVar) {
        CrossProcessDataEntity i;
        JSONObject optJSONObject;
        GetTimingSettingResponse getTimingSettingResponse = new GetTimingSettingResponse();
        AppbrandConstant.C65701b.m257612c();
        int i2 = 30;
        String str = "https://i.snssdk.com/api/apps/report_duration";
        boolean z = false;
        if (!(!C67556a.m262941a("getHostSettings") || (i = C67556a.m262952i()) == null || (optJSONObject = i.mo234749f("jsonData").optJSONObject("js_timing_settings")) == null)) {
            z = optJSONObject.optBoolean("switch", false);
            AppbrandConstant.C65701b.m257612c();
            str = optJSONObject.optString("url", str);
            i2 = optJSONObject.optInt("interval", 30);
        }
        getTimingSettingResponse.mSwitch = z;
        getTimingSettingResponse.mUrl = str;
        getTimingSettingResponse.mInterval = i2;
        hVar.callback(getTimingSettingResponse);
    }
}
