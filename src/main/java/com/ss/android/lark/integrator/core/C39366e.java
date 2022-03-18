package com.ss.android.lark.integrator.core;

import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.ss.android.lark.core.dependency.IEnvDependency;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.core.e */
class C39366e implements IEnvDependency {
    C39366e() {
    }

    @Override // com.ss.android.lark.core.dependency.IEnvDependency
    /* renamed from: a */
    public int mo132692a() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType();
    }

    @Override // com.ss.android.lark.core.dependency.IEnvDependency
    /* renamed from: b */
    public String mo132694b() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).serverUnit();
    }

    @Override // com.ss.android.lark.core.dependency.IEnvDependency
    /* renamed from: c */
    public String mo132695c() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).rustSdkLogSubPath();
    }

    @Override // com.ss.android.lark.core.dependency.IEnvDependency
    /* renamed from: a */
    public void mo132693a(InitSDKRequest.C15029a aVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).interceptRustInitRequest(aVar);
    }
}
