package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.bytedance.ee.larkbrand.p654h.C13073a;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.errorcode.ApiCode;
import org.json.JSONObject;

public class ApiConsoleLogOutputPlugin extends OPPlugin {

    private static class ConsoleLogResponse extends C25921b {
        private ConsoleLogResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"consoleLogOutput"})
    public void consoleLogAsync(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<ConsoleLogResponse> hVar) {
        String str;
        ConsoleLogResponse consoleLogResponse = new ConsoleLogResponse();
        JSONObject n = lKEvent.mo92147n();
        if (n != null) {
            str = n.toString();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            fVar.mo92190b().mo92223e("ApiConsoleLogOutputPlug", "params is empty");
            consoleLogResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
            consoleLogResponse.mErrorMessage = " params is empty.";
            hVar.callback(consoleLogResponse);
            return;
        }
        if (!C13073a.m53600a(str, getAppContext())) {
            consoleLogResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            consoleLogResponse.mErrorMessage = "console error";
        }
        hVar.callback(consoleLogResponse);
    }
}
