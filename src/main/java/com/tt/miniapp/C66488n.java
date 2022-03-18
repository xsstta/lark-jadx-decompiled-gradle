package com.tt.miniapp;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.oryxgadget.utils.OryxHostMonitorUtil;
import com.bytedance.ee.lark.oryxgadget.utils.OryxSpUtils;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.process.C66611a;
import com.tt.miniapp.process.C66615b;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.C67031e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.util.C67866g;
import java.lang.Thread;

/* renamed from: com.tt.miniapp.n */
public class C66488n {
    /* renamed from: a */
    public static void m259855a(final AbstractC67433a aVar) {
        AppBrandLogger.m52830i("MiniAppInitializer", "initInMiniAppProcess");
        if (ProcessUtil.isMiniappProcess()) {
            AppBrandLogger.m52830i("MiniAppInitializer", "miniapp process so setMessageLogging null");
            Looper.getMainLooper().setMessageLogging(null);
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.C66488n.C664891 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                C66615b.m260248a().mo232248c();
                C66612a.m260236c(ProcessUtil.getCurProcessName(applicationContext));
            }
        }, C67554l.m262725b());
        if (C67031e.m261247a()) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* class com.tt.miniapp.C66488n.C664902 */

                public void uncaughtException(Thread thread, Throwable th) {
                    C66612a.m260237c(ProcessUtil.getCurProcessName(AppbrandContext.getInst().getApplicationContext()), Log.getStackTraceString(th));
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
        if (MiniAppProcessUtils.isOryxProcess(ProcessUtil.getCurProcessName(aVar.getApplicationContext()))) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* class com.tt.miniapp.C66488n.C664913 */

                public void uncaughtException(Thread thread, Throwable th) {
                    AppBrandLogger.m52828d("MiniAppInitializer", "oryx process crash:" + Log.getStackTraceString(th));
                    OryxHostMonitorUtil.monitorProcessCrash(aVar, th);
                    OryxSpUtils.updateProcessCrashStatus(aVar.getApplicationContext());
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler2;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
        C66399c.m259608a().mo231915a((Context) AppbrandContext.getInst().getApplicationContext(), (IAppContext) aVar);
        C67560a.m262956a(new C66611a());
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (iAppSandboxEnvProcessor != null) {
                iAppSandboxEnvProcessor.registerHostProcessLifeListener(new C66615b.AbstractC66618a() {
                    /* class com.tt.miniapp.C66488n.C664924 */

                    @Override // com.tt.miniapp.process.C66615b.AbstractC66618a
                    /* renamed from: a */
                    public void mo232064a() {
                        if (aVar.getCurrentActivity() == null) {
                            AppBrandLogger.m52830i("MiniAppInitializer", "killCurrentPreloadProcessWhenHostProcessDied");
                            ProcessUtil.killCurrentMiniAppProcess();
                        }
                    }

                    @Override // com.tt.miniapp.process.C66615b.AbstractC66618a
                    /* renamed from: a */
                    public void mo232065a(boolean z) {
                        if (z) {
                            C66612a.m260221a(aVar);
                        }
                    }
                });
            }
        }
    }
}
