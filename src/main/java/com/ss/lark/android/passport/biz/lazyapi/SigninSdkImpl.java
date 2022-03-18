package com.ss.lark.android.passport.biz.lazyapi;

import com.ss.android.lark.passport.signinsdk_api.AbstractC49334a;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49360d;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;

public class SigninSdkImpl implements ISigninSdkApi {
    private AbstractC49360d mLog = new C65154b();

    @Override // com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi
    public AbstractC49360d getLog() {
        return this.mLog;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi
    public AbstractC49334a getChoosePolicyApi() {
        return new C65153a();
    }
}
