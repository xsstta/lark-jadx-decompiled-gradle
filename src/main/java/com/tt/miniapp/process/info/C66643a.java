package com.tt.miniapp.process.info;

import com.tt.miniapp.process.info.api.ISandboxEnvInfo;

/* renamed from: com.tt.miniapp.process.info.a */
public class C66643a {

    /* renamed from: a */
    private final boolean f168225a;

    /* renamed from: b */
    private final boolean f168226b;

    /* renamed from: c */
    private final ISandboxEnvInfo f168227c;

    /* renamed from: d */
    private final Class f168228d;

    /* renamed from: e */
    private final Class f168229e;

    /* renamed from: a */
    public boolean mo232273a() {
        return this.f168225a;
    }

    /* renamed from: b */
    public boolean mo232274b() {
        return this.f168226b;
    }

    /* renamed from: c */
    public Class mo232275c() {
        return this.f168228d;
    }

    /* renamed from: d */
    public Class mo232276d() {
        return this.f168229e;
    }

    /* renamed from: e */
    public ISandboxEnvInfo mo232277e() {
        return this.f168227c;
    }

    public String toString() {
        return "{mIsNeedClearTask: " + this.f168225a + " mIsLaunchActivityInHostStack: " + this.f168226b + " mProcessName: " + this.f168227c.getSandboxName() + " mLaunchServiceClass: " + this.f168229e + " mLaunchActivityClass: " + this.f168228d + "}";
    }

    public C66643a(ISandboxEnvInfo iSandboxEnvInfo, boolean z) {
        this(iSandboxEnvInfo, z, true);
    }

    public C66643a(ISandboxEnvInfo iSandboxEnvInfo, boolean z, boolean z2) {
        this.f168228d = iSandboxEnvInfo.generateLaunchActivityClass(z);
        this.f168227c = iSandboxEnvInfo;
        this.f168226b = iSandboxEnvInfo.isLaunchActivityInHostStack();
        this.f168229e = iSandboxEnvInfo.getPreloadServiceClass();
        this.f168225a = z2;
        iSandboxEnvInfo.prepareStart();
    }
}
