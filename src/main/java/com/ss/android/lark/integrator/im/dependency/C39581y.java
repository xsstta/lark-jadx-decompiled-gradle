package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import com.ss.android.lark.phone.p2459a.AbstractC51337a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.integrator.im.dependency.y */
public class C39581y implements AbstractC51337a.AbstractC51340c {

    /* renamed from: a */
    final IVCApi f101045a = ((IVCApi) ApiUtils.getApi(IVCApi.class));

    @Override // com.ss.android.lark.phone.p2459a.AbstractC51337a.AbstractC51340c
    public void openJoinMeetingPage(Context context, String str) {
        this.f101045a.openJoinMeetingPage(context, str);
    }
}
