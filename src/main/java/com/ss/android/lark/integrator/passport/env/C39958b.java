package com.ss.android.lark.integrator.passport.env;

import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.passport_api.IEnv;

/* renamed from: com.ss.android.lark.integrator.passport.env.b */
public class C39958b implements IEnv {

    /* renamed from: a */
    private static String f101661a = "/log";

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: a */
    public void mo145136a(InitSDKRequest.C15029a aVar) {
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: d */
    public int mo145139d() {
        return 1;
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: f */
    public String mo145141f() {
        return f101661a;
    }

    @Override // com.ss.android.lark.passport_api.IEnv
    /* renamed from: e */
    public String mo145140e() {
        return C39959a.m158588a().mo101389F();
    }
}
