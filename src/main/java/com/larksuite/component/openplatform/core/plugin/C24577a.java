package com.larksuite.component.openplatform.core.plugin;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.larksuite.component.openplatform.core.plugin.a */
public class C24577a {

    /* renamed from: a */
    private static volatile AtomicBoolean f60562a = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m89613a(IHostProcessHandleEvent iHostProcessHandleEvent) {
        if (iHostProcessHandleEvent == null) {
            AppBrandLogger.m52829e("OPCrossPluginUtils", "hostProcessHandleEvent is null");
        } else if (f60562a.compareAndSet(false, true)) {
            List<IHostProcessHandleEvent.IPCPluginConfig> appEnvPluginConfigs = iHostProcessHandleEvent.getAppEnvPluginConfigs();
            if (appEnvPluginConfigs == null) {
                f60562a.set(false);
                AppBrandLogger.m52829e("OPCrossPluginUtils", "ipcPluginConfigs is null");
                return;
            }
            AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
            for (IHostProcessHandleEvent.IPCPluginConfig iPCPluginConfig : appEnvPluginConfigs) {
                if (iPCPluginConfig == null) {
                    AppBrandLogger.m52829e("OPCrossPluginUtils", "plugin config is null");
                } else {
                    AppBrandLogger.m52830i("OPCrossPluginUtils", "plugin name:" + iPCPluginConfig.mPluginClass + " eventList:" + iPCPluginConfig.mEventList.toString());
                    LKPluginConfig.C25571a a = new LKPluginConfig.C25571a().mo88747a(iPCPluginConfig.mPluginClass).mo88742a(iPCPluginConfig.mPluginEnv).mo88748a(iPCPluginConfig.mEventList).mo88743a(iPCPluginConfig.mScope);
                    if (iPCPluginConfig.mOpenConditions != null) {
                        for (LKOpenApiAccessConfig lKOpenApiAccessConfig : iPCPluginConfig.mOpenConditions) {
                            a.mo88744a(lKOpenApiAccessConfig);
                        }
                    }
                    cVar.mo88698a(a.mo88749a());
                }
            }
        } else {
            AppBrandLogger.m52830i("OPCrossPluginUtils", "already add ipc plugins");
        }
    }
}
