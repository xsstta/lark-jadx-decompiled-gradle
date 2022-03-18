package com.tt.miniapp.render;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lynx.webview.TTWebSdk;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.info.C66644b;
import com.tt.miniapp.process.info.MiniProcessSandboxInfo;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.placeholder.MiniappService0;
import com.tt.miniapphost.placeholder.MiniappService1;
import com.tt.miniapphost.placeholder.MiniappService2;
import com.tt.miniapphost.placeholder.MiniappService3;
import com.tt.miniapphost.placeholder.MiniappService4;
import com.tt.miniapphost.placeholder.MiniappService5;
import com.tt.miniapphost.placeholder.MiniappService6;
import com.tt.miniapphost.placeholder.MiniappService7;
import com.tt.miniapphost.placeholder.MiniappService8;
import com.tt.miniapphost.placeholder.MiniappService9;
import com.tt.miniapphost.placeholder.MiniappTabActivity0;
import com.tt.miniapphost.placeholder.MiniappTabActivity1;
import com.tt.miniapphost.placeholder.MiniappTabActivity2;
import com.tt.miniapphost.placeholder.MiniappTabActivity3;
import com.tt.miniapphost.placeholder.MiniappTabActivity4;
import com.tt.miniapphost.placeholder.MiniappTabActivity5;
import com.tt.miniapphost.placeholder.MiniappTabActivity6;
import com.tt.miniapphost.placeholder.MiniappTabActivity7;
import com.tt.miniapphost.placeholder.MiniappTabActivity8;
import com.tt.miniapphost.placeholder.MiniappTabActivity9;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity0;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity1;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity2;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity3;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity4;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity5;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity6;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity7;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity8;
import com.tt.miniapphost.placeholder.MiniappTabHostStackActivity9;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.render.d */
public class C66734d implements OPRenderEngineProvider {

    /* renamed from: a */
    private final ConcurrentHashMap<IAppSandboxEnvProcessor, ISandboxEnvInfo[]> f168482a = new ConcurrentHashMap<>();

    @Override // com.tt.miniapp.render.OPRenderEngineProvider
    public RenderEngineType getEngineType() {
        return RenderEngineType.WebView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.render.d$1 */
    public static /* synthetic */ class C667351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f168483a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService$SandBoxEnvType[] r0 = com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService.SandBoxEnvType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapp.render.C66734d.C667351.f168483a = r0
                com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService$SandBoxEnvType r1 = com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.render.C66734d.C667351.f168483a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService$SandBoxEnvType r1 = com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.render.C66734d.C667351.<clinit>():void");
        }
    }

    @Override // com.tt.miniapp.render.OPRenderEngineProvider
    public boolean isSupportDarkMode() {
        boolean z;
        if (!TTWebSdk.isDarkModeSupported() || !TTWebSdk.isDarkStrategySupported()) {
            z = false;
        } else {
            z = true;
        }
        AppBrandLogger.m52830i("WebViewRenderEngineProvider", "darkMode webCoreSupported : " + z);
        return z;
    }

    @Override // com.tt.miniapp.render.OPRenderEngineProvider
    public OPRenderEngine getRenderEngine(AppbrandApplicationImpl appbrandApplicationImpl) {
        return new C66733c(appbrandApplicationImpl);
    }

    @Override // com.tt.miniapp.render.OPRenderEngineProvider
    public ISandboxEnvInfo[] getSandboxEnvConfigList(IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        ISandboxEnvInfo[] iSandboxEnvInfoArr = this.f168482a.get(iAppSandboxEnvProcessor);
        if (iSandboxEnvInfoArr == null) {
            synchronized (this.f168482a) {
                iSandboxEnvInfoArr = this.f168482a.get(iAppSandboxEnvProcessor);
                if (iSandboxEnvInfoArr == null) {
                    iSandboxEnvInfoArr = m260545a(iAppSandboxEnvProcessor);
                    this.f168482a.put(iAppSandboxEnvProcessor, iSandboxEnvInfoArr);
                }
            }
        }
        return iSandboxEnvInfoArr;
    }

    /* renamed from: a */
    public static ISandboxEnvInfo[] m260545a(IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        IAppSandboxEnvManagerService.SandBoxEnvType sandBoxType = iAppSandboxEnvProcessor.getSandBoxType();
        int i = C667351.f168483a[sandBoxType.ordinal()];
        if (i == 1) {
            return new C66644b[]{new C66644b(0, MiniappTabActivity5.class, MiniappTabHostStackActivity5.class, MiniappService5.class, iAppSandboxEnvProcessor), new C66644b(1, MiniappTabActivity6.class, MiniappTabHostStackActivity6.class, MiniappService6.class, iAppSandboxEnvProcessor), new C66644b(2, MiniappTabActivity7.class, MiniappTabHostStackActivity7.class, MiniappService7.class, iAppSandboxEnvProcessor), new C66644b(3, MiniappTabActivity8.class, MiniappTabHostStackActivity8.class, MiniappService8.class, iAppSandboxEnvProcessor), new C66644b(4, MiniappTabActivity9.class, MiniappTabHostStackActivity9.class, MiniappService9.class, iAppSandboxEnvProcessor)};
        } else if (i != 2) {
            AppBrandLogger.m52829e("WebViewRenderEngineProvider", "createSandboxEnvConfigList impossible type " + sandBoxType);
            return new ISandboxEnvInfo[0];
        } else {
            MiniProcessSandboxInfo[] miniProcessSandboxInfoArr = {new MiniProcessSandboxInfo(0, "miniapp0", ":miniapp0", MiniappTabActivity0.class, MiniappTabHostStackActivity0.class, MiniappService0.class, iAppSandboxEnvProcessor), new MiniProcessSandboxInfo(1, "miniapp1", ":miniapp1", MiniappTabActivity1.class, MiniappTabHostStackActivity1.class, MiniappService1.class, iAppSandboxEnvProcessor), new MiniProcessSandboxInfo(2, "miniapp2", ":miniapp2", MiniappTabActivity2.class, MiniappTabHostStackActivity2.class, MiniappService2.class, iAppSandboxEnvProcessor), new MiniProcessSandboxInfo(3, "miniapp3", ":miniapp3", MiniappTabActivity3.class, MiniappTabHostStackActivity3.class, MiniappService3.class, iAppSandboxEnvProcessor), new MiniProcessSandboxInfo(4, "miniapp4", ":miniapp4", MiniappTabActivity4.class, MiniappTabHostStackActivity4.class, MiniappService4.class, iAppSandboxEnvProcessor)};
            int miniAppProcessCount = HostDependManager.getInst().getMiniAppProcessCount();
            if (miniAppProcessCount < 2 || miniAppProcessCount > 5) {
                miniAppProcessCount = 5;
            }
            if (HostDependManager.getInst().getFeatureGating("gadget.disable.limited.mini.app.process.count", false)) {
                miniAppProcessCount = 5;
            }
            AppBrandLogger.m52830i("WebViewRenderEngineProvider", "limitedCount : " + miniAppProcessCount);
            if (miniAppProcessCount >= 5) {
                return miniProcessSandboxInfoArr;
            }
            MiniProcessSandboxInfo[] miniProcessSandboxInfoArr2 = new MiniProcessSandboxInfo[miniAppProcessCount];
            for (int i2 = 0; i2 < miniAppProcessCount; i2++) {
                miniProcessSandboxInfoArr2[i2] = miniProcessSandboxInfoArr[i2];
            }
            return miniProcessSandboxInfoArr2;
        }
    }
}
