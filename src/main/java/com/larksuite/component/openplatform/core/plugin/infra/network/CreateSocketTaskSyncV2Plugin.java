package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.ac.C65733b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapp.util.C67053q;
import java.util.List;
import org.json.JSONObject;

public class CreateSocketTaskSyncV2Plugin extends OPPlugin {
    private IAppContext mAppContext;
    private ILogger mILogger;

    /* access modifiers changed from: private */
    public static class CreateSocketTaskSyncV2Request extends C25920a {
        @JSONField(name = "header2")
        public JSONArray header;
        @JSONField(name = "method")
        public String method;
        @JSONField(name = "protocols")
        public List<String> protocols;
        @JSONField(name = "__skipDomainCheck__")
        public boolean skipDomainCheck;
        @JSONField(name = "url")
        @LKRequiredParam
        public String url;

        private CreateSocketTaskSyncV2Request() {
        }
    }

    private static class CreateSocketTaskSyncV2Response extends C25921b {
        @JSONField(name = "socketTaskId")
        public int socketTaskId;

        private CreateSocketTaskSyncV2Response() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private C12810b parse(CreateSocketTaskSyncV2Request createSocketTaskSyncV2Request) {
        if (createSocketTaskSyncV2Request == null) {
            return null;
        }
        C12810b bVar = new C12810b();
        bVar.f34201a = createSocketTaskSyncV2Request.url;
        bVar.f34203c = createSocketTaskSyncV2Request.method;
        if (C66718d.m260519a(bVar.f34203c)) {
            bVar.f34203c = "GET";
        }
        JSONArray jSONArray = createSocketTaskSyncV2Request.header;
        JSONObject jSONObject = new JSONObject();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                if (jSONArray2 != null) {
                    try {
                        jSONObject.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    } catch (Exception e) {
                        this.mILogger.mo92223e("CreateSocketTaskSyncV2Plugin", " parse socket header err ", e);
                    }
                }
            }
        }
        bVar.f34204d = jSONObject;
        List<String> list = createSocketTaskSyncV2Request.protocols;
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                jSONArray3.put(list.get(i2));
            }
        }
        bVar.f34205e = jSONArray3;
        bVar.f34206f = createSocketTaskSyncV2Request.skipDomainCheck;
        return bVar;
    }

    @LKPluginFunction(eventName = {"createSocketTask"})
    public CreateSocketTaskSyncV2Response createSocketTaskSyncV2(LKEvent lKEvent, CreateSocketTaskSyncV2Request createSocketTaskSyncV2Request, ILogger aVar, AbstractC25905b bVar) {
        this.mILogger = aVar;
        this.mAppContext = getEventContext(lKEvent);
        CreateSocketTaskSyncV2Response createSocketTaskSyncV2Response = new CreateSocketTaskSyncV2Response();
        C12810b parse = parse(createSocketTaskSyncV2Request);
        if (parse == null || TextUtils.isEmpty(parse.f34201a)) {
            this.mILogger.mo92223e("CreateSocketTaskSyncV2Plugin", "wsRequest is null or url is empty!");
            createSocketTaskSyncV2Response.mErrorCode = ApiCode.CONNECTSOCKET_INVALID_URL.code;
            createSocketTaskSyncV2Response.mErrorMessage = ApiCode.CONNECTSOCKET_INVALID_URL.msg;
            return createSocketTaskSyncV2Response;
        } else if (!C67053q.m261326a("socket", parse.f34201a, this.mAppContext)) {
            ILogger aVar2 = this.mILogger;
            aVar2.mo92224i("CreateSocketTaskSyncV2Plugin", "url is not safe domain:" + C67019aa.m261223a(parse.f34201a));
            createSocketTaskSyncV2Response.mErrorCode = ApiCode.CONNECTSOCKET_INVALID_DOMAIN.code;
            createSocketTaskSyncV2Response.mErrorMessage = ApiCode.CONNECTSOCKET_INVALID_DOMAIN.msg;
            return createSocketTaskSyncV2Response;
        } else {
            int a = C65733b.m257704a(this.mAppContext).mo230338a(parse);
            ILogger aVar3 = this.mILogger;
            aVar3.mo92224i("CreateSocketTaskSyncV2Plugin", " create socket id " + a);
            createSocketTaskSyncV2Response.socketTaskId = a;
            return createSocketTaskSyncV2Response;
        }
    }
}
