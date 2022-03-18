package com.larksuite.component.openplatform.core.plugin.inner;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import org.json.JSONObject;

public class ApiLogCtrlPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"logManager"})
    public void log(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<C25921b> hVar) {
        JSONObject n = lKEvent.mo92147n();
        if (n != null) {
            fVar.mo92190b().mo92224i("logManager", n.toString());
        }
        hVar.callback(null);
    }
}
