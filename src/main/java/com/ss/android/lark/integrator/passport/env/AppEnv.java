package com.ss.android.lark.integrator.passport.env;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.ss.android.lark.integrator.passport.C39954b;
import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k;
import com.ss.android.lark.passport_api.IEnv;
import com.ss.android.lark.utils.LarkContext;

public class AppEnv implements IEnv {
    private IEnv mDelegate;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.passport.env.AppEnv$a */
    public static final class C39956a {

        /* renamed from: a */
        public static AppEnv f101660a = new AppEnv();
    }

    private AppEnv() {
    }

    /* renamed from: a */
    public static AppEnv m158575a() {
        return C39956a.f101660a;
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: d */
    public int mo145139d() {
        m158576g();
        return this.mDelegate.mo145139d();
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: e */
    public String mo145140e() {
        m158576g();
        return this.mDelegate.mo145140e();
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: f */
    public String mo145141f() {
        m158576g();
        return this.mDelegate.mo145141f();
    }

    /* renamed from: g */
    private void m158576g() {
        if (this.mDelegate == null) {
            boolean z = false;
            synchronized (AppEnv.class) {
                if (this.mDelegate == null) {
                    this.mDelegate = C39957a.m158583a(LarkContext.getApplication());
                    z = true;
                }
            }
            if (z) {
                Log.m165389i("AppEnv", "app env init finished");
            }
        }
    }

    /* renamed from: b */
    public boolean mo145137b() {
        AbstractC49397k a = C39959a.m158588a();
        if (C39954b.m158574a()) {
            return TextUtils.equals(a.mo101389F(), a.mo101393J());
        }
        return TextUtils.equals(a.mo101389F(), a.mo101394K());
    }

    /* renamed from: c */
    public int mo145138c() {
        InitSDKRequest.EnvType envType;
        int d = mo145139d();
        boolean I = C39959a.m158588a().mo101392I();
        if (d == 2) {
            if (I) {
                envType = InitSDKRequest.EnvType.OVERSEA_STAGING;
            } else {
                envType = InitSDKRequest.EnvType.STAGING;
            }
        } else if (d == 3) {
            if (I) {
                envType = InitSDKRequest.EnvType.OVERSEA;
            } else {
                envType = InitSDKRequest.EnvType.PRE_RELEASE;
            }
        } else if (I) {
            envType = InitSDKRequest.EnvType.OVERSEA;
        } else {
            envType = InitSDKRequest.EnvType.ONLINE;
        }
        return envType.getValue();
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: a */
    public void mo145136a(InitSDKRequest.C15029a aVar) {
        m158576g();
        this.mDelegate.mo145136a(aVar);
    }
}
