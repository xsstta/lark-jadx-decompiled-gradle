package com.ss.android.lark.security.set;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.util.C49187f;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.security.api.SecurityApi;
import com.ss.android.lark.security.set.AbstractC54070a;

/* renamed from: com.ss.android.lark.security.set.c */
public class C54076c extends C49020a implements AbstractC54070a.AbstractC54071a {
    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
    }

    @Override // com.ss.android.lark.security.set.AbstractC54070a.AbstractC54071a
    /* renamed from: a */
    public void mo185115a(String str, String str2, IGetDataCallback<BaseStepData> iGetDataCallback) {
        SecurityApi.m209801a(str, str2, this.f123074a, C49187f.m193934a((IGetDataCallback) mo171176d().wrapAndAddCallback(iGetDataCallback), BaseStepData.class));
    }
}
