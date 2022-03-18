package com.tt.miniapp.process.manager;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.process.manager.d */
public class C66654d extends AbstractC66646b {

    /* renamed from: f */
    private static final List<RenderEngineType> f168257f = new ArrayList<RenderEngineType>() {
        /* class com.tt.miniapp.process.manager.C66654d.C666551 */

        {
            add(RenderEngineType.WebView);
        }
    };

    /* renamed from: e */
    private String f168258e;

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public Class getCurrentMiniAppProcessServiceClass() {
        return null;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean isHostProcessExist(Context context) {
        return true;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public List<RenderEngineType> getAllRenderEngineType() {
        return f168257f;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public IAppSandboxEnvManagerService.SandBoxEnvType getSandBoxType() {
        return IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean isSandboxEnvExistByName(String str) {
        List<ActivityManager.RunningServiceInfo> a = C66653c.m260373a();
        if (a == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : a) {
            if (TextUtils.equals(runningServiceInfo.service.getClassName(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public List<Class> getRunningServiceClass(Context context) {
        Class preloadServiceClass;
        ArrayList arrayList = new ArrayList();
        List<ActivityManager.RunningServiceInfo> a = C66653c.m260373a();
        if (a == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ActivityManager.RunningServiceInfo runningServiceInfo : a) {
            arrayList2.add(runningServiceInfo.service.getClassName());
        }
        ISandboxEnvInfo[] a2 = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a2) {
            if (arrayList2.contains(iSandboxEnvInfo.getPreloadServiceClass().getName()) && (preloadServiceClass = iSandboxEnvInfo.getPreloadServiceClass()) != null) {
                arrayList.add(preloadServiceClass);
            }
        }
        return arrayList;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void killSandbox(Context context, ISandboxEnvInfo iSandboxEnvInfo) {
        AppBrandLogger.m52830i("NewMainProcessSandboxEnvPr", "killSandbox processInfo:", iSandboxEnvInfo);
        if (TextUtils.equals(this.f168258e, iSandboxEnvInfo.getAppId())) {
            AppBrandLogger.m52830i("NewMainProcessSandboxEnvPr", "killSandbox TextUtils.equals(killingAppId, processInfo.mAppId)");
            return;
        }
        this.f168258e = iSandboxEnvInfo.getAppId();
        AbstractC67433a appContext = iSandboxEnvInfo.getAppContext();
        if (appContext != null) {
            AppBrandLogger.m52830i("NewMainProcessSandboxEnvPr", "start destroy by kill this app");
            appContext.startDestroy();
            if (ProcessUtil.isMainProcess(context)) {
                AppBrandLogger.m52830i("NewMainProcessSandboxEnvPr", "stop service:" + iSandboxEnvInfo.getPreloadServiceClass().getName());
                iSandboxEnvInfo.getMiniProcessMontior().mainSandboxDie();
            }
            if (appContext.getCurrentActivity() instanceof MiniappHostBase) {
                AppBrandLogger.m52828d("NewMainProcessSandboxEnvPr", "appbrandContext.getCurrentActivity().finish:" + appContext.getCurrentActivity().getClass().getName());
                appContext.getCurrentActivity().finish();
            }
        } else {
            AppBrandLogger.m52830i("NewMainProcessSandboxEnvPr", " processInfo:" + iSandboxEnvInfo.getPreloadServiceClass().getName() + " released");
        }
        this.f168258e = null;
        mo232365a(iSandboxEnvInfo);
        iSandboxEnvInfo.reset();
        AppBrandLogger.m52830i("NewMainProcessSandboxEnvPr", "killSandbox finish processInfo:", iSandboxEnvInfo, "killedProcess:", iSandboxEnvInfo);
    }
}
