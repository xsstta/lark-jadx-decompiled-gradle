package com.ss.android.lark.security.verify;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.security.api.CheckSecurityPwdStep;
import com.ss.android.lark.security.api.SecurityApi;
import com.ss.android.lark.security.api.VerifySecurityPwdResultStep;
import com.ss.android.lark.security.verify.AbstractC54089a;

/* renamed from: com.ss.android.lark.security.verify.c */
public class C54095c extends C49020a implements AbstractC54089a.AbstractC54090a {
    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    public void cn_() {
        super.cn_();
    }

    /* renamed from: g */
    private boolean m209899g() {
        return ServiceFinder.m193748c().isLogin();
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54090a
    /* renamed from: a */
    public void mo185141a(IGetDataCallback<CheckSecurityPwdStep> iGetDataCallback) {
        if (m209899g()) {
            SecurityApi.m209800a(this.f123074a, (IGetDataCallback) mo171176d().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54090a
    /* renamed from: a */
    public void mo185142a(String str, String str2, String str3, IGetDataCallback<VerifySecurityPwdResultStep> iGetDataCallback) {
        if (m209899g()) {
            mo171171a(SecurityApi.m209802a(str, str2, str3, this.f123074a, iGetDataCallback));
        }
    }
}
