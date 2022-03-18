package com.tt.miniapp.process.info;

import android.content.Context;
import android.text.TextUtils;
import com.tt.miniapp.process.info.base.AbsSandboxEnvInfo;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.host.HostDependManager;

public class MiniProcessSandboxInfo extends AbsSandboxEnvInfo {
    public String mProcessName;
    public final String mProcessNameSuffix;

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public String getSandboxName() {
        return this.mProcessName;
    }

    @Override // com.tt.miniapp.process.info.base.AbsSandboxEnvInfo
    public IAppSandboxEnvManagerService.SandBoxEnvType getSandboxType() {
        return IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean isPreload() {
        if (!TextUtils.isEmpty(this.mAppId) || !this.processor.isSandboxEnvExistByName(this.mProcessName)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "MiniProcessInfo{mProcessName='" + this.mProcessName + '\'' + ", mProcessIdentity='" + this.mProcessIdentity + '\'' + ", mProcessNameSuffix='" + this.mProcessNameSuffix + '\'' + ", mMiniProcessMonitor=" + this.mMiniProcessMonitor + '\'' + ", mAppId=" + this.mAppId + '}';
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo, com.tt.miniapp.process.info.base.AbsSandboxEnvInfo
    public void init(Context context) {
        if (!this.mIsInitialized) {
            this.mIsInitialized = true;
            String packageName = context.getPackageName();
            HostDependManager inst = HostDependManager.getInst();
            this.mProcessName = inst.replaceProcessName(packageName + this.mProcessNameSuffix);
        }
    }

    public MiniProcessSandboxInfo(int i, String str, String str2, Class cls, Class cls2, Class cls3, IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        super(i, str, cls, cls2, cls3, iAppSandboxEnvProcessor);
        this.mProcessNameSuffix = str2;
    }
}
