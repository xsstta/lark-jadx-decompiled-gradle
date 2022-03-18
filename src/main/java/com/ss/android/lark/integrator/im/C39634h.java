package com.ss.android.lark.integrator.im;

import com.ss.android.lark.integrator.im.dependency.AbstractC39574q;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.im.h */
class C39634h implements AbstractC39574q {
    C39634h() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39574q
    /* renamed from: a */
    public boolean mo143627a() {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).isGroupMailEnable();
    }
}
