package com.larksuite.component.openplatform.core.plugin;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.lark.optrace.api.ILogger;

public class OPGadgetLifecyclePlugin extends OPPlugin {
    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a("onBackGround");
        gVar.mo92192a("onForeGround");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        super.handleEvent(lKEvent);
        String m = lKEvent.mo92146m();
        IAppContext appContext = getAppContext();
        ILogger b = lKEvent.mo92134c().mo92190b();
        if ("onForeGround".equals(m)) {
            b.mo92222d("OPGadgetLifecyclePlugin", "send remove kill event");
            C25529d.m91132a(appContext, "removeKillGadgetEventOnForeground");
        } else if ("onBackGround".equals(m)) {
            b.mo92222d("OPGadgetLifecyclePlugin", "send kill event");
            C25529d.m91132a(appContext, "killGadgetOnBackground");
        }
        return lKEvent.mo92155v();
    }
}
