package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;

public class ApiGetAppInfoSyncPlugin extends OPPlugin {
    private IAppContext mAppContext;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class ApiGetAppInfoSyncResponse extends C25921b {
        @JSONField(name = "appId")
        public String mAppId;
        @JSONField(name = "blackList")
        public JSONArray mBlackList;
        @JSONField(name = "schema")
        public String mSchema;
        @JSONField(name = "session")
        public String mSession;
        @JSONField(name = "whiteList")
        public JSONArray mWhiteList;

        private ApiGetAppInfoSyncResponse() {
        }
    }

    private JSONArray convertOriginJSONArrayToFastJSONArray(org.json.JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray == null) {
            return jSONArray2;
        }
        return JSON.parseArray(jSONArray.toString());
    }

    @LKPluginFunction(eventName = {"getAppInfoSync"})
    public ApiGetAppInfoSyncResponse apiGetAppInfoSyncAsync(LKEvent lKEvent, AbstractC25895f fVar) {
        this.mAppContext = getEventContext(lKEvent);
        ApiGetAppInfoSyncResponse apiGetAppInfoSyncResponse = new ApiGetAppInfoSyncResponse();
        try {
            AbstractC67538f a = C67432a.m262319a(this.mAppContext);
            apiGetAppInfoSyncResponse.mSchema = a.getSchema();
            String str = a.getAppInfo().appId;
            apiGetAppInfoSyncResponse.mAppId = str;
            String g = getApiDependency().mo235054g(str);
            if (!TextUtils.isEmpty(g)) {
                apiGetAppInfoSyncResponse.mSession = g;
            } else {
                apiGetAppInfoSyncResponse.mSession = C66612a.m260219a(str);
            }
            apiGetAppInfoSyncResponse.mWhiteList = convertOriginJSONArrayToFastJSONArray(C66236a.m259229d(this.mAppContext));
            apiGetAppInfoSyncResponse.mBlackList = convertOriginJSONArrayToFastJSONArray(C66236a.m259231e(this.mAppContext));
        } catch (Exception e) {
            fVar.mo92190b().mo92223e("tma_ApiGetAppInfoSync", "act", e.getStackTrace());
        }
        return apiGetAppInfoSyncResponse;
    }
}
