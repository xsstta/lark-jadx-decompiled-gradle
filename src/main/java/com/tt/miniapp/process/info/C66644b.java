package com.tt.miniapp.process.info;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.info.base.AbsSandboxEnvInfo;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;

/* renamed from: com.tt.miniapp.process.info.b */
public class C66644b extends AbsSandboxEnvInfo {

    /* renamed from: a */
    private String f168230a;

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public String getSandboxName() {
        return this.f168230a;
    }

    @Override // com.tt.miniapp.process.info.base.AbsSandboxEnvInfo
    public IAppSandboxEnvManagerService.SandBoxEnvType getSandboxType() {
        return IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean isPreload() {
        if (this.processor == null || !TextUtils.isEmpty(this.mAppId) || !this.processor.isSandboxEnvExistByName(this.f168230a)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "MainProcessInfo{mSandboxName='" + this.f168230a + '\'' + '}';
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo, com.tt.miniapp.process.info.base.AbsSandboxEnvInfo
    public void init(Context context) {
        if (!this.mIsInitialized) {
            this.mIsInitialized = true;
            this.f168230a = this.mPreloadServiceClass.getName();
            AppBrandLogger.m52828d("MainSandboxInfo", "sandBoxEnvName:" + this.f168230a);
        }
    }

    public C66644b(int i, Class cls, Class cls2, Class cls3, IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        super(i, "hostProcess", cls, cls2, cls3, iAppSandboxEnvProcessor);
    }
}
