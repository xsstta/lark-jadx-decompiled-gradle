package com.tt.miniapp.process.manager;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.render.RenderEngineManageService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.process.manager.e */
public class C66656e extends AbstractC66646b {

    /* renamed from: e */
    private String f168259e;

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public IAppSandboxEnvManagerService.SandBoxEnvType getSandBoxType() {
        return IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public List<RenderEngineType> getAllRenderEngineType() {
        return RenderEngineManageService.getInstance().getAllRenderEngineType();
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public Class getCurrentMiniAppProcessServiceClass() {
        return m260378c(ProcessUtil.getProcessIdentify());
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean isHostProcessExist(Context context) {
        return isSandboxEnvExistByName(context.getPackageName());
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean isSandboxEnvExistByName(String str) {
        if (m260377b(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private ActivityManager.RunningAppProcessInfo m260377b(String str) {
        List<ActivityManager.RunningAppProcessInfo> a = C66653c.m260374a(AppbrandContext.getInst().getApplicationContext());
        if (a == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a) {
            if (TextUtils.equals(runningAppProcessInfo.processName, str)) {
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    /* renamed from: c */
    private Class m260378c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.equals(iSandboxEnvInfo.getProcessIdentity(), str)) {
                return iSandboxEnvInfo.getPreloadServiceClass();
            }
        }
        return null;
    }

    /* renamed from: a */
    public ArrayList<Class> getRunningServiceClass(Context context) {
        Class preloadServiceClass;
        List<ActivityManager.RunningAppProcessInfo> a = C66653c.m260374a(context);
        ArrayList<Class> arrayList = new ArrayList<>();
        if (a != null) {
            ISandboxEnvInfo[] a2 = mo232367a();
            for (ISandboxEnvInfo iSandboxEnvInfo : a2) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a) {
                    if (TextUtils.equals(runningAppProcessInfo.processName, iSandboxEnvInfo.getSandboxName()) && (preloadServiceClass = iSandboxEnvInfo.getPreloadServiceClass()) != null) {
                        arrayList.add(preloadServiceClass);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m260376a(Context context, ISandboxEnvInfo iSandboxEnvInfo) {
        Class preloadServiceClass = iSandboxEnvInfo.getPreloadServiceClass();
        if (preloadServiceClass == null) {
            AppBrandLogger.m52829e("NewMiniProcessSandboxEnvPr", "serviceClass == null");
            return;
        }
        String sandboxName = iSandboxEnvInfo.getSandboxName();
        File file = new File(context.getFilesDir(), sandboxName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "NewMiniProcessSandboxEnvPr", e.getStackTrace());
            }
        }
        try {
            Intent intent = new Intent(context, preloadServiceClass);
            intent.putExtra("command", "finishActivityAndService");
            intent.putExtra("appId", iSandboxEnvInfo.getAppId());
            intent.putExtra("processName", sandboxName);
            context.startService(intent);
            int i = 0;
            while (i < 50) {
                SystemClock.sleep(30);
                i++;
                if (!file.exists()) {
                    break;
                }
            }
            AppBrandLogger.m52828d("NewMiniProcessSandboxEnvPr", "finishProcessActivityAndService wait", Integer.valueOf(i * 30), "ms");
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "NewMiniProcessSandboxEnvPr", e2.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void killSandbox(Context context, ISandboxEnvInfo iSandboxEnvInfo) {
        boolean z;
        AppBrandLogger.m52830i("NewMiniProcessSandboxEnvPr", "killSandbox processInfo:", iSandboxEnvInfo);
        if (TextUtils.equals(this.f168259e, iSandboxEnvInfo.getAppId())) {
            AppBrandLogger.m52830i("NewMiniProcessSandboxEnvPr", "killSandbox TextUtils.equals(killingAppId, processInfo.mAppId)");
            return;
        }
        String appId = iSandboxEnvInfo.getAppId();
        this.f168259e = appId;
        iSandboxEnvInfo.setKillingAppId(appId);
        ActivityManager.RunningAppProcessInfo b = m260377b(iSandboxEnvInfo.getSandboxName());
        if (b != null) {
            m260376a(context, iSandboxEnvInfo);
            try {
                Process.killProcess(b.pid);
                int i = 0;
                while (i < 30) {
                    SystemClock.sleep(50);
                    i++;
                    if (!isSandboxEnvExistByName(b.processName)) {
                        break;
                    }
                }
                AppBrandLogger.m52830i("NewMiniProcessSandboxEnvPr", "killSandbox wait", Integer.valueOf(i * 50), "ms");
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "NewMiniProcessSandboxEnvPr", e.getStackTrace());
            }
            z = true;
        } else {
            z = false;
        }
        mo232365a(iSandboxEnvInfo);
        if (!TextUtils.equals(this.f168259e, iSandboxEnvInfo.getAppId()) || !iSandboxEnvInfo.isActivityCreated()) {
            AppBrandLogger.m52830i("NewMiniProcessSandboxEnvPr", "miniapp processinfo not reset：", iSandboxEnvInfo.getAppId());
        } else {
            AppBrandLogger.m52830i("NewMiniProcessSandboxEnvPr", "miniapp process killed, processInfo reset：", iSandboxEnvInfo.getAppId());
            iSandboxEnvInfo.reset();
        }
        this.f168259e = null;
        AppBrandLogger.m52830i("NewMiniProcessSandboxEnvPr", "killSandbox finish processInfo:", iSandboxEnvInfo, "killedProcess:", Boolean.valueOf(z));
    }
}
