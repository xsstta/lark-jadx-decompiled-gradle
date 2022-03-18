package com.larksuite.component.openplatform.core.plugin.op;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.optrace.api.ILogger;

public class H5ApiGetEnvironmentVariablePlugin extends OPPlugin {

    private static class H5ApiGetEnvironmentVariableRequest extends C25920a {
        private H5ApiGetEnvironmentVariableRequest() {
        }
    }

    private static class H5ApiGetEnvironmentVariableResponse extends C25921b {
        @JSONField(name = "platform")
        public Config nativeTMAConfig;

        public static class Config {
            @JSONField(name = "navigationBarHidden")
            public boolean navigationBarHidden;
            @JSONField(name = "platform")
            public String platform;
            @JSONField(name = "tabbarHidden")
            public boolean tabbarHidden;
        }

        private H5ApiGetEnvironmentVariableResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = false, eventName = {"getEnvironmentVariables"})
    public H5ApiGetEnvironmentVariableResponse H5ApiGetEnvironmentVariableAsync(AbstractC25895f fVar) {
        ILogger b = fVar.mo92190b();
        H5ApiGetEnvironmentVariableResponse h5ApiGetEnvironmentVariableResponse = new H5ApiGetEnvironmentVariableResponse();
        H5ApiGetEnvironmentVariableResponse.Config config = new H5ApiGetEnvironmentVariableResponse.Config();
        try {
            config.navigationBarHidden = true;
            config.tabbarHidden = true;
            config.platform = "android";
            h5ApiGetEnvironmentVariableResponse.nativeTMAConfig = config;
        } catch (Exception e) {
            b.mo92223e("getEnvironmentVariables", "json error", e);
        }
        return h5ApiGetEnvironmentVariableResponse;
    }
}
