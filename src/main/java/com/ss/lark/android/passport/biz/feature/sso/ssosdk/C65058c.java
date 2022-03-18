package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService;
import com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.c */
public class C65058c extends C49020a implements AbstractC65052a.AbstractC65053a {

    /* renamed from: c */
    private final AuthInfo f163853c;

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65053a
    /* renamed from: c */
    public AuthInfo mo224159c() {
        return this.f163853c;
    }

    public C65058c(AuthInfo authInfo) {
        this.f163853c = authInfo;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65053a
    /* renamed from: a */
    public void mo224158a(String str, List<String> list, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback) {
        ISSOSDKAuthService pVar = (ISSOSDKAuthService) ServiceFinder.m193746a(ISSOSDKAuthService.class);
        if (pVar != null) {
            mo171171a(pVar.ssoConfirm(this.f123074a, str, list, iGetDataCallback));
        }
    }
}
