package com.tt.miniapp.process.manager;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tt.miniapp.process.manager.a */
public class C66645a implements IAppSandboxEnvManagerService {

    /* renamed from: b */
    private static IAppSandboxEnvManagerService f168231b;

    /* renamed from: a */
    private final Map<IAppSandboxEnvManagerService.SandBoxEnvType, IAppSandboxEnvProcessor> f168232a;

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: b */
    public Collection<IAppSandboxEnvProcessor> mo232359b() {
        return this.f168232a.values();
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: c */
    public Set<IAppSandboxEnvManagerService.SandBoxEnvType> mo232361c() {
        return this.f168232a.keySet();
    }

    public C66645a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f168232a = linkedHashMap;
        linkedHashMap.put(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS, new C66656e());
        if (C67448a.m262353a().mo234183b()) {
            AppBrandLogger.m52830i("AppSandBoxEnvManager", "can run in main process, so add mainProcessSandboxProcessor");
            linkedHashMap.put(IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS, new C66654d());
        }
    }

    /* renamed from: a */
    public static IAppSandboxEnvManagerService m260337a() {
        if (f168231b == null) {
            synchronized (C66645a.class) {
                if (f168231b == null) {
                    f168231b = new C66645a();
                }
            }
        }
        if (C67448a.m262353a().mo234183b() && !f168231b.mo232361c().contains(IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS)) {
            synchronized (C66645a.class) {
                if (!f168231b.mo232361c().contains(IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS)) {
                    f168231b.mo232357a(IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS, new C66654d());
                }
            }
        }
        return f168231b;
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: a */
    public IAppSandboxEnvProcessor mo232355a(IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType) {
        return m260338b(sandBoxEnvType);
    }

    /* renamed from: b */
    private IAppSandboxEnvProcessor m260338b(IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType) {
        if (this.f168232a.containsKey(sandBoxEnvType)) {
            return this.f168232a.get(sandBoxEnvType);
        }
        return this.f168232a.get(IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS);
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: a */
    public void mo232356a(Context context) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : mo232359b()) {
            if (iAppSandboxEnvProcessor != null) {
                iAppSandboxEnvProcessor.initSandBoxList(context);
            }
        }
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: a */
    public ISandboxEnvInfo mo232354a(String str) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : this.f168232a.values()) {
            ISandboxEnvInfo sandboxEnvInfoByAppId = iAppSandboxEnvProcessor.getSandboxEnvInfoByAppId(str);
            if (sandboxEnvInfoByAppId != null) {
                return sandboxEnvInfoByAppId;
            }
        }
        AppBrandLogger.m52830i("AppSandBoxEnvManager", "sandboxEnvInfo is null, appId:" + str);
        return null;
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: b */
    public ISandboxEnvInfo mo232358b(String str) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : this.f168232a.values()) {
            ISandboxEnvInfo sandboxInfoByName = iAppSandboxEnvProcessor.getSandboxInfoByName(str);
            if (sandboxInfoByName != null) {
                return sandboxInfoByName;
            }
        }
        AppBrandLogger.m52830i("AppSandBoxEnvManager", "sandboxEnvInfo is null, sandboxName:" + str);
        return null;
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: c */
    public ISandboxEnvInfo mo232360c(String str) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : this.f168232a.values()) {
            ISandboxEnvInfo sandboxInfoByIdentity = iAppSandboxEnvProcessor.getSandboxInfoByIdentity(str);
            if (sandboxInfoByIdentity != null) {
                return sandboxInfoByIdentity;
            }
        }
        AppBrandLogger.m52830i("AppSandBoxEnvManager", "sandboxEnvInfo is null, identify:" + str);
        return null;
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: d */
    public IAppSandboxEnvProcessor mo232362d(String str) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : this.f168232a.values()) {
            if (iAppSandboxEnvProcessor.getSandboxInfoByName(str) != null) {
                return iAppSandboxEnvProcessor;
            }
        }
        AppBrandLogger.m52830i("AppSandBoxEnvManager", " processor is null, sandBoxName:" + str);
        return null;
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: e */
    public IAppSandboxEnvProcessor mo232363e(String str) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : this.f168232a.values()) {
            AppBrandLogger.m52828d("AppSandBoxEnvManager", iAppSandboxEnvProcessor.toString());
            if (iAppSandboxEnvProcessor.getSandboxEnvInfoByAppId(str) != null) {
                return iAppSandboxEnvProcessor;
            }
        }
        AppBrandLogger.m52831w("AppSandBoxEnvManager", "appId:" + str + " processor is null! ");
        return null;
    }

    @Override // com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService
    /* renamed from: a */
    public void mo232357a(IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType, IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        if (this.f168232a.containsKey(sandBoxEnvType)) {
            AppBrandLogger.m52830i("AppSandBoxEnvManager", "already register sandboxType:" + sandBoxEnvType.name());
        }
        this.f168232a.put(sandBoxEnvType, iAppSandboxEnvProcessor);
    }
}
