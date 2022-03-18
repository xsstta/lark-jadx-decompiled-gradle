package com.larksuite.component.openplatform.core.plugin.falcon;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.refer.common.base.AppType;

public class OPSSBPlugin extends OPPlugin {
    private static final AbstractC12790g<OPSSBPlugin> HOLDER = new AbstractC12790g<OPSSBPlugin>() {
        /* class com.larksuite.component.openplatform.core.plugin.falcon.OPSSBPlugin.C248701 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public OPSSBPlugin mo48227b(Context... contextArr) {
            return new OPSSBPlugin();
        }
    };

    public static class ConvertSchema {

        public static class Request extends C25920a {
            @JSONField(name = "isFromSpecialContainer")
            public boolean isFromNormalGadgetContainer = true;
            @JSONField(name = "fromSandboxType")
            public int mFromSandboxType = -1;
            @JSONField(name = "schema")
            @LKRequiredParam
            public String mScheme;
        }

        public static class Response extends C25921b {
            @JSONField(name = "schema")
            public String mScheme;
        }
    }

    public static class OpenSSB {

        public static class Response extends C25921b {
        }
    }

    private OPSSBPlugin() {
    }

    public static OPSSBPlugin get() {
        return HOLDER.mo48348c(new Context[0]);
    }

    @LKPluginFunction(eventName = {"openMainSandbox"})
    public OpenSSB.Response openMainSandbox() {
        OpenSSB.Response response = new OpenSSB.Response();
        C67448a.m262353a().mo234184c();
        C66645a.m260337a().mo232356a(AppbrandContext.getInst().getApplicationContext());
        return response;
    }

    @LKPluginFunction(eventName = {"convertSchema"})
    public ConvertSchema.Response convertSchemaInSSBIfNeed(ConvertSchema.Request request) {
        AbstractC67433a b;
        ConvertSchema.Response response = new ConvertSchema.Response();
        if (request.isFromNormalGadgetContainer && IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS.ordinal() == request.mFromSandboxType) {
            return response;
        }
        try {
            Uri parse = Uri.parse(request.mScheme);
            String queryParameter = parse.getQueryParameter("app_id");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter("appId");
            }
            if (!TextUtils.isEmpty(request.mAppIdentify) && request.mAppIdentify.equals(queryParameter) && (b = C67448a.m262353a().mo234181b(C67440a.m262344a(AppType.GadgetAPP, queryParameter))) != null && b.mo234169i()) {
                openMainSandbox();
                response.mScheme = request.mScheme + ContainerUtils.FIELD_DELIMITER + "launch_mode" + ContainerUtils.KEY_VALUE_DELIMITER + "hostStack" + ContainerUtils.FIELD_DELIMITER + "ssbFlag" + "=1";
                if (request.mFromSandboxType != -1) {
                    response.mScheme += "&app_sand_box_type=" + request.mFromSandboxType;
                }
                return response;
            }
        } catch (Throwable th) {
            Log.m165384e("OPSSBPlugin", "Throwable", th);
            fillFailedResponse(response, C25906a.f64080j, th.getMessage());
        }
        return response;
    }
}
