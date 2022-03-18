package com.larksuite.component.openplatform.core.plugin;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;

public class OPLifecyclePlugin extends OPPlugin {
    private volatile boolean isAppShowCalled;

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
            AbstractC67730a aVar = (AbstractC67730a) appContext.findServiceByInterface(AbstractC67730a.class);
            if (aVar != null) {
                b.mo92222d("OPLifecyclePlugin", "nfc foreground");
                aVar.mo87907a();
            }
            AbstractC65746a.m257747a(appContext).mo230382c();
            if (!this.isAppShowCalled) {
                b.mo92222d("OPLifecyclePlugin", "audit event");
                LarkExtensionManager.getInstance().getExtension().mo49578a(appContext.getAppId());
            }
            this.isAppShowCalled = true;
        } else if ("onBackGround".equals(m)) {
            AbstractC67730a aVar2 = (AbstractC67730a) appContext.findServiceByInterface(AbstractC67730a.class);
            if (aVar2 != null) {
                b.mo92222d("OPLifecyclePlugin", "nfc foreground");
                aVar2.mo87911b();
            }
            AbstractC65746a.m257747a(appContext).mo230384d();
        }
        return lKEvent.mo92155v();
    }
}
