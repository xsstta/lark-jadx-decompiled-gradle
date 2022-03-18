package com.ss.android.lark.integrator.im;

import com.ss.android.lark.integrator.im.dependency.IEnvDependency;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.im.e */
class C39582e implements IEnvDependency {
    C39582e() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.IEnvDependency
    /* renamed from: a */
    public String mo143624a() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).rustSdkLogSubPath();
    }
}
