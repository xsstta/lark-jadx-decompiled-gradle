package com.ss.android.lark.account_provider.integrator.env;

import com.ss.android.lark.log.Log;

public class PassportEnv implements IEnv {
    private IEnv mDelegate;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.account_provider.integrator.env.PassportEnv$a */
    public static final class C28517a {

        /* renamed from: a */
        public static final PassportEnv f71671a = new PassportEnv();
    }

    private PassportEnv() {
    }

    /* renamed from: c */
    public static PassportEnv m104518c() {
        return C28517a.f71671a;
    }

    @Override // com.ss.android.lark.account_provider.integrator.env.IEnv
    /* renamed from: a */
    public int mo101493a() {
        m104519d();
        return this.mDelegate.mo101493a();
    }

    @Override // com.ss.android.lark.account_provider.integrator.env.IEnv
    /* renamed from: b */
    public String mo101494b() {
        m104519d();
        return this.mDelegate.mo101494b();
    }

    /* renamed from: d */
    private void m104519d() {
        if (this.mDelegate == null) {
            boolean z = false;
            synchronized (PassportEnv.class) {
                if (this.mDelegate == null) {
                    this.mDelegate = C28518a.m104522a();
                    z = true;
                }
            }
            if (z) {
                Log.m165389i("AppEnv", "app env init finished");
            }
        }
    }
}
