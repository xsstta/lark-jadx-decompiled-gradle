package com.bytedance.ee.webapp.utils;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleDefaultPluginContainerEvent;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.core.C25927d;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.util.List;

/* renamed from: com.bytedance.ee.webapp.utils.a */
public class C13821a {

    /* renamed from: com.bytedance.ee.webapp.utils.a$a */
    public interface AbstractC13822a {
        /* renamed from: a */
        void mo50913a(String str);
    }

    /* renamed from: a */
    public static void m55979a(IAppContext iAppContext, AbstractC13822a aVar) {
        AbstractC25576a defaultPluginContainer = iAppContext.getDefaultPluginContainer();
        if (defaultPluginContainer != null) {
            AbstractC25904o u = defaultPluginContainer.mo92183u();
            if (u != null) {
                List<AbstractC25937e> a = u.mo92198a();
                StringBuilder sb = new StringBuilder();
                sb.append("allPlugin = [");
                for (AbstractC25937e eVar : a) {
                    C25927d dVar = new C25927d();
                    eVar.addEvents(dVar);
                    for (String str : dVar.mo92191a()) {
                        aVar.mo50913a(str);
                        sb.append(str);
                        sb.append(";");
                    }
                }
                sb.append("]");
                Log.m165389i("WebAppUtils", sb.toString());
            }
        } else {
            Log.m165383e("WebAppUtils", "plugin manager container is null");
        }
        IHostProcessHandleDefaultPluginContainerEvent iHostProcessHandleDefaultPluginContainerEvent = (IHostProcessHandleDefaultPluginContainerEvent) C68183b.m264839a().mo237086a(iAppContext.getApplicationContext(), IHostProcessHandleDefaultPluginContainerEvent.class);
        if (iHostProcessHandleDefaultPluginContainerEvent != null) {
            List<IHostProcessHandleEvent.IPCPluginConfig> bizEnvPluginConfigsForWebApp = iHostProcessHandleDefaultPluginContainerEvent.getBizEnvPluginConfigsForWebApp();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ipcPluginConfigs = [");
            if (bizEnvPluginConfigsForWebApp != null) {
                for (IHostProcessHandleEvent.IPCPluginConfig iPCPluginConfig : bizEnvPluginConfigsForWebApp) {
                    for (String str2 : iPCPluginConfig.mEventList) {
                        aVar.mo50913a(str2);
                        sb2.append(str2);
                        sb2.append(";");
                    }
                }
            }
            sb2.append("]");
            Log.m165389i("WebAppUtils", sb2.toString());
            return;
        }
        Log.m165383e("WebAppUtils", "host process handle is null");
    }
}
