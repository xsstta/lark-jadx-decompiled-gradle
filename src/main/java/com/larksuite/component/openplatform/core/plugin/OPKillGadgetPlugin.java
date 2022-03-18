package com.larksuite.component.openplatform.core.plugin;

import android.os.Message;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;

public class OPKillGadgetPlugin extends OPPlugin {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public int priority() {
        return -3;
    }

    @LKPluginFunction(async = true, eventName = {"removeKillGadgetEventOnForeground"})
    public void removeKillGadgetEventOnForeground(ILogger aVar) {
        IAppContext appContext = getAppContext();
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(appContext);
        if (inst != null) {
            IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(inst.getAppInfo().sandBoxEnvType);
            if (appContext instanceof AbstractC67433a) {
                aVar.mo92224i("OPKillGadgetPlugin", "remove kill event");
                a.getKillSandBoxHandler((AbstractC67433a) appContext).removeCallbacksAndMessages(null);
            }
        }
    }

    @LKPluginFunction(async = true, eventName = {"killGadgetOnBackground"})
    public void killGadgetOnBackground(ILogger aVar) {
        IAppContext appContext = getAppContext();
        if (appContext.getCurrentActivity() instanceof MiniappHostBase) {
            aVar.mo92224i("OPKillGadgetPlugin", "The GadgetApp enters the background and is killed by SDK logic after waiting for 5 minutes");
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(appContext);
            if (inst != null) {
                IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(inst.getAppInfo().sandBoxEnvType);
                if (appContext instanceof AbstractC67433a) {
                    a.getKillSandBoxHandler((AbstractC67433a) appContext).sendMessageDelayed(Message.obtain(), 300000);
                    return;
                }
                return;
            }
            return;
        }
        aVar.mo92224i("OPKillGadgetPlugin", "The GadgetApp is kept alive when it enters the background and will not be automatically killed by the SDK logic");
    }
}
