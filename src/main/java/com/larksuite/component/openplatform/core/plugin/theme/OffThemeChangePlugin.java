package com.larksuite.component.openplatform.core.plugin.theme;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;

public class OffThemeChangePlugin extends OPPlugin {
    @LKPluginFunction(async = true, eventName = {"offThemeChange"})
    public void onThemeChange(LKEvent lKEvent, AbstractC25897h<ApiOffThemeChangeResponseModel> hVar) {
    }

    private static class ApiOffThemeChangeResponseModel extends C25921b {
        private ApiOffThemeChangeResponseModel() {
        }
    }
}
