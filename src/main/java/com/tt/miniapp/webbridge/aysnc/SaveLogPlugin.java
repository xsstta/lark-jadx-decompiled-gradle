package com.tt.miniapp.webbridge.aysnc;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.JsonObject;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.ss.android.lark.log.Log;

public class SaveLogPlugin extends OPPlugin {

    private static class SaveLogPluginHandlerRequest extends C25920a {
        @JSONField(name = "level")
        public String level;
        @JSONField(name = "message")
        public JSONArray message;

        private SaveLogPluginHandlerRequest() {
        }
    }

    @LKPluginFunction(eventName = {"saveLog"})
    public C25921b saveLog(SaveLogPluginHandlerRequest saveLogPluginHandlerRequest) {
        saveLog(saveLogPluginHandlerRequest.message, saveLogPluginHandlerRequest.level);
        return new C25921b();
    }

    private void saveLog(JSONArray jSONArray, String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("msg", jSONArray.toString());
        jsonObject.addProperty("level", str);
        jsonObject.addProperty("module", "USER");
        jsonObject.addProperty("prefix", "open_platform_api_save_log");
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("appId", getAppContext().getAppId());
        jsonObject3.addProperty("appIdentify", getAppContext().getAppIdentify());
        jsonObject3.addProperty("traceId", getAppContext().getTraceId());
        jsonObject2.add("common-tag", jsonObject3);
        jsonObject.add("tags", jsonObject2);
        Log.m165389i("open_platform_api_save_log", jsonObject.toString());
    }
}
